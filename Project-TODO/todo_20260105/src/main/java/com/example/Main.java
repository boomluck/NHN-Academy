package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

enum Category {
    WORK(1, "업무"),
    STUDY(2, "학습"),
    PERSONAL(3, "개인"),
    HEALTH(4, "건강"),
    OTHER(5, "기타");

    private final int number;
    private final String displayName;

    Category(int number, String displayName) {
        this.number = number;
        this.displayName = displayName;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Category categoryFromNumber(int number) {
        if (number < 1 || number > values().length) {
            throw new IllegalArgumentException("잘못된 구분 번호: " + number);
        }
        return values()[number - 1];
    }
}

enum Priority {
    LOW(1, "낮음"),
    MEDIUM(2, "중간"),
    HIGH(3, "높음");

    private final int level;
    private final String displayName;

    Priority(int level, String displayName){
        this.level = level;
        this.displayName = displayName;
    }

    public int getLevel() {
        return level;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Priority priorityFromNumber(int number) {
        if (number < 1 || number > values().length) {
            throw new IllegalArgumentException("잘못된 구분 번호: " + number);
        }
        return values()[number - 1];
    }
}

class Todo {
    private static int counter = 1;
    private String title;
    private int hours;
    private boolean done;
    private int id;
    private Category category;
    private Priority priority;

    public Todo() {
        this.title = "제목 없음";
        this.hours = 0;
        this.done = false;
        this.id = counter++;
        this.category = Category.WORK;
        this.priority = Priority.LOW;
    }

    public Todo(String title, int hours, boolean done, Category category, Priority priority) {
        this.title = title;
        this.hours = hours;
        this.done = done;
        this.id = counter++;
        this.category = category;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public int getHours() {
        return hours;
    }

    public boolean getDone() {
        return done;
    }

    public int getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    public Category getCategory() {
        return category;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "[ 고유번호 : " + getId() + " | 제목 : " + getTitle() + " | 예상 소요 시간 : " + getHours() + " | 완료 여부 : " + getDone() + " | 카테고리 : " + getCategory() + " | 중요도 : " + getPriority() + " ]";
    }
}

class TodoServiceController {
    private final BufferedReader reader;

    public TodoServiceController(BufferedReader reader) {
        this.reader = reader;
    }

    public int menuInputValidator(int min, int max, String errorMessage, String promptMessage) throws IOException {
        while (true) {
            try {
                int input = Integer.parseInt(reader.readLine());
                if (input < min || input > max) {
                    System.out.println(errorMessage);
                    System.out.print(promptMessage + " >> ");
                }
                else {
                    return input;
                }
            }
            catch (NumberFormatException e) {
                System.out.println(errorMessage);
                System.out.print(promptMessage + " >> ");
                continue;
            }
        }
    }

    public Todo findTodoById(int id, List<Todo> todos) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                System.out.println(todo);
                return todo;
            }
        }
        System.out.println("해당 고유번호를 가진 데이터가 없습니다.");
        return null;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TodoServiceController todoServiceController = new TodoServiceController(reader);
        List<Todo> todos = new ArrayList<>();

        while(true) {
            System.out.println("=== Todo 앱 ===");
            System.out.println("1. 등록");
            System.out.println("2. 조회");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("0. 종료");
            System.out.print("선택 >> ");
            int mainMenuInput = todoServiceController.menuInputValidator(0, 4, "유효한 메뉴 번호를 입력해 주세요.", "선택");

            switch(mainMenuInput) {
                case 1 -> {
                    System.out.println("등록하시려는 건의 제목을 입력해 주세요"); // 동일한 제목 필터링 필요
                    System.out.print("제목 >> ");
                    String titleInput = reader.readLine();
                    System.out.println("해당 건을 완료하는 데에 필요한 예상 소요 시간을 입력해 주세요");
                    System.out.print("예상 소요 시간 >> ");
                    int hoursInput = todoServiceController.menuInputValidator(0, 24, "0부터 24까지의 정수를 입력해 주세요.", "예상 소요 시간");
                    System.out.println("해당 건의 카테고리를 선택해 주세요. 1.업무, 2.학습, 3.개인, 4.건강, 5.기타");
                    System.out.print("선택 >> ");
                    Category categoryInput = Category.categoryFromNumber(Integer.parseInt(reader.readLine()));
                    System.out.println("해당 건의 중요도를 선택해 주세요. 1.낮음, 2.중간, 3.높음");
                    System.out.print("선택 >> ");
                    Priority priorityInput = Priority.priorityFromNumber(Integer.parseInt(reader.readLine()));
                    todos.add(new Todo(titleInput, hoursInput, false, categoryInput, priorityInput));
                    System.out.println("등록되었습니다. 지금까지 총 " + todos.size() + " 개의 건이 등록되었습니다.");
                }
                case 2 -> {
                    System.out.println("조회 방법을 선택해 주세요. 1.전체, 2.건별");
                    System.out.print("선택 >> ");
                    int listInput = todoServiceController.menuInputValidator(1, 2, "유효한 메뉴 번호를 입력해 주세요.", "선택");
                    switch (listInput) {
                        case 1 -> {
                            if (todos.size() > 0) {
                                System.out.println("전체 건을 조회합니다.");
                                for(Todo todo : todos) {
                                    System.out.println(todo);
                                }
                            }
                            else {
                                System.out.println("등록된 건이 없습니다.");
                            }
                        }
                        case 2 -> {
                            System.out.println("조회를 원하시는 건의 고유번호를 입력해 주세요.");
                            System.out.print("고유번호 >> ");
                            int idInput = Integer.parseInt(reader.readLine());
                            todoServiceController.findTodoById(idInput, todos);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("수정을 원하시는 건의 고유번호를 입력해 주세요.");
                    System.out.print("고유번호 >> ");
                    int idInput = Integer.parseInt(reader.readLine());
                    Todo todo = todoServiceController.findTodoById(idInput, todos);
                    if (todo != null) {
                        System.out.println("무엇을 수정하시겠습니까? 1.제목, 2.예상 소요 시간, 3.상태, 4.카테고리, 5.중요도, 0.취소"); // 카테고리, 중요도 수정 가능하도록 기능 추가
                        System.out.print("선택 >> ");
                        int correctionInput = todoServiceController.menuInputValidator(0, 5, "유효한 메뉴 번호를 입력해 주세요.", "선택");
                        switch(correctionInput) {
                            case 1 -> {
                                System.out.println("새로운 제목을 입력해 주세요.");
                                System.out.print("제목 >> "); // 한글 입력 시 물음표 출력됨. 윈도우 종특인 것 같음.
                                String titleInput = reader.readLine();
                                todo.setTitle(titleInput);
                                System.out.println("제목을 변경하였습니다.");
                                System.out.println(todo);
                            }
                            case 2 -> {
                                System.out.println("새로운 예상 소요 시간을 입력해 주세요.");
                                System.out.print("예상 소요 시간 >> ");
                                int hoursInput = todoServiceController.menuInputValidator(0, 24, "0부터 24까지의 정수를 입력해 주세요.", "예상 소요 시간");
                                todo.setHours(hoursInput);
                                System.out.println("예상 소요 시간을 변경하였습니다.");
                                System.out.println(todo);
                            }
                            case 3 -> {
                                System.out.println("완료/미완료 상태를 선택해 주세요. 1.완료, 2.미완료");
                                System.out.print("선택 >> ");
                                int doneInput = todoServiceController.menuInputValidator(1, 2, "유효한 메뉴 번호를 입력해 주세요.", "선택");
                                switch(doneInput) {
                                    case 1 -> {
                                        todo.setDone(true);
                                        System.out.println("상태를 \"완료\"로 변경하였습니다.");
                                        System.out.println(todo);
                                    }
                                    case 2 -> {
                                        todo.setDone(false);
                                        System.out.println("상태를 \"미완료\"로 변경하였습니다.");
                                        System.out.println(todo);
                                    }
                                }
                            }
                            case 4 -> {
                                System.out.println("새로운 카테고리 영역을 선택해 주세요. 1.업무, 2.학습, 3.개인, 4.건강, 5.기타");
                                System.out.print("선택 >> ");
                                Category categoryInput = Category.categoryFromNumber(Integer.parseInt(reader.readLine()));
                                todo.setCategory(categoryInput);
                                System.out.println("카테고리를 변경하였습니다.");
                                System.out.println(todo);
                            }
                            case 5 -> {
                                System.out.println("새로운 중요도를 선택해 주세요. 1.낮음, 2.중간, 3.높음");
                                System.out.print("선택 >> ");
                                Priority priorityInput = Priority.priorityFromNumber(Integer.parseInt(reader.readLine()));
                                todo.setPriority(priorityInput);
                                System.out.println("중요도를 변경하였습니다.");
                                System.out.println(todo);
                            }
                            case 0 -> {
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                break;
                            }
                        }
                    }
                }
                case 4 -> {
                    System.out.println("삭제를 원하시는 건의 고유번호를 입력해 주세요.");
                    System.out.print("고유번호 >> "); 
                    int idInput = Integer.parseInt(reader.readLine());
                    Todo todo = todoServiceController.findTodoById(idInput, todos);
                    if (todo != null) {
                        System.out.println("삭제 후에는 복원할 수 없습니다. 진행하시겠습니까? 1.삭제, 0.취소");
                        System.out.print("선택 >> ");
                        int deletionInput = todoServiceController.menuInputValidator(0, 1, "유효한 메뉴 번호를 입력해 주세요.", "선택");
                        switch (deletionInput) {
                            case 1 -> {
                                todos.remove(todo);
                                System.out.println("삭제되었습니다.");
                                }
                            case 0 -> {
                                System.out.println("삭제 요청을 취소하였습니다.");
                            }
                        }
                    }
                }
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> {
                    System.out.println("유효한 메뉴 번호를 입력해 주세요.");
                }
            }
            System.out.println();
        }
    }
}
package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.ArrayList;

class Todo {
    private static int counter = 1;
    private String title;
    private int hours;
    private boolean done;
    private int id;

    public Todo() {
        this.title = "제목 없음";
        this.hours = 0;
        this.done = false;
        this.id = counter++;
    }

    public Todo(String title, int hours, boolean done) {
        this.title = title;
        this.hours = hours;
        this.done = done;
        this.id = counter++;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "[ 고유번호 : " + getId() + " | 제목 : " + getTitle() + " | 예상 소요 시간 : " + getHours() + " | 완료 여부 : " + getDone() + " ]";
    }
}

class TodoService {
    private final BufferedReader reader;

    public TodoService(BufferedReader reader) {
        this.reader = reader;
    }

    public int inputValidator(int min, int max, String errorMessage, String promptMessage) throws IOException {
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
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        TodoService inputController = new TodoService(reader);
        ArrayList<Todo> todos = new ArrayList<>();

        while(true) {
            System.out.println("=== Todo 앱 ===");
            System.out.println("1. 등록");
            System.out.println("2. 조회");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("0. 종료");
            System.out.print("선택 >> ");
            int mainMenuInput = inputController.inputValidator(0, 4, "유효한 메뉴 번호를 입력해 주세요.", "선택");

            switch(mainMenuInput) {
                case 1 -> {
                    System.out.println("등록하시려는 건의 제목을 입력해 주세요"); // 동일한 제목 필터링 필요
                    System.out.print("제목 >> ");
                    String titleInput = reader.readLine();
                    System.out.println("해당 건을 완료하는 데에 필요한 예상 소요 시간을 입력해 주세요"); // enum 카테고리 필요
                    System.out.print("예상 소요 시간 >> ");
                    int hoursInput = inputController.inputValidator(0, 24, "0부터 24까지의 정수를 입력해 주세요.", "예상 소요 시간");
                    todos.add(new Todo(titleInput, hoursInput, false));
                    System.out.println("지금까지 총 " + todos.size() + " 개의 건이 등록되었습니다.");
                }
                case 2 -> {
                    System.out.println("조회 방법을 선택해 주세요. 1.전체, 2.건별");
                    System.out.print("선택 >> ");
                    int listInput = inputController.inputValidator(1, 2, "유효한 메뉴 번호를 입력해 주세요.", "선택");
                    switch (listInput) {
                        case 1 -> {
                            System.out.println("전체 건을 조회합니다.");
                            for(Todo todo : todos) {
                                System.out.println(todo);
                            }
                        }
                        case 2 -> {
                            System.out.println("조회를 원하시는 건의 고유번호를 입력해 주세요.");
                            System.out.print("고유번호 >> ");
                            int idInput = inputController.inputValidator(todos.get(0).getId(), todos.get(todos.size() - 1).getId(), "해당 고유번호를 가진 데이터가 없습니다.", "고유번호");
                            boolean target = false;
                            for (Todo todo : todos) {
                                if (todo.getId() == idInput) {
                                    System.out.println(todo);
                                    target = true;
                                    break;
                                }
                            }
                            if (!target) {
                                System.out.println("해당 고유번호를 가진 데이터가 없습니다.");
                            }
                        }
                    }
                }
                case 3 -> {
                    System.out.println("수정을 원하시는 건의 고유번호를 입력해 주세요.");
                    System.out.print("고유번호 >> ");
                    int idInput = inputController.inputValidator(todos.get(0).getId(), todos.get(todos.size() - 1).getId(), "해당 고유번호를 가진 데이터가 없습니다.", "고유번호");
                    boolean target = false;
                    for (Todo todo : todos) {
                        if (todo.getId() == idInput) {
                            System.out.println(todo);
                            target = true;
                            System.out.println("선택된 건 = " + todos.get(idInput));
                            System.out.println("무엇을 수정하시겠습니까? 1.제목, 2.예상 소요 시간, 3.상태");
                            System.out.print("선택 >> ");
                            int correctionInput = inputController.inputValidator(1, 3, "유효한 메뉴 번호를 입력해 주세요.", "선택");
                            switch(correctionInput) {
                                case 1 -> {
                                    System.out.println("새로운 제목을 입력해 주세요.");
                                    System.out.print("제목 >> "); // 한글 입력 시 물음표 출력됨. 윈도우 종특인 것 같음.
                                    String titleInput = reader.readLine();
                                    todos.get(idInput).setTitle(titleInput);
                                    System.out.println("제목을 변경하였습니다.");
                                    System.out.println(todos.get(idInput));
                                }
                                case 2 -> {
                                    System.out.println("새로운 예상 소요 시간을 입력해 주세요.");
                                    System.out.print("예상 소요 시간 >> ");
                                    int hoursInput = inputController.inputValidator(0, 24, "0부터 24까지의 정수를 입력해 주세요.", "예상 소요 시간");
                                    todos.get(idInput).setHours(hoursInput);
                                    System.out.println("예상 소요 시간을 변경하였습니다.");
                                    System.out.println(todos.get(idInput));
                                }
                                case 3 -> {
                                    System.out.println("완료/미완료 상태를 선택해 주세요. 1.완료, 2.미완료");
                                    System.out.print("선택 >> ");
                                    int doneInput = inputController.inputValidator(1, 2, "유효한 메뉴 번호를 입력해 주세요.", "선택");
                                    switch(doneInput) {
                                        case 1 -> {
                                            todos.get(idInput).setDone(true);
                                            System.out.println("상태를 \"완료\"로 변경하였습니다.");
                                            System.out.println(todos.get(idInput));
                                        }
                                        case 2 -> {
                                            todos.get(idInput).setDone(false);
                                            System.out.println("상태를 \"미완료\"로 변경하였습니다.");
                                            System.out.println(todos.get(idInput));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!target) {
                        System.out.println("해당 고유번호를 가진 데이터가 없습니다.");
                    }
                }
                case 4 -> {
                    System.out.println("삭제를 원하시는 건의 고유번호를 입력해 주세요.");
                    System.out.print("고유번호 >> ");
                    int idInput = inputController.inputValidator(todos.get(0).getId(), todos.get(todos.size() - 1).getId(), "해당 고유번호를 가진 데이터가 없습니다.", "고유번호");
                    boolean target = false;
                    for (Todo todo : todos) {
                        if (todo.getId() == idInput) {
                            System.out.println(todo);
                            target = true;
                            System.out.println("삭제 후에는 복원할 수 없습니다. 진행하시겠습니까? 1.삭제, 2.취소");
                            System.out.print("선택 >> "); // 삭제 후 배열 요소가 재분배되어 고유번호와 일치하지 않는 문제
                            int deletionInput = inputController.inputValidator(1, 2, "유효한 메뉴 번호를 입력해 주세요.", "선택");
                            target = false;
                            switch (deletionInput) {
                                case 1 -> {
                                    todos.remove(todo);
                                    System.out.println("삭제되었습니다.");
                                    }
                                case 2 -> {
                                    System.out.println("삭제 요청을 취소하였습니다.");
                                }
                            }
                        }
                    }
                    if (!target) {
                        System.out.println("해당 고유번호를 가진 데이터가 없습니다.");
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
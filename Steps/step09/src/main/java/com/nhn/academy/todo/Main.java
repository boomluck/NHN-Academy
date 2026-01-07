// 배운 것들 구조는 대충 생각은 나는데 어디다 어떻게 넣어야 프로그램이 자연스럽게 흘러가게 될지 모름.
// 일부 구조는 기억이 안 남. 단편적인 조각들만 기억남.
// 일단 확실한 건 나는 객체를 능숙하게 다루고 있지 않음.

package com.nhn.academy.todo;

import com.nhn.academy.todo.service.TodoService;
import com.nhn.academy.todo.exception.TodoNotFoundException;
import com.nhn.academy.todo.model.Todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Todo> todos = new ArrayList<>(); // 이걸 여기에 넣는 것이 과연 옳은가
        Todo

        while (true) {
            System.out.println("=== Todo 앱 ===");
            System.out.println("1. 등록");
            System.out.println("2. 조회");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("0. 종료");
            System.out.print("선택 >> ");

            int input = Integer.parseInt(reader.readLine());

            // 이 부분을 사용자 정의 Exception으로 만들 수 있을 것 같은데
            while (input < 0 || input > 4) {
                System.out.println("유효하지 않은 값입니다. 0부터 4 사이의 정수를 입력하세요.");
                System.out.print("선택 >> ");
                input = Integer.parseInt(reader.readLine());
            }

            int count = 0;
            count++;

            switch (input) {
                case 1 -> {
                    System.out.println("등록을 원하는 건의 이름을 입력해 주세요.");
                    System.out.print("이름 >> ");
                    String title = reader.readLine();
                    System.out.println("해당 건을 완료하는 데에 필요한 시간을 입력해 주세요.");
                    System.out.print("예상 시간 >> ");
                    int hours = Integer.parseInt(reader.readLine());
                    todos.add(new Todo(title, hours, false));
                    System.out.println("지금까지 " + todos.getCounter() + " 건이 등록되었습니다");
                }
                case 2 -> {
                    System.out.println("등록된 모든 건을 조회합니다.");

                    for (Todo todo : todos) {
                        System.out.println(todo);
                    }

                }
                case 3 -> {
                    System.out.println("수정을 원하시는 건의 고유번호를 입력해 주세요.");
                    System.out.print("고유번호 >> ");
                    int id = Integer.parseInt(reader.readLine());
                    if (id < 0 || id > todos.size()) {
                        System.out.println("해당 고유번호(" + id + ")를 가진 건을 찾지 못하였습니다.");
                        break;
                    } else {
                        for (int i = 0; i <= todos.size(); i++) {
                            if (i == todos.get(i).getId()) {
                                System.out.println(todos.get(i).toString());
                            }
                        }
                        System.out.println("무엇을 수정하시겠습니까? 1. 제목, 2. 시간, 3. 상태 (무효값 입력 시 메인 메뉴)");
                        System.out.print("선택 >> ");
                        int correctionNumber = Integer.parseInt(reader.readLine());

                        switch (correctionNumber) {
                            case 1 -> {
                                System.out.println("해당 건의 새로운 제목을 입력해 주세요.");
                                System.out.print("새로운 제목 >> ");
                                String title = reader.readLine();
                                todos.get(id - 1).setTitle(title);
                                System.out.println("새로운 제목(" + title + ")(으)로 수정하였습니다.");
                                System.out.println(todos.get(id - 1));
                            }
                            case 2 -> {
                                System.out.println("해당 건의 새로운 예상 소요 시간을 입력해 주세요.");
                                System.out.print("예싱 소요 시간 >> ");
                                int hours = Integer.parseInt(reader.readLine());
                                todos.get(id - 1).setHours(hours);
                                System.out.println("새로운 예상 소요 시간(" + hours + " 시간)으로 수정하였습니다.");
                                System.out.println(todos.get(id - 1));
                            }
                            case 3 -> {
                                System.out.println("해당 건의 완료 여부를 입력해 주세요. 0. 미완료, 1. 완료");
                                System.out.print("완료 여부 >> ");
                                int status = Integer.parseInt(reader.readLine());
                                if (status == 1) {
                                    todos.get(id - 1).setDone(true);
                                } else {
                                    todos.get(id - 1).setDone(false);
                                }
                                System.out.println("완료 여부를 수정하였습니다.");
                                System.out.println(todos.get(id - 1));
                            }
                            default -> {
                            }
                        }
                    }
                }
                case 4 -> {
                    System.out.println("삭제를 원하시는 건의 고유번호를 입력해 주세요.");
                    System.out.print("고유번호 >> ");
                    int numberToRemove = Integer.parseInt(reader.readLine());
                    todos.remove(numberToRemove - 1);
                    System.out.println("삭제되었습니다. 현재 남은 건은 총 " + todos.size() + " 건입니다.");
                }
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
            }
        }
    }
}
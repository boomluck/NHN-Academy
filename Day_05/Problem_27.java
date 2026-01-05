// 이 코드는 정상 작동 어려움.
// 이유 : 자바 특성상, 패키지 내 클래스는 유일해야 하는데
// 연습한다고 같은 이름의 클래스(Todo)를 여러 파일에 각각 정의해 두었기 때문에
// 계속 충돌 오류가 발생함.

// Todo class를 분리 후(24번에도 Todo가 있었으나 그것도 분리 합체) 재실행해 보니 정상 작동.

package Day_05;

import java.util.ArrayList;

public class Problem_27 {
    public static void main(String[] args) {
        ArrayList<Todo> todoList = new ArrayList<>();

        todoList.add(new Todo("Java", 3, false));
        todoList.add(new Todo("Spring", 5, true));

        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(todoList.get(i));
        }
    }
}

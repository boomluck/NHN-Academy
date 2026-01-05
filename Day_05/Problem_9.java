import java.util.ArrayList;

public class Problem_9 {
    public static void main(String[] args) {
        ArrayList<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo("공부", 3, false));
        todoList.add(new Todo("운동", 1, true));
        todoList.add(new Todo("독서", 2, false));
        todoList.add(new Todo("청소", 1, true));

        // 완료된 항목만 출력하는 코드 작성
        for (Todo todo : todoList) {
            if (todo.isDone() == true) {
                System.out.println(todo);
            }
        }
    }
}

import java.util.*;

public class LambdaExercise16 {
    static class Todo {
        private String title;
        private int hours;

        public Todo(String title, int hours) {
            this.title = title;
            this.hours = hours;
        }

        public String getTitle() { return title; }
        public int getHours() { return hours; }
    }

    public static void main(String[] args) {
        List<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo("Java 공부", 3));
        todoList.add(new Todo("운동하기", 1));
        todoList.add(new Todo("독서", 2));

        // 익명 클래스 버전
        Comparator<Todo> comparator = new Comparator<Todo>() {
            @Override
            public int compare(Todo t1, Todo t2) {
                return t1.getTitle().compareTo(t2.getTitle());
            }
        };

        // TODO: 위 코드를 람다 표현식으로 변환하세요
        Comparator<Todo> lambdaComparator = (t1, t2) -> t1.getTitle().compareTo(t2.getTitle()); // todolist.sort(t1, t2)가 빠져 있는 것 같음

        // 정렬 및 출력
        todoList.sort(lambdaComparator);
        System.out.println("=== 제목순 정렬 ===");
        for (Todo todo : todoList) {
            System.out.println(todo.getTitle());
        }
    }
}
import java.util.ArrayList;

public class Problem_24 {
    public static void main(String[] args) {
        ArrayList<Todo> todoList = new ArrayList<>();

        todoList.add(new Todo("공부"));
        todoList.add(new Todo("식사"));

        System.out.println("해야 할 일 총 " + todoList.size() + "개");
    }
}
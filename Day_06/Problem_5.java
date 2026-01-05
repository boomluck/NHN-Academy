package Day_06;

public class Problem_5 {
    public static void main(String[] args) {
        TodoService todoService = new TodoService();
        Todo todo1 = new Todo("공부", 3, false);
        System.out.println(todo1.getId());
    }
}

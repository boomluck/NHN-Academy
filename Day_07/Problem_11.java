package Day_07;

public class Problem_11 {
    public static void main(String[] args) {
        Todo todo = new Todo("Java 공부", Category.STUDY, Priority.HIGH);
        System.out.println(todo.getCategory().getDisplayName()); // getCategory() 어디에 넣어야 되나. 초면이신 거 같은데
        System.out.println(todo.getPriority().getLevel()); // getPriority() 마찬가지
    } // getCategory()랑 getPriority()를 Todo class에 넣었더니 됨
      // ADT의 힘인가
}

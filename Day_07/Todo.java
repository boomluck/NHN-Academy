package Day_07;

public class Todo {
    private static int idCounter = 1;
    private int id;
    private String title;
    private Category category;
    private Priority priority;

    public Todo(String title, Category category, Priority priority) {
        this.title = title;
        this.category = category;
        this.priority = priority;
        this.id = idCounter++;
    }

    public int getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public Priority getPriority() {
        return priority;
    }
}

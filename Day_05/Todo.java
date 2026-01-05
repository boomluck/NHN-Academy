package Day_05;

class Todo {
    private String title;
    private int hours;
    private boolean done;

    public Todo(String title, int hours, boolean done) {
        this.title = title;
        this.hours = hours;
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return done;
    }

    @Override
    public String toString() {
        return getTitle() + " - " + (isDone() ? "완료" : "미완료");
    }
}
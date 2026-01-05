package Day_08;

public class TodoNotFoundException extends RuntimeException {
    public TodoNotFoundException(String message) {
        super(message);
    }

    public TodoNotFoundException(int id) {
        super("Todo를 찾을 수 없습니다." + id);
    }
}

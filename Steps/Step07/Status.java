package Day_07;

public enum Status {
    TODO("할 일"),
    IN_PROGRESS("진행 중"),
    DONE("완료");

    private final String displayName;
    // private final String status;
    // 불필요한 코드. Status()에서 this.status = status;로 생각했으나
    // displayName이 이미 그 역할을 하고 있음.

    Status(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
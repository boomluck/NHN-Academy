package Day_07;

public enum Priority {
    LOW(1, "낮음"),
    MEDIUM(2, "보통"),
    HIGH(3, "높음");

    private final int level;
    private final String displayName;

    Priority(int level, String displayName) {
        this.level = level;
        this.displayName = displayName;
    }

    // 이게 문제 5번인데, 문제에서는 Priority를 정의하라고 level과 displayName을 매개변수로 가진다고 했는데
    // 왜 정답에는 getLevel()과 getDisplayName()까지 작성되어 있는 거냐...
    // 여기까지 작성해도 되는 게 아닌지...

    // 아래는 11번 문제 내용 중 Priority에 getLevel() 추가하기

    public int getLevel() {
        return level;
    }

    // 아래는 14번 문제 내용 중 fromLevel(int level) 추가하기

    public static Priority fromLevel(int level) {
        if (level < 1 || level > values().length) {
            throw new IllegalArgumentException("형식에 맞지 않는 번호 : " + level);
        }
        return values()[level - 1];
    }
}

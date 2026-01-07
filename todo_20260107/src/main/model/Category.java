public enum Category {
    WORK(1, "업무"),
    STUDY(2, "학습"),
    PERSONAL(3, "개인"),
    HEALTH(4, "건강"),
    OTHER(5, "기타");

    private final int number;
    private final String displayName;

    Category(int number, String displayName) {
        this.number = number;
        this.displayName = displayName;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Category categoryFromNumber(int number) {
        if (number < 1 || number > values().length) {
            throw new IllegalArgumentException("잘못된 구분 번호: " + number);
        }
        return values()[number - 1];
    }
}
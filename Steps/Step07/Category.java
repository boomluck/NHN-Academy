package Day_07;

public enum Category {
    WORK("업무"), // 4번 문제에서 displayName 관련 내용 추가됨
    STUDY("학습"),
    PERSONAL("개인"),
    HEALTH("건강"),
    OTHER("기타"); // 함수화했을 때 마지막 열거 요소에는 ; 필요함

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    /*
     * public static Category fromNumber(int number) {
     * switch (number) {
     * case 0 : return Category.valueOf("WORK");
     * case 1 : return Category.valueOf("STUDY");
     * case 2 : return Category.valueOf("PERSONAL");
     * case 3 : return Category.valueOf("HEALTH");
     * case 4 : return Category.valueOf("OTHER");
     * }
     * }
     * 
     * 위와 같이 시도했으나 당연히 안 됨.
     * enum에도 인덱스가 마지막에 붙는구나... [0] [1] [2] ...
     * 이 사실을 알았더라도 한 번에 코드를 작성하진 못 했을 것...
     * 수업 때 설명해 주신 것 같기도 하고 초면인 것 같기도 하고...
     */

    // 12번 문제 해결을 위해 내용 복붙
    public static Category fromNumber(int number) {
        if (number < 1 || number > values().length) {
            throw new IllegalArgumentException("잘못된 구분 번호: " + number);
        }
        return values()[number - 1]; // else 없이 그냥 쓰는 게 특이하네. throw가 메서드 종료 역할을 한다고 함.
    }
}
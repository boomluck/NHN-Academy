package Day_07;

public class Problem_12 {
    public static void main(String[] args) {
        int num = 2; // 사용자가 2를 입력했다고 가정
        Category category = Category.fromNumber(num);
        System.out.println("선택: " + category.getDisplayName());
    }
}

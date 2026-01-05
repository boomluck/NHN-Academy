package Day_08;

public class Problem_1 {
    public static void main(String[] args) {
        String input = "abc";
        try {
            int number = Integer.parseInt(input);
            System.out.println("결과: " + number);
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닙니다." + e);
        }
    }
}

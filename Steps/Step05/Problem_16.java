public class Problem_16 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        // 5, 4, 3, 2, 1 순서로 출력하는 코드 작성
        for (int i = numbers.length; i > 0; i--) {
            if (i == 1) {
                System.out.print(numbers[i - 1]);
            } else {
                System.out.print(numbers[i - 1] + ", ");
            }
        }
    }
}

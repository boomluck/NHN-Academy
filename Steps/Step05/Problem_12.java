public class Problem_12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

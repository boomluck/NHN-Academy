import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;

        while (true) {
            System.out.print("시작값 : ");
            String input = reader.readLine();
            int start = Integer.parseInt(input);

            if (input.equals("quit")) {
                return;
            }

            System.out.print("종료값 : ");
            input = reader.readLine();
            int end = Integer.parseInt(input);

            if (input.equals("quit")) {
                return;
            }

            if (start > end) {
                System.out.println("종료값은 시작값보다 커야 합니다.");
            } else {
                for (int i = start; start <= end; start++) {
                    total += start;
                }
                System.out.println("합계: " + total);
                total = 0;
            }
        }
    }
}
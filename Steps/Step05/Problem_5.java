import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problem_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("구구단의 단수를 입력하세요. (2~9) >> ");
        int i = Integer.parseInt(reader.readLine());

        for (int j = 1; j <= 9; j++) {
            System.out.println(i + " x " + j + " = " + i * j);
        }
    }
}

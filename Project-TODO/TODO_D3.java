import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TODO_D3 {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("=== TODO 앱 ===");
            System.out.println("1. 등록");
            System.out.println("2. 조회");
            System.out.println("0. 종료");
            System.out.print("선택 > ");
            int selection = Integer.parseInt(input.readLine());

            switch (selection) {
                case 1 -> System.out.println("[등록] 메뉴 선택됨");
                case 2 -> System.out.println("[조회] 메뉴 선택됨");
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("존재하지 않는 메뉴입니다. 0부터 2까지의 숫자로 입력해 주세요.");
            }
        }
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Problem_23 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> ques = new ArrayList<>();

        while (true) {
            System.out.println("메뉴 : 0.입장 1.퇴장 2.종료");
            System.out.print("선택 >> ");
            String input = reader.readLine();
            int intInput = Integer.parseInt(input);

            switch (intInput) {
                case 0 -> {
                    System.out.print("대기자 이름은요? >> ");
                    input = reader.readLine();
                    ques.add(input);
                    System.out.println(input + "님을 대기자 명단에 추가하였습니다.");
                }
                case 1 -> {
                    if (ques.isEmpty()) {
                        System.out.println("대기중인 인원이 없습니다.");
                    } else {
                        System.out.println(ques.remove(0) + "님을 대기자 명단에서 삭제하였습니다.");
                    }
                }
                case 2 -> {
                    System.out.println("종료합니다.");
                    return;
                }
            }
        }
    }
}

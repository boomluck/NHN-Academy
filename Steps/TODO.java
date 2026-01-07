
// 이 코드는 TODO 프로젝트의 일환이며, D4일차에 아무 것도 없는 '백지 상태'에서 스스로 직접 작성한 코드입니다.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TODO {
    private String title;
    private int hours;
    private boolean done;
    private static int count;

    public TODO() {
        title = "제목 없음";
        hours = 0;
        done = false;
        count++;
    }

    public TODO(String title, int hours, boolean done) {
        this.title = title;
        this.hours = hours;
        this.done = done;
        count++;
    }

    public String getTitle() {
        return title;
    }

    public int getHours() {
        return hours;
    }

    public boolean isDone() {
        return done;
    }

    public static int getCount() {
        return count;
    }

    public void setTitle() {
        System.out.println("원하는 제목을 입력해 주세요.");
        this.title = title;
    }

    public void setHours() {
        if (hours > 0 && hours <= 24) {
            this.hours = hours;
        } else {
            System.out.println("0부터 24까지의 값으로 입력해 주세요.");
        }
    }

    public void setDone() {
        System.out.println("해당 건의 완료 여부를 완료(1), 미완료(0)으로 선택해 주세요.");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input;

        while (true) {
            System.out.println("=== TODO 앱 ===");
            System.out.println("1. 등록");
            System.out.println("2. 조회");
            System.out.println("0. 종료");
            System.out.print("선택 > ");

            input = Integer.parseInt(reader.readLine());

            switch (input) {
                case 1 -> {
                    System.out.println("등록 메뉴가 선택되었습니다.");
                    System.out.println("등록하시려는 건의 이름을 입력해 주세요. (* : 메인 메뉴)");
                    System.out.print("입력 > ");
                    String title = reader.readLine();
                    TODO todo1 = new TODO(title, 0, false);
                    System.out.println("[" + todo1.getTitle() + "]이/가 추가되었습니다.");
                    TODO.count++;
                    break;
                }
                case 2 -> {
                    System.out.println("조회 메뉴가 선택되었습니다.");
                    System.out.println("현재" + 

                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
            }
        }
    }
}

import java.util.ArrayList;

public class Problem_15 {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("아침 운동");
        tasks.add("이메일 확인");
        tasks.add("회의 참석");

        // "1. 아침 운동" 형태로 출력하는 코드 작성
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}

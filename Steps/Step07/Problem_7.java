package Day_07;

// 7번도 문제 의도 이해 못함
// 대충 터미널 출력물에 correct는 아무 이상 없이 넘어가고
// wrong은 에러 메시지 뜬다는 걸 보여준다는 마음으로 작성함

public class Problem_7 {
    public static void main(String[] args) {
        try {
            Category correct = Category.valueOf("WORK");
            Category wrong = Category.valueOf("work");
        } catch (IllegalArgumentException e) {
            System.out.println("오류 : " + e.getMessage());
        }
    }
}

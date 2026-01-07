package Day_08;

public class Calculator {
    public void divide(int a, int b) {
        System.out.println("계산 시작");

        // TODO: try-catch-finally를 사용하여
        // 1. a / b 계산 및 결과 출력
        // 2. ArithmeticException 발생 시 "0으로 나눌 수 없습니다" 출력
        // 3. 예외 발생 여부와 관계없이 "계산 종료" 출력

        try {
            int result = a / b;
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        } finally {
            System.out.println("계산 종료");
        }
    }
}
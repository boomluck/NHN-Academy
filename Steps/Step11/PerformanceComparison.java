public class PerformanceComparison {
    public static void main(String[] args) {
        int iterations = 1000;

        String string = null;

        // TODO: 방법 A - String 연결 (비효율적)
        // 시작 시간 측정
        long start = System.currentTimeMillis();

        // for 루프로 문자열 연결
        for (int i = 0; i < iterations; i++) {
            string += Integer.toString(i);
        }

        // 종료 시간 측정
        long end = System.currentTimeMillis();

        // 소요 시간 출력
        System.out.println("소요 시간: " + (end - start) + "ms");

        // TODO: 방법 B - StringBuilder (효율적)
        StringBuilder msg = new StringBuilder();

        // 시작 시간 측정
        start = System.currentTimeMillis();

        // for 루프로 StringBuilder 사용
        // toString() 호출
        for (int i = 0; i < iterations; i++) {
            msg.append(Integer.toString(i));
        }

        // 종료 시간 측정
        end = System.currentTimeMillis();

        // 소요 시간 출력
        System.out.println("소요 시간: " + (end - start) + "ms");

        // TODO: 성능 차이 출력
    }
}
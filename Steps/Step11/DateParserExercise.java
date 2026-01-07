public class DateParserExercise {
    public static void main(String[] args) {
        String isoDate = "2024-01-15";

        // TODO: substring()을 사용하여 연도, 월, 일을 추출하세요
        String year = isoDate.substring(0, 4);
        String month = isoDate.substring(5,7);
        String day = isoDate.substring(8,10);

        // TODO: "2024년 1월 15일" 형식으로 출력하세요
        System.out.println(year + "년 " + month + "월 " + day + "일");
    }
}
public class Problem01 {
    public static void main(String[] args) {
        String csvLine = "홍길동,30,서울,true";

        // TODO: split()을 사용하여 csvLine을 파싱하세요
        String[] parts = csvLine.split(",");

        // TODO: 각 필드를 변수에 저장하세요
        String name = parts[0];// String name = ...
        int age = Integer.parseInt(parts[1]);// int age = ...
        String city = parts[2];// String city = ...
        boolean isActive = Boolean.parseBoolean(parts[3]);// boolean isActive = ...

        // TODO: 결과를 출력하세요
        // 이름: 홍길동, 나이: 30, 도시: 서울, 활성: true
        System.out.println("이름: " + name + ", 나이: " + age + ", 도시: " + city + ", 활성: " + isActive);
    }
}

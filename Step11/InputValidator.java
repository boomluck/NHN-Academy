public class InputValidator {
    public static void main(String[] args) {
        String todoTitle = "  Java 공부  ";
        String url = "https://example.com/api";
        String filename = "report.pdf";

        // TODO: todoTitle의 앞뒤 공백을 제거하세요
        String trimmedTodoTitle = todoTitle.trim();
        System.out.println(trimmedTodoTitle);

        // TODO: "Java"라는 키워드가 포함되어 있는지 확인하세요
        if (todoTitle.contains("Java")) {
            System.out.println("Java를 포함하고 있습니다.");
        }
        else {
            System.out.println("해당 문자열이 없습니다.");
        }

        // TODO: URL이 https로 시작하는지 확인하세요
        if (url.startsWith("https")) {
            System.out.println("https로 시작합니다.");
        }
        else {
            System.out.println("https로 시작하지 않습니다.");
        }

        // TODO: 파일이 .pdf 확장자로 끝나는지 확인하세요
        if (filename.endsWith(".pdf")) {
            System.out.println("pdf확장자입니다.");
        }
        else {
            System.out.println("pdf확장자가 아닙니다.");
        }

        // TODO: 검증 결과를 출력하세요
    }
}
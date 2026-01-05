public class MessageBuilder {
    public static void main(String[] args) {
        // 테스트 케이스 1: 제목만 있는 경우
        String msg1 = buildMessage("Java 공부", null, null);
        System.out.println(msg1);

        // 테스트 케이스 2: 카테고리와 완료 여부만 있는 경우
        String msg2 = buildMessage(null, "STUDY", true);
        System.out.println(msg2);

        // 테스트 케이스 3: 모든 정보가 있는 경우
        String msg3 = buildMessage("프로젝트 마무리", "WORK", false);
        System.out.println(msg3);
    }

    public static String buildMessage(String title, String category, Boolean done) {
        // TODO: StringBuilder를 사용하여 동적으로 메시지를 생성하세요
        // 기본: "TODO: "로 시작
        StringBuilder msg = new StringBuilder("TODO: ");

        // title이 있으면: 제목 추가
        if (title != null) {
            msg.append(title).append(" ");
        }

        // category가 있으면: " [카테고리명]" 추가
        if (category != null) {
            msg.append(category).append(" ");
        }

        // done이 있으면: done=true면 " ✓", false면 " ○" 추가
        if (done != null) {
            msg.append(done ? " ✓" : " ○");
        }

        return msg.toString();  // TODO: 완성된 메시지 반환
    }
}
package Day_08;

public class NetworkConnection {
    private boolean connected = false;

    public void connect() {
        connected = true;
        System.out.println("네트워크 연결됨");
    }

    public void disconnect() {
        connected = false;
        System.out.println("네트워크 연결 해제됨");
    }

    public String sendRequest(String request) {
        if (!connected) {
            throw new IllegalStateException("연결되지 않음");
        }
        if (request.contains("ERROR")) {
            throw new RuntimeException("요청 실패");
        }
        return "응답: " + request;
    }

}

    // 아래 코드를 완성하세요
public void executeRequest(String request) {
    NetworkConnection network = new NetworkConnection();

    // TODO: try-catch-finally를 사용하여
    // 1. network.connect() 호출
    // 2. network.sendRequest(request) 실행 및 결과 출력
    // 3. 예외 발생 시 "요청 오류" 출력
    // 4. 예외 발생 여부와 관계없이 network.disconnect() 호출
}

// 이 문제에서의 난관.
// 1. 파일 분리? 분리함? 안 함? -> 하는 게 좋음
// 2. 함수가 단독으로 밖에 나와 있을 수 있나? 클래스 안에 넣어야 하는가? 그냥 있어도 되는가? -> 클래스 안에 있어야 함
// 3. 메인 함수 없어도 되나? 테스트 해 보라고는 하는데 주어진 코드만으로는 테스트가 안 되는데 -> 테스트를 위해서는 메인 필요함
// 4. request에 값을 지정해 준 적이 없는데 request자체로 매개 변수로 쓴다는 개념이 무엇인지? -> 반드시 지정이 될
// 항목이지만 문제에서는 흐름만 보여주기 위해 비운 것.

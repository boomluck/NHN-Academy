package Day_08;

public void Problem_2_3(String request) { 
    // 이 함수의 이름은 excuteRequest였으나 본인의 편의를 위해 임의로 변경.

    public static void main(String[] args) {
        NetworkConnection network = new NetworkConnection();

        // TODO: try-catch-finally를 사용하여
        // 1. network.connect() 호출
        // 2. network.sendRequest(request) 실행 및 결과 출력
        // 3. 예외 발생 시 "요청 오류" 출력
        // 4. 예외 발생 여부와 관계없이 network.disconnect() 호출

        network.connect();

        try {
            network.sendRequest("ConnectionERROR");
        } catch (RuntimeException e) {
            System.out.println("요청 오류");
        } finally {
            network.disconnect();
        }
    }
}
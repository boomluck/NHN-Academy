import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TodoApp {
    static class Todo {
        int id;
        String title;
        int hours;
        boolean done;

        Todo(int id, String title, int hours, boolean done) {
            this.id = id;
            this.title = title;
            this.hours = hours;
            this.done = done;
        }
    }

    private static final String FILENAME = "todos.csv";
    private static List<Todo> todos = new ArrayList<>();
    private static int nextId = 1;

    public static void main(String[] args) {
        // TODO: 프로그램 시작 시 파일에서 로드
        File file = new File(FILENAME);
        if(!file.exists()) {
            System.out.println(FILENAME + " 파일이 존재하지 않아 새로운 파일을 작성합니다.");
        }

        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            while ((line = reader.readLine()) != null) {
                String[] parts = line.replace(" ", "").split(",");

                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                int hours = Integer.parseInt(parts[2]);
                boolean done = Boolean.parseBoolean(parts[3]);

                todos.add(new Todo(nextId++, title, hours, done));
            } 
        }
        catch(IOException e) {
            System.out.println("왜인지는 모르겠는데 아무튼 에러입니다.");
        }

        // TODO: 간단한 메뉴 시뮬레이션
        // 샘플 TODO 추가
        todos.add(new Todo(nextId++, "새로운 할일", 2, false));

        // TODO: 프로그램 종료 시 파일에 저장
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
        

        // TODO: 각 TODO를 CSV 형식으로 변환하여 파일에 쓰기
        // 형식: id,title,hours,done
            String csvTodo = "";

            for(Todo todo : todos) {
                csvTodo += todo.id + ", " + todo.title + ", " + todo.hours + ", " + todo.done + "\n";
            }

            writer.write(csvTodo); // 파일은 프로젝트 폴더 최상위 구간에 생성됨
            System.out.println("파일 저장 완료: " + FILENAME + " 총 " + todos.size() + " 건");
        // TODO: IOException 예외 처리
        }   
        catch (IOException e) {
            System.out.println("IOException occurs." + e.getMessage());
        }
    }

    private static void loadFromFile() {
        // TODO: 파일에서 TODO 목록을 로드하는 코드 작성
        // 파일이 없으면 빈 리스트로 시작
        // nextId를 가장 큰 id + 1로 설정
    }

    private static void saveToFile() {
        // TODO: TODO 목록을 파일에 저장하는 코드 작성
    }
}
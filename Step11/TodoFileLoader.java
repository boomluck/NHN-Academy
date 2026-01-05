import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TodoFileLoader {
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

        @Override
        public String toString() {
            return String.format("[%d] %s (%dh) - %s",
                id, title, hours, done ? "완료" : "미완료");
        }
    }

    public static void main(String[] args) {
        String filename = "todos.csv";
        List<Todo> todos = new ArrayList<>();

        // TODO: File 객체를 생성하고 파일 존재 여부 확인
        File file = new File(filename);
        if(!file.exists()) {
            System.out.println("파일이 존재하지 않습니다.");
        }

        // TODO: try-with-resources로 BufferedReader 생성
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            String[] parts;
            int id;
            String title;
            int hours;
            boolean done;

            while ((line = reader.readLine()) != null) {
                parts = line.replace(" ", "").split(",");

                id = Integer.parseInt(parts[0]);
                title = parts[1];
                hours = Integer.parseInt(parts[2]);
                done = Boolean.parseBoolean(parts[3]);

                todos.add(new Todo(id, title, hours, done));
            }
        }

        // TODO: 파일을 한 줄씩 읽으면서 CSV 파싱
        // split()으로 분리 후 Todo 객체 생성하여 리스트에 추가

        // TODO: IOException 예외 처리
        catch(IOException e) {
            System.out.println("형식이 일치하지 않습니다.");
        }

        // TODO: 로드된 TODO 목록 출력
        for (Todo t : todos) {
            System.out.println(t);
        }
    }
}
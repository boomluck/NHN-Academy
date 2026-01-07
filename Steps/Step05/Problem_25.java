import java.util.ArrayList;

public class Problem_25 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // for-each 문으로 출력
        for (String name : names) {
            System.out.println(name);
        }
    }
}

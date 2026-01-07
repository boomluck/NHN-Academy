import java.util.ArrayList;

public class Problem_8 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println("Hello, " + name + "!");
        }
    }
}

import java.util.ArrayList;

public class Problem_13 {
    public static void main(String[] args) {
        ArrayList<String> labels = new ArrayList();
        labels.add("Python");
        labels.add("Java");
        labels.add("JavaScript");

        for (String label : labels) {
            if (label.equals("Java")) {
                System.out.println("찾았습니다!");
                break;
            } else {
                System.out.println("아직 못 찾았습니다.");
            }
        }
    }
}

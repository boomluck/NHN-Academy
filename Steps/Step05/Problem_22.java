import java.util.ArrayList;

public class Problem_22 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("첫 번째: " + numbers.getFirst()); // 첫 번째: 10
        System.out.println("마지막: " + numbers.getLast()); // 마지막: 30
        System.out.println("전체 개수: " + numbers.size()); // 전체 개수: 3
    }
}

package Day_07;

public class Problem_2 {
    public static void main(String[] args) {
        Category c1 = Category.OTHER;

        switch (c1) {
            case WORK:
                System.out.println("업무");
                break;
            case STUDY:
                System.out.println("학습");
                break;
            default:
                System.out.println("기타");
        }
    }
}

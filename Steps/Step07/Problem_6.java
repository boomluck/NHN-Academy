package Day_07;

public class Problem_6 {
    public static void main(String[] args) {
        /*
         * for (int i = 0, i < Category.values(), i++) {
         * System.out.println(Category.ordinal(i) + " : " + Category.name(i));
         * }
         */

        Category[] categories = Category.values();
        for (Category c : categories) {
            System.out.println(c.ordinal() + " : " + c.name());
        }
    }
}

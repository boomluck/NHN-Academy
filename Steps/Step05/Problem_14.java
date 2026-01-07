public class Problem_14 {
    public static void main(String[] args) {
        String[] colors = { "빨강", "파랑", "노랑" };

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for (String color : colors) {
            System.out.println(color);
        }
    }
}

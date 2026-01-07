public class Problem_30 {
    public static void main(String[] args) {
        String[] booleans = { "true", "false", "TRUE", "yes" };

        for (int i = 0; i < booleans.length; i++) {
            System.out.println("\"" + booleans[i] + "\" -> " + Boolean.parseBoolean(booleans[i]));
        }
    }
}

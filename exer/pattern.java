public class supermain {

    static void pattern() {
        int[] x = { 1, 2, 3, 4, 5 };
        for (int i : x) {
            for (int j = 0; j < i; j++) {
                System.out.print("x");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] arg) {
        pattern();

    }
}

import java.util.Scanner;

class hello {

    public static void main(String args[]) {

        System.out.println("this shit runs ");

        Scanner s = new Scanner(System.in);
        int aa = s.nextInt();
        int bb = s.nextInt();
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = add(aa, bb);
        System.out.println(c);

        for (int i = 0; i < 10; i++) {
            System.out.println("this is not a test" + i);
        }
    }

    public static int add(int a, int b) {

        return a + b;

    }

}

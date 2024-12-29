import java.util.Scanner;

class Hello {

  public static final int add(int a, int b) {
    return a + b;
  }

  public static void main(String args[], Scanner scan) {
    System.out.println("this runs");

    try (Scanner scann = new Scanner(System.in); ) {

      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();

      int d = scan.nextInt();

      System.out.println(add(a, b));
      System.out.println(add(c, d));

      for (int i = 0; i < 10; i++) {
        System.out.println("this is not a test " + i);
      }
    }
  }
}

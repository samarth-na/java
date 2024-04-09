class hello {

    public static void main(String args[]) {
        System.out.println("this shit runs ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = add(a, b);
        System.out.println(c);

        for (int i = 0; i < 10; i++) {
            slystem.out.println("this is not a test");
        }
    }

    public static int add(int a, int b) {

        return a + b;

    }

}

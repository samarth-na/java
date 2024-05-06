class scope {

    public static void main(String[] args) {
        int arg1 = 1;
        System.out.println(arg1);
        int arg2 = notmain(args);
    }

    static int notmain(String[] args) {
        int arg2 = 2;
        System.out.println(arg2);
        return arg2;
    }
}

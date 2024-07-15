class scope {

    public final static String name = "hello";

    public static void name(String[] args) {

        System.out.println(name);
        int arg1 = 1;
        System.out.println(arg1);
        int arg2 = notmain(args);
        System.out.println(arg2);
    }

    static int notmain(String[] args) {
        int arg2 = 2;
        System.out.println(arg2);
        return arg2;
    }
}

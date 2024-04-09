public class shapes {

    public class circle {
        int radius;
        int dia = radius * 2;
        int area;

        int area() {
            int area = 22 / 7 * radius * radius;
            return area;
        }

        int parameter() {
            int para = 22 / 7 * dia;
            return para;
        }
    }

    public static void main(String[] args) {

        circle c = new circle();
        system.Out.println(c);

    }
}

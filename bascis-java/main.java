
class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Car.printcar();
        Car newcar = new Car("BMW", 2021);
        System.out.println(newcar.model);

    }

}

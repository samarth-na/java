// Car.java
public class Car {

    String model;
    int year;

    // Constructor that takes model and year as parameters
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void printcar() {
        // Creating instances of Car
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2019);

        System.out.println("Car 1 Details:");
        car1.display();

        System.out.println("\nCar 2 Details:");
        car2.display();
    }
}

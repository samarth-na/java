public class Shapes {
    // Shapes is the parent/outer class that will contain the Circle class

    public class Circle {
        // Circle is the child/inner class that represents a circle

        int radius;
        int dia;
        int area;

        public Circle(int radius) {
            // Constructor that takes the radius as a parameter and initializes the instance
            // variables
            this.radius = radius;
            this.dia = 2 * radius; // Calculate the diameter as 2 times the radius
            this.area = (int) (3.14 * radius * radius); // Calculate the area using the formula
        }

        public void printDetails() {
            // Method to print the details of the circle
            System.out.println("Radius: " + radius);
            System.out.println("Diameter: " + dia);
            System.out.println("Area: " + area);
        }
    }

    public static void main(String[] args) {
        // Entry point of the program

        Shapes shapes = new Shapes(); // Create an instance of the Shapes class
        Circle c = shapes.new Circle(5); // Create a new Circle object with a radius of 5
        c.printDetails(); // Call the printDetails() method to print the details of the circle
    }
}

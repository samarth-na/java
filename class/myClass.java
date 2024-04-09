public class people {

    public class person {
        // Private member variables
        private String PRIname;
        private int PRIage;

        // Public member variables
        public String PUBaddress;
        public int PUBsalary;

        // Private constructor
        private person(String name, int age) {
            this.PRIname = name;
            this.PRIage = age;
        }

        // Public constructor
        public person(String name, int age, String address, int salary) {
            this.PRIname = name;
            this.PRIage = age;
            this.PUBaddress = address;
            this.PUBsalary = salary;
        }

        // Private method
        private void printPrivateDetails() {
            System.out.println("Name: " + PRIname);
            System.out.println("Age: " + PRIage);
        }

        // Public method
        public void printPublicDetails() {
            System.out.println("Name: " + PRIname);
            System.out.println("Age: " + PRIage);
            System.out.println("Address: " + PUBaddress);
            System.out.println("Salary: " + PUBsalary);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of MyClass
        people obj = new people();
        people.person person1 = obj.new person("John Doe", 30, "123 Main St", 50000);
        // Accessing public members
        System.out.println("Address:  " + person1.PUBaddress);
        System.out.println("Salary:  " + person1.PUBsalary);
        person1.printPublicDetails();

        // Trying to access private members directly will not work
        System.out.println("Name: " + obj.name); // Error: name has private access in
        // MyClass
        // System.out.println("Age: " + obj.age); // Error: age has private access in
        // MyClass
        // obj.printPrivateDetails(); // Error: printPrivateDetails() has private access
        // in MyClass

        // Creating a new instance using the private constructor will not work
        // MyClass privateObj = new MyClass("Jane Doe", 25); // Error: MyClass(String,
        // int) has private access
    }
}

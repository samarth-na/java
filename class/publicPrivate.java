public class publicPrivate {

    public class Person {

        private String name;
        public int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void introduce() {
            System.out.println("Hi, my name is " + name + " and I'm " + age + " years old.");
        }
    }

    public static void main(String[] args) {
        publicPrivate Pobj = new publicPrivate();
        publicPrivate.Person person = Pobj.new Person("Alice", 30);

        person.age = 30;
        System.out.println("Age: " + person.age);
        System.out.println("name: " + person.name);
    }
}

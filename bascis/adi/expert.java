import java.util.Scanner;

public class expert {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");

        int num1 = sc.nextInt();
        System.out.println("Enter second number ");

        int num2 = sc.nextInt();
        System.out.println("Enter Operator (+, -, *, /) ");

        char op = sc.next().charAt(0);

        // aditya tune ye kiya tha jo upar hai vo sahi hai
        // char op = sc.nextchar();

        switch (op) {
            case ('+'):
                System.out.println("Your sum is : " + (num1 + num2));
                break;

            case ('-'):
                System.out.println("Your difference is : " + (num1 - num2));
                break;

            case ('*'):
                System.out.println("Your multiply is : " + (num1 * num2));
                break;

            case ('/'):
                System.out.println("Your division is : " + (num1 / num2));
                break;

            default:
                System.out.println("INVALID!!! OPERATOR");
        }

    }
}

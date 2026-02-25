import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Menu menu = new Menu();

        while (true) {

            menu.show();
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter two numbers: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("Result: " + calculator.add(a, b));
            }
            else if (choice == 2) {
                System.out.print("Enter two numbers: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("Result: " + calculator.subtract(a, b));
            }
            else if (choice == 3) {
                System.out.print("Enter two numbers: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("Result: " + calculator.multiply(a, b));
            }
            else if (choice == 4) {
                break;
            }
        }

        scanner.close();
    }
}
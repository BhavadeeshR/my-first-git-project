import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();
            int choice = scanner.nextInt();

            if (choice == 1) {
                sayHello();
            }
            else if (choice == 2) {
                addNumbers(scanner);
            }
            else if (choice == 3) {
                System.out.println("Exiting program...");
                break;
            }
            else {
                System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }

    public static void showMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Say Hello");
        System.out.println("2. Add Two Numbers");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }

    public static void sayHello() {
        System.out.println("Hello! Nice to meet you.");
    }

    public static void addNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Result: " + (a + b));
    }
}
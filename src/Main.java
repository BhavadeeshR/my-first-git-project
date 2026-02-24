import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Say Hello");
            System.out.println("2. Add Two Numbers");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Hello! Nice to meet you.");
            }
            else if (choice == 2) {
                System.out.print("Enter first number: ");
                int a = scanner.nextInt();
                System.out.print("Enter second number: ");
                int b = scanner.nextInt();
                System.out.println("Result: " + (a + b));
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
}
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String option = "";

        while(!option.equals("exit")) {
            System.out.println("Welcome to Calculator Program!");
            System.out.println("Please choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("Type 'exit' to quit and 'menu' for the main menu.");
            System.out.print("Choose an option: ");
            option = scanner.nextLine();

            if(option.equals("1")) {
                System.out.println("You chose Addition.");
            } else if(option.equals("2")) {
                System.out.println("You chose Subtraction.");
            } else if(option.equals("3")) {
                System.out.println("You chose Multiplication.");
            } else if(option.equals("4")) {
                System.out.println("You chose Division.");
            } else if(option.equals("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            } else if(option.equals("menu")) {
                continue;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        scanner.close();
        }
    }
}
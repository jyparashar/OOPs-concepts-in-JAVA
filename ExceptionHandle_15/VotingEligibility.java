package ExceptionHandle_15;
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }

            if (age < 18) {
                System.out.println("You are not eligible to cast a vote.");
            } else {
                System.out.println("You are eligible to cast a vote.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid age.");
        } finally {
            scanner.close();
            System.out.println("Program execution finished.");
        }
    }
}


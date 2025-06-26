package Tasks.Core19ifElse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks = getValidMarks(scanner);

        // Grading logic using if-else-if
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else if (marks >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: Fail");
        }
    }

    // Method to get valid marks between 0 and 100
    public static int getValidMarks(Scanner scanner) {
        int marks = -1;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter your marks (0-100): ");
            try {
                marks = scanner.nextInt();
                if (marks >= 0 && marks <= 100) {
                    valid = true;
                } else {
                    System.out.println("❌ Please enter marks between 0 and 100.");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input! Please enter a numeric value.");
                scanner.nextLine(); // clear invalid input
            }
        }

        return marks;
    }
}

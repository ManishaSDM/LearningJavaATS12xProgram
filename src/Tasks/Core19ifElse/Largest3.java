package Tasks.Core19ifElse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {
        // Scanner scanner=new Scanner(System.in);

        Scanner scanner;
        try {
            scanner = new Scanner(System.in);
            // Taking 3 numbers as input
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter third number: ");
            int num3 = scanner.nextInt();

            // Method 1: Using if-else
            int largest;
            if (num1 >= num2 && num1 >= num3) {
                largest = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }

            //method2 :largest = Math.max(num1, Math.max(num2, num3));
// Output the largest number
            System.out.println("The largest number is: " + largest);
        } catch (InputMismatchException e) {
            throw new RuntimeException("❌ Invalid input! Please enter a valid number.");

        }

    }

}

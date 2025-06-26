package Tasks.Core19ifElse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Smallestof3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            //take input for comparing 3 numbers

            System.out.println("Enter first number");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number");
           double num2 = scanner.nextDouble();

            System.out.println("Enter third number");
            double num3 = scanner.nextDouble();
           double smallest;
            // Check if all numbers are equal
            if (num1 == num2 && num2 == num3) {
                System.out.println("All three numbers are equal");
            } else {
                if (num1 <= num2 && num1 <= num3) {
                    smallest = num1;
                    System.out.println(smallest + ":is the smallest of " + num2 + " and " + num3);
                } else if (num2 <= num1 && num2 <= num3) {
                    smallest = num2;
                    System.out.println(smallest + ":is the smallest of " + num1 + " and " + num3);
                } else {
                    smallest = num3;
                    System.out.println(smallest + ":is the smallest of " + num1 + " and " + num2);
                }
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Invalid Input enter only numbers");
        }

    }
}

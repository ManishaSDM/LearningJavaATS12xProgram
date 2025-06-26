package Tasks.Core19ifElse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Smallestof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a number");
            int num1 = scanner.nextInt();

            System.out.println("Enter another number to find smallest");
            int num2 = scanner.nextInt();

            if (num1 < num2) {
                System.out.println(num1 + " is smaller than  " + num2);
            } else if (num2 < num1) {
                System.out.println(num2 + " is smaller than  " + num1);
            } else
                System.out.println("Both numbers are same");
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Invalid input only numbers allowed");
        }
    }
}

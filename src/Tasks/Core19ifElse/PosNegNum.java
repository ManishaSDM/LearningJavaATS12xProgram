package Tasks.Core19ifElse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PosNegNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number");
            int num = scanner.nextInt();
            System.out.println("You entered :" + num);

            if (num < 0) {
                System.out.println(num + " : The number entered is negative");

            } else if (num > 0) {
                System.out.println(num + " :The number entered is positive");

            } else {
                // This is the default condition
                System.out.println("The number is zero.");
            }
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("Invalid input only numbers allowed");
        }

    }
    }


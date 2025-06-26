package Tasks.Core20ifelse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ifPrime {
    //A number greater than 1 that is divisible only by 1 and itself (e.g., 2, 3, 5, 7, 11).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getValidNumber(scanner);

        // Prime number logic using if-else if
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else if (number == 2) {
            System.out.println("2 is a prime number.");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }

    // Method to get a valid positive number
    public static int getValidNumber(Scanner scanner) {
        int num = -1;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter a positive integer: ");
            try {
                num = scanner.nextInt();
                if (num >= 0) {
                    valid = true;
                } else {
                    System.out.println("❌ Please enter a non-negative number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input! Please enter a whole number.");
                scanner.nextLine(); // clear the invalid input
            }
        }

        return num;
    }
}




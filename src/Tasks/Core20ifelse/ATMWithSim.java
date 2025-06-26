package Tasks.Core20ifelse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMWithSim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 10000; // Step 1: Initialize balance

        System.out.println("Welcome to Simple ATM");
        System.out.println("Current Balance: ₹" + balance);

        // Step 2: Get withdrawal amount
        int amount = getValidAmount(scanner);

        // Step 3: Check conditions using if-else
        if (amount <= 0) {
            System.out.println("Invalid amount! Withdrawal must be greater than ₹0.");
        } else if (amount % 100 != 0) {
            System.out.println(" Invalid amount! Please enter a multiple of ₹100.");
        } else if (amount > balance) {
            System.out.println(" Insufficient balance! Your current balance is ₹" + balance);
        } else {
            // Step 4: Deduct amount
            balance -= amount;
            System.out.println("Withdrawal of ₹" + amount + " successful.");
            System.out.println("Updated Balance: ₹" + balance);
        }
    }

    // Step 2 helper: Validate input
    public static int getValidAmount(Scanner scanner) {
        int amount = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter amount to withdraw: ₹");
            try {
                amount = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // clear the buffer
            }
        }

        return amount;
    }
}

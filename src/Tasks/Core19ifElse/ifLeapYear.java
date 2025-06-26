package Tasks.Core19ifElse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ifLeapYear {
    //A year is a leap year if:
    //It is divisible by 4,
    //Except years divisible by 100,
    //Unless the year is also divisible by 400.
   // public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);

        // Take year input from user
       // System.out.print("Enter a year: ");
        //int year = scanner.nextInt();

        // Check leap year using if-else
       // if (year % 400 == 0) {
        //    System.out.println(year + " is a leap year.");
       // } else if (year % 100 == 0) {
      //      System.out.println(year + " is not a leap year.");
      //  } else if (year % 4 == 0) {
       //     System.out.println(year + " is a leap year.");
      //  } else {
        //    System.out.println(year + " is not a leap year.");
       // }
        //reusable version of samep rogram
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int year = getValidYear(scanner, "Enter a year: ");

            // Call method to check leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

        // Method to check if a year is a leap year
        public static boolean isLeapYear(int year) {
            if (year % 400 == 0) {
                return true;
            } else if (year % 100 == 0) {
                return false;
            } else if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }

        // Method to validate integer input
        public static int getValidYear(Scanner scanner, String prompt) {
            int year = 0;
            boolean valid = false;

            while (!valid) {
                System.out.print(prompt);
                try {
                    year = scanner.nextInt();
                    if (year > 0) {
                        valid = true;
                    } else {
                        System.out.println("❌ Please enter a valid positive year.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("❌ Invalid input! Please enter a numeric year.");
                    scanner.nextLine(); // Clear invalid input
                }
            }

            return year;
        }
    }



package Tasks.CoreForwhileloop;

import java.util.Scanner;

public class Combinedprg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n📋 MENU - Choose an option:");
            System.out.println("1. Print numbers from 1 to 10 (for loop)");
            System.out.println("2. Print even numbers from 1 to 20 (for loop)");
            System.out.println("3. Print \"Mello\" 5 times (for loop)");
            System.out.println("4. Print sum of first 10 natural numbers (for loop)");
            System.out.println("5. Print multiplication table of a number (for loop)");
            System.out.println("6. Print numbers from 1 to 10 (while loop)");
            System.out.println("7. Print even numbers from 1 to 20 (while loop)");
            System.out.println("8. Print \"Java\" 5 times (while loop)");
            System.out.println("9. Print sum of first 10 natural numbers (while loop)");
            System.out.println("10. Print multiplication table of a number (while loop)");
            System.out.println("0. Exit");
            System.out.print("👉 Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i);
                    }
                    break;

                case 2:
                    for (int i = 2; i <= 20; i += 2) {
                        System.out.println(i);
                    }
                    break;

                case 3:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("Mello");
                    }
                    break;

                case 4:
                    int sumFor = 0;
                    for (int i = 1; i <= 10; i++) {
                        sumFor += i;
                    }
                    System.out.println("Sum = " + sumFor);
                    break;

                case 5:
                    System.out.print("Enter a number for multiplication table: ");
                    int numFor = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numFor + " x " + i + " = " + (numFor * i));
                    }
                    break;

                case 6:
                    int i6 = 1;
                    while (i6 <= 10) {
                        System.out.println(i6);
                        i6++;
                    }
                    break;

                case 7:
                    int i7 = 2;
                    while (i7 <= 20) {
                        System.out.println(i7);
                        i7 += 2;
                    }
                    break;

                case 8:
                    int i8 = 1;
                    while (i8 <= 5) {
                        System.out.println("Java");
                        i8++;
                    }
                    break;

                case 9:
                    int i9 = 1, sumWhile = 0;
                    while (i9 <= 10) {
                        sumWhile += i9;
                        i9++;
                    }
                    System.out.println("Sum = " + sumWhile);
                    break;

                case 10:
                    System.out.print("Enter a number for multiplication table: ");
                    int numWhile = scanner.nextInt();
                    int i10 = 1;
                    while (i10 <= 10) {
                        System.out.println(numWhile + " x " + i10 + " = " + (numWhile * i10));
                        i10++;
                    }
                    break;

                case 0:
                    System.out.println("Exiting program. bye-bye! 👋");
                    break;

                default:
                    System.out.println("❌ Invalid choice! Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

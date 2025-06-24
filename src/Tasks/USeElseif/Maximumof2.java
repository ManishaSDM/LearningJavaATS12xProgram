package Tasks.USeElseif;

import java.util.Scanner;

public class Maximumof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter a number to compare: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Maximum is first num: " + num1);
        } else if (num2 > num1) {
            System.out.println("Maximum is other num: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}

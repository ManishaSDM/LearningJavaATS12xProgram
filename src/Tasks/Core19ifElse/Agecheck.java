package Tasks.Core19ifElse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Agecheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.print("Enter a number: ");
        int age = scanner.nextInt();
        //int age = 17;

        if (age >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    } catch (InputMismatchException e) {
            throw new InputMismatchException("Invalid input only numbers allowed");
        }
}
}
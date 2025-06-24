package Tasks.USeElseif;

import java.util.Scanner;

public class VoteCheckage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int age = scanner.nextInt();
        //int age = 17;

        if (age >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }
}

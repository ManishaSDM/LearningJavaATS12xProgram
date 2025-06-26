package Tasks.Core19ifElse;

import java.util.Scanner;

public class VowConso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        char ch = scanner.next().charAt(0);
        System.out.println("You entered: " + ch);
        //char ch = 'E';

        // Convert to lowercase for comparison
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The character is a vowel.");
        } else if (Character.isLetter(ch)) {
            System.out.println("The character is a consonant.");
        } else {
            System.out.println("Not a valid alphabet character.");
        }
    }
}

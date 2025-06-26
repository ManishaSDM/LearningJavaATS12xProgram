package Tasks.Core20ifelse;

import java.util.Scanner;

public class isAlpha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char ch = scanner.next().charAt(0);
        System.out.println("You entered: " + ch);
        //char ch = 'E';

        // Convert to lowercase for comparison
        ch = Character.toLowerCase(ch);

        if (Character.isAlphabetic(ch)) {
            System.out.println("The character is an alphabet.");
        } else  {
            System.out.println("Not an alphabet");
        }
    }
}
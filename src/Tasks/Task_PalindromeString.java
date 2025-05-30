package Tasks;

import java.util.Scanner;

public class Task_PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = true;
        int length = input.length();

        // Compare characters from both ends using charAt()
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input+ ": Is Indeed a Palindrome.");
        } else {
            System.out.println(input+ " : Not a palindrome.");
        }
    }
}

package Tasks;

import java.util.Scanner;

public class Task_VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowels = 0, consonants = 0;
        input = input.toLowerCase();  // Convert to lowercase for uniformity

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) { // Check if it's an alphabet character
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels in given string : " + vowels);
        System.out.println("Consonants in given string: " + consonants);
    }
}

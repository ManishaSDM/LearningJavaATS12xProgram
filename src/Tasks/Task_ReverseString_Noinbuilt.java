package Tasks;

import java.util.Scanner;

public class Task_ReverseString_Noinbuilt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read user input

        for(int i=input.length()-1;i>=0;i--)
        {
            System.out.print(input.charAt(i));
        }
    }
}

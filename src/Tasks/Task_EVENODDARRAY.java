package Tasks;

import java.util.Scanner;

public class Task_EVENODDARRAY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int j : array) {
            String result = (j % 2 == 0) ? "even" : "odd";
            System.out.println(result);
        }

    }

}

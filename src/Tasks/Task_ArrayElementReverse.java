package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task_ArrayElementReverse {
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

        // Reverse the array
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        // Output the reversed array
        System.out.println("Reversed array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    }


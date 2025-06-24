package Tasks.JavaCodingchallenge;

import java.util.Scanner;

public class Challenge7 {
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
//        int min = array[0];
        int max = array[0];
        // logic
        for(int i=0;i< array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
//        for(int i=0;i< array.length;i++){
//            if(array[i] < min){
//                min = array[i];
//            }
//        }

        System.out.println("Max is, " + max);
//        System.out.println("Min is, " + min);
    }
}

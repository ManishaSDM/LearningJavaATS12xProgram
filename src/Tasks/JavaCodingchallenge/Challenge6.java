package Tasks.JavaCodingchallenge;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number == 0){
            System.out.println(number +" is zero");
        }else {
            if (0 < number) {
                System.out.println(number + "is positive");
            }
            else {
                System.out.println(number + "is negative");
            }
        }


        }
    }


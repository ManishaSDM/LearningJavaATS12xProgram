package Tasks.Core19ifElse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EveOddNum {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        
        try{
            System.out.println("Enter a numerical value to check even or odd number");
            int num=scanner.nextInt();
            System.out.println("You entered : "+num);
             if (num%2==0){
                 System.out.println(num+" is even number");
             } else {
                 System.out.println(num+" is odd number");
             }

        } catch (InputMismatchException e) {
            throw new InputMismatchException("Invalid input only numbers allowed");
        }
        
    }
}

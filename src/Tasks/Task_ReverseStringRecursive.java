package Tasks;

import java.util.Scanner;

public class Task_ReverseStringRecursive {

    public static String ReverseRecursive(String Str){

        if(Str.isEmpty()){
            return Str;//set base string as empty
        }
   return ReverseRecursive(Str.substring(1)+Str.charAt(0));//remove character from 1 and add at end
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//create Scanner object
        System.out.print("Enter a string: ");
       String STR=scanner.nextLine();//read user input
       String reversed= ReverseRecursive(STR);
        System.out.println("Reversed string: " + reversed);
    }
}

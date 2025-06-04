package Tasks;

import java.util.Scanner;

public class Task_StringBufferReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String input= scanner.nextLine();
        StringBuffer sb=new StringBuffer(input);
        System.out.println(sb.reverse());
    }
}

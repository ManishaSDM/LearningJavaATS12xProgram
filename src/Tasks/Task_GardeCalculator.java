package Tasks;

import java.util.Scanner;

public class Task_GardeCalculator {
  //A: 90-100
   //B 80-89
 // C: 70-79
  //D: 60-69
  //F: 0-59

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
    System.out.print("Enter your marks: ");
        int marks = scanner.nextInt(); // Read user input

       char grade;

        if (marks >=90 && marks<=100) {
            grade='A';
            System.out.println(grade);}
else if (marks>=80 && marks<=89){grade='B';
            System.out.println(grade);}
else if(marks>=70&&marks<=79){grade='C';
            System.out.println(grade);
        }
else if(marks>=60&&marks<=69){
grade='D';
            System.out.println(grade);}
else if(marks>=0&&marks<=59){grade='F';
            System.out.println(grade);
}
}
}
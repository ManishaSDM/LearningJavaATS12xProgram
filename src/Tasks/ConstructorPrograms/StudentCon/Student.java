package Tasks.ConstructorPrograms.StudentCon;

import java.util.Scanner;

public class Student {

    String name;
    int age;
    public String getName() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Name");
        name =scanner.nextLine();
        scanner.close();
         return name;
    }

    public int getAge() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age");
        age=scanner.nextInt();
        scanner.close();
        return age;
    }

    void display(){

        System.out.println("Student age : "+age);
        System.out.println("Student Name : "+name);

    }


}
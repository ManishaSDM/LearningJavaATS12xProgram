package Tasks.JavaCodingchallengeoops;

public class Person {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.Name="John";
        p1.age=25;
p1.display();
        Person p2=new Person();
        p2.Name="Alice";
        p2.age=30;

        p2.display();
    }

    String Name;
    int age;
    void display(){

        System.out.println("Name:"+Name);
        System.out.println("Age:"+ age);

    }
}

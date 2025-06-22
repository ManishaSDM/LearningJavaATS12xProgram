package Tasks.JavaCodingchallengeoops;

public class Oppschallenge2 {

    public static void main(String[] args) {
        Student s=new Student();
        s.show();
    }
}
 class Student implements I1{
@Override
     public void show(){

String name="Bob";
int Rollno=101;
String sect="A";

    System.out.println("Student:"+ name+ ",Roll_No"+Rollno+",Section:"+sect);
}

 }
 interface I1 {

void show();

}
package Tasks.AbstractPrograms.AbsConstructorCall;

public class AbsConCall1 {

    public static void main(String[] args) {
            Deconstruct obj= new Deconstruct();//triggers subclass constructor
            obj.demonstrate();//calls abstract method
       }
}

class Deconstruct extends Demos {

    // Implementing abstract method
    @Override
    void demonstrate() {
        System.out.println("Method from abstract class");
    }
}



// Abstract class
abstract class Demos{
    // Constructor
    Demos(){
    System.out.println("Abstract class constructor called");

}
   abstract void demonstrate();
}
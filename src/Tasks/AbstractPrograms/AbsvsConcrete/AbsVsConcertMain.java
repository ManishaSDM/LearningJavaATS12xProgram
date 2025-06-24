package Tasks.AbstractPrograms.AbsvsConcrete;


public class AbsVsConcertMain{

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // Calls concrete method from abstract class
        obj.show();    // Calls overridden abstract method
    }

}
abstract class Parent {

    //Abstract method which child class must have to implement
    abstract void show();

    //Concrete method -like a common functionality
    void display() {
        System.out.println("Concrete method in abstract class");
    }
}
class Child extends Parent{
    //implement abstract method
    @Override
    void show() {
        System.out.println("Abstract method implemented");
    }

}

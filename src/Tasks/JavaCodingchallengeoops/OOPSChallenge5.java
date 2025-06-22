package Tasks.JavaCodingchallengeoops;


public class OOPSChallenge5 {
    public static void main(String[] args) {


        Dog1 dog=new Dog1();
        dog.makeSound1();
        Cat1 cat=new Cat1();
        cat.makeSound1();
    }
}
abstract class Animal1 {

    abstract void makeSound1();
}

class Cat1 extends Animal1 {

    @Override
    void makeSound1() {
        System.out.println(" Cat says: Meow! Meow!");
    }
}
class Dog1 extends Animal1 {

    @Override
    void makeSound1() {

        System.out.println("Dog says: Woof! Woof!");

    }


}
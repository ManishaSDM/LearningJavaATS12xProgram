package ex_19_OOPs_Part2.inheritance.multilevel;
import ex_19_OOPs_Part2.inheritance.multipleheritance.Father2;
public class Lab170_MultiLevel {
    public static void main(String[] args) {
        Son pramod = new Son();
        Father f = new Father();
        GrandFather gf =  new GrandFather();
        Son S1= new Son();
        Father F1=new Son();//Dynamic Dispatch
        GrandFather gf1 = new Son();
        GrandFather gf2 = new Father();
//        Son s3 = new GrandFather();
    }
}

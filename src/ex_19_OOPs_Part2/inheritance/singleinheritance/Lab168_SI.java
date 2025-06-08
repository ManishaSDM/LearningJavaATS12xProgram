package ex_19_OOPs_Part2.inheritance.singleinheritance;

public class Lab168_SI {
    public static void main(String[] args) {
        Son pramod= new Son();
        System.out.println(pramod.gold_f);
        pramod.bhk3();
        pramod.bhk2();

        Cousin c=new Cousin();
        c.bhk31();
       // System.out.println(c.gold_f);
    }
}

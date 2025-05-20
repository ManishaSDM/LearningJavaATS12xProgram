package Tasks;

public class Task2_IDEOP {
    public static void main(String[] args) {
        int a = 11, b = 22, c;
        c = a + b + a++ + b++ + ++a + ++b;
        System.out.println("a=" + a); //i.e a=12 as now incremented by 1 due to opertation in C

        System.out.println("b=" + b); //i.e b=23 as now incremented by 1 due to opertation in C

        System.out.println("c=" + c);//1.e c==103
    }
}

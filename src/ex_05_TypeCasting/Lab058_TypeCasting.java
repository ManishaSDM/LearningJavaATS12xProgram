package ex_05_TypeCasting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid Syntax -> Widening - Implicit Casting - Automatically done.
        System.out.println(b);
        System.out.println(a);
        int a1 = (int)b; // Widening Explicit Casting (int) - optional
        System.out.println(a1);
    }
}

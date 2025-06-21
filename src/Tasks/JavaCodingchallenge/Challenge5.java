package Tasks.JavaCodingchallenge;

public class Challenge5 {
    public static void main(String[] args) {
       // Show operator precedence with complex expressions-BODMAS Principal
        System.out.println((10 * 3.5 / 10 + 3.5) * 3+2+"Expression Result");

        // 10 * 3.5 - 35
        // 35/10 -> 3.5
        // 3.5+3.5-> 7
        // 6.5* 3 -> 21
        //21+2=23

       //Demonstrate implicit and explicit type casting

        int t = 10;
        double half = 3.5;

        double total2 = t+half; // Widening - auto - implicit
//       double total3 = (double)t+half; // Widening  - Explicit
        System.out.println("Implicit Casting"+total2);

//        int total1 = t+half; // Narrowing - Implicit
        int total = t+(int)half; // Narrowing - Explicit
        System.out.println("Explicit Casting"+total);



    }
}

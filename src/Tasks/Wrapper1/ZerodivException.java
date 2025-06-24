package Tasks.Wrapper1;

public class ZerodivException {

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            //This line will throw ArithmeticException
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching the exception
            System.out.println("Exception occurred: " + e);
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

package Tasks.Wrapper1;

public class Multitrycatch {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30,40,50,60};
        int result = 0;

        try {
            // May throw ArithmeticException
            result = numbers[1] / 0;

            // May throw ArrayIndexOutOfBoundsException
            System.out.println("Accessing element: " + numbers[5]);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}

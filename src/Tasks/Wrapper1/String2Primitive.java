package Tasks.Wrapper1;

public class String2Primitive {

    public static void main(String[] args) {
        String numericString = "8790";

        // Convert String to primitive int using Integer wrapper
        int number = Integer.parseInt(numericString);

        System.out.println("String value: " + numericString);
        System.out.println("Converted primitive int value: " + number);
    }
}

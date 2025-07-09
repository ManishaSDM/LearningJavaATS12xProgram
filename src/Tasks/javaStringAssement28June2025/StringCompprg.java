package Tasks.javaStringAssement28June2025;

public class StringCompprg {
    public static void main(String[] args) {
        // Define the input strings
        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "Hello";

        // Using == operator checks whether the two string references point to the same object
        System.out.println("Using == operator:");
        System.out.println("string1 == string2: " + (string1 == string2));
        System.out.println("string1 == string3: " + (string1 == string3));

        // Using equals() method (checks value/content equality, case-sensitive)
        System.out.println("\nUsing equals() method:");
        System.out.println("string1.equals(string2): " + string1.equals(string2));
        System.out.println("string1.equals(string3): " + string1.equals(string3));

        // Using equalsIgnoreCase() method (case-insensitive comparison)
        System.out.println("\nUsing equalsIgnoreCase() method:");
        System.out.println("string1.equalsIgnoreCase(string2): " + string1.equalsIgnoreCase(string2));
        System.out.println("string1.equalsIgnoreCase(string3): " + string1.equalsIgnoreCase(string3));

        // Using compareTo() method (lexicographical comparison)
        System.out.println("\nUsing compareTo() method:");
        System.out.println("string1.compareTo(string2): " + string1.compareTo(string2));
        System.out.println("string1.compareTo(string3): " + string1.compareTo(string3));
    }
}


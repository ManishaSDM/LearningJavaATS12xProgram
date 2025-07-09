package Tasks.javaStringAssement28June2025;

public class StringManipilate {

           public static void main(String[] args) {
            // Declare and initialize strings
            String firstName = "Jeremy";
            String lastName = "Dozen";

            // Concatenation
            String fullName = firstName + " " + lastName;
            System.out.println("Full Name: " + fullName);

            // Length
            int length = fullName.length();
            System.out.println("Length of Full Name: " + length);

            // Substring
            String sub = fullName.substring(0, 4); // Extract "Jere"
            System.out.println("Substring (0, 4): " + sub);

            // Character extraction
            char initial = fullName.charAt(0); // First character of fullName
            System.out.println("First character of fullName: " + initial);

            // Another character extraction example
            char lastChar = fullName.charAt(fullName.length() - 1); // Last character
            System.out.println("Last character of fullName: " + lastChar);
        }
    }


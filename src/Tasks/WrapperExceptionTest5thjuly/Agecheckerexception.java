package Tasks.WrapperExceptionTest5thjuly;

public class Agecheckerexception extends Exception {

    public Agecheckerexception(int inputAge) {
    }

    public static void main(String[] args) {


               try {
                   int inputAge = 15;
                if (inputAge< 18) {
                    throw new Agecheckerexception(inputAge);
                } else {
                    System.out.println("Age is valid.");
                }
            } catch (Agecheckerexception e) {
                System.out.println("Exception caught: " + e.getMessage());
            }


        }

    }







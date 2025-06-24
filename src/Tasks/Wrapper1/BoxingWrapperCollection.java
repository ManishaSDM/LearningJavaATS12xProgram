package Tasks.Wrapper1;

public class BoxingWrapperCollection {
    public static void main(String[] args) {
        //  Autoboxing: primitive to wrapper
        int primitiveVal = 100;
        Integer wrappedVal = primitiveVal;  // int to Integer
        System.out.println("Autoboxing/Autoboxed value (Integer): " + wrappedVal);

        //  Unboxing: wrapper to primitive
        Integer anotherWrappedVal = 200;
        int anotherPrimitive = anotherWrappedVal;  // Integer to int
        System.out.println("Unboxing/Unboxed value (int): " + anotherPrimitive);

        // Used in collections (cannot store primitives)
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(300); // Autoboxing here
        int valueFromList = list.getFirst(); // Unboxing here
        System.out.println("Value from ArrayList: " + valueFromList);
    }
}

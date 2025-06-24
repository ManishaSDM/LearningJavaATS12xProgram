package Tasks.AbstractPrograms.IntfDefaultStatic;

public class IntDefStat {
    // Main class
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();             // Calls default method

        Vehicle.fuelType();        // Calls static method directly from interface
    }
}
// Interface
interface Vehicle {

    // Default method
    default void start() {
        System.out.println("Vehicle started");
    }

    // Static method
    static void fuelType() {
        System.out.println("Fuel type is Petrol");
    }
}

// Class implementing the interface
class Car implements Vehicle {
    // No need to override start(), unless customization is needed
}



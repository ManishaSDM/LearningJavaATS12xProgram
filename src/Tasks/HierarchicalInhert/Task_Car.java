package Tasks.HierarchicalInhert;

public class Task_Car extends Task_BaseVehical{

    @Override
    void ignition() {
        super.ignition();
        System.out.println("Car");
    }
}

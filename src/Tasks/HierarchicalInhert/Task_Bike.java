package Tasks.HierarchicalInhert;

public class Task_Bike extends Task_BaseVehical {
    @Override
    void ignition() {
        super.ignition();
        System.out.println("Bike");
    }
}

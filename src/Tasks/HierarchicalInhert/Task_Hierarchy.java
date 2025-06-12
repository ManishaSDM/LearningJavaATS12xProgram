package Tasks.HierarchicalInhert;

public class Task_Hierarchy {
    public static void main(String[] args) {
        Task_Bike bike=new Task_Bike();
        bike.ignition();

        Task_Car car=new Task_Car();
        car.ignition();
    }

}

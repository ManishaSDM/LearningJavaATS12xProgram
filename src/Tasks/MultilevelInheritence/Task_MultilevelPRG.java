package Tasks.MultilevelInheritence;

public class Task_MultilevelPRG {

    public static void main(String[] args) {
        Task_GrandParent grandParent=new Task_GrandParent();
        System.out.println("*******GrandParent******");
        grandParent.farm();

        Task_Parent parent=new Task_Parent();
        System.out.println("****Parent****");
        parent.farm();
        parent.farmhouse();

        Task_Child child=new Task_Child();
        System.out.println("****Child****");
        child.farmhouse();
        child.farm();
        child.dairy();




    }
}

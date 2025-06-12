package Tasks.OverrideWork;

public class HowOverridework {

    public static void main(String[] args) {

        Task_UpperAgent UA =new Task_SubAgent();//Class SubAgent object is created hence upperAgent UA override fight() of Clas SubAgent
        UA.fight();

        Task_UpperAgent UAA=new Task_UpperAgent();
        UAA.fight();//Class UpperAgent object created so overridden fight() not called here.
    }



}

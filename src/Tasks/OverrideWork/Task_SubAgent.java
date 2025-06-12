package Tasks.OverrideWork;

public class Task_SubAgent extends Task_UpperAgent {

    @Override// SubAgent method is overriding inherited Upper Agent method
    void fight() {
        System.out.println("SubAgent Overrides UpperAgent fight");
        //super.fight();// super keyword is calling fight method from inherited classUpperAgent


    }
}

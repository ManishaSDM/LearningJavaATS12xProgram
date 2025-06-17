package Tasks.ConstructorPrograms.MobOverloadingCon;

public class Mobile {

    void Mob(String brand){

        System.out.println("Mobile brand is :"+" " +brand);

    }

    void Mob(String brand,double price){
        System.out.println("Mobile brand is :"+" " +brand +" "+"at price RS"+price);

    }
}

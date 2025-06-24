package Tasks.AbstractPrograms.InterfaceConstant;

public class Car3{

    public static void main(String[] args) {
        System.out.println("Max Speed is: " + SpeedLimit.MAX_SPEED);
    }
}
interface SpeedLimit{

    int MAX_SPEED=120;// implicitly public, static, and final


    }




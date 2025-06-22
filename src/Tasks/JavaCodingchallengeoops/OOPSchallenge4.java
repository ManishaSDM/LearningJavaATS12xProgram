package Tasks.JavaCodingchallengeoops;

public class OOPSchallenge4 {
    public static void main(String[] args) {
        BankAccount BK=new BankAccount();
        BK.deposit();
        BK.withdraw();
        BK.getBalance();
    }

}

class BankAccount implements Bank1{
    private double balance=1000;
    double depamt=500;
    double withamt=200;
    private double dep;
    private double postwith;

    @Override
public double deposit(){

 dep=balance+depamt;
return dep;

}

@Override

 public double withdraw()
{

    postwith =dep-withamt;
    return postwith;
}
@Override
    public void getBalance(){

    System.out.println("Balance after deposit:"+ dep+"Balance after withdrawal:"+postwith);
}
}
interface Bank1{


    double  deposit();
    double withdraw();
    void getBalance();
}

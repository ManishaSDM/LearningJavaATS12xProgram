package Tasks.ConstructorCall;

public class HowConswork {

    public static void main(String[] args) {
        ChildCon C=new ChildCon();//child object created for Class ChildCon with Reference as "C"
        C.ChildCon();//Child Constructor (Same name as class) called.
        C.SuperPar();//Parent Constructor called
        C.SuperPar(1,8);//Sum related Parent constructor called
       SuperPar S= new SuperPar();//parent object created for Class SuperPar with Reference as "S"
        S.SuperPar();// Parent Constructor called
    }
}

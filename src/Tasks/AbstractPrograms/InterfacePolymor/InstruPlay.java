package Tasks.AbstractPrograms.InterfacePolymor;

public class InstruPlay {
    public static void main(String[] args){

        Playable guitar=new Guitar();
        guitar.play();
        Playable piano=new Piano();
        piano.play();


    }
}
interface Playable{

    void play();
}
class Guitar implements Playable {
    @Override
    public void play(){

    System.out.println("Playing Guitar");
}
}

class Piano implements Playable {
    @Override
    public void play() {

        System.out.println("Playing Piano");

    }
}
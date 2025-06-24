package Tasks.AbstractPrograms.MultiInherIterface;

public class MultiInterfaceInherit {

    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();  // From Printable
        doc.show();   // From Showable
    }
}

//Interface 1
interface Printable{

void print();
}
//Interface 2
interface Showable{

void show();
}
// Class implementing both interfaces
class Document implements Printable, Showable {

    // Implementing print() method
    public void print() {
        System.out.println("Printing Document");
    }

    // Implementing show() method
    public void show() {
        System.out.println("Showing Document");
    }
}
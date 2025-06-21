package Tasks.JavaCodingchallenge;

public class Challenge4 {
    public static void main(String[] args) {
        int a= 5;
        System.out.println("Original:"+a);
        //Show the difference between ++i and i++
        int b=++a;//
        System.out.println(" Pre-increment :"+b);
        int c=a++;
        System.out.println(" Post-increment:"+c);
//- Show the difference between --i and i--
        int d=--c;
        System.out.println("Pre-Decrement:"+d);
        int e=c--;
        System.out.println("Post-decrement"+e);


    }
}

package Tasks;

public class Task_Fizzbuzz {
    public static void main(String[] args) {
         for(int i=1; i<=100;i++)
        {
            if(i%3==0 && i%5==0)
        {
            System.out.println("FIZZBUZZ");//both multiple og 3 and 5
        }
        else if(i%3==0)
            System.out.println("Fizz");//multiple of 3
            else if (i%5==0) {
                System.out.println("Buzz");//multiple of 5
            } else
            System.out.println(i);
        }

    }
}

package Tasks;

public class Task_Triangle_Classifier2 {

    public static void main(String[] args) {
        String user_input = args[0];
        int n1 = Integer.parseInt(user_input); // user input for one side
        System.out.println("Side1:"+ n1);

        String user_input2 = args[1];
        int n2 = Integer.parseInt(user_input2); // user input for 2nd side
        System.out.println("Side2:"+n2);

        String user_input3 = args[2];
        int n3 = Integer.parseInt(user_input3); // user input for 3 side
        System.out.println("Side3:"+ n3);

        String result = (n1==n2 && n2==n3) ? "Equilateral" : ( n1!=n2 && n2!=n3 && n1!=n3) ? "Scalene":"Isosceles";
        System.out.println(result);



    }

}

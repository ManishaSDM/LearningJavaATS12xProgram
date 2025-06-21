package Tasks.AbstractPrograms.Interest;

import java.util.Scanner;

public class SBI extends Bank{

    @Override
    void getinterest() {
        Scanner scanner = new Scanner(System.in);

        // Input principal and time
        System.out.print("Enter the principal amount for SBI: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time in years: ");
        double time = scanner.nextDouble();

        // Interest rates
        double SBIrate = 6.5;

        double interest6_5 = (principal * SBIrate * time) / 100;

        //Print calculated result
        System.out.printf("Simple Interest at 6.5%%: %.2f%n", interest6_5);
    }
}

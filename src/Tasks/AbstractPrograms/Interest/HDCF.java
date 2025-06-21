package Tasks.AbstractPrograms.Interest;

import java.util.Scanner;

public class HDCF extends Bank{
    @Override
    void getinterest() {
        Scanner scanner = new Scanner(System.in);

        // Input principal and time
        System.out.print("Enter the principal amount for HDCF: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time in years: ");
        double time = scanner.nextDouble();

        // Interest rates
        double HDFCrate = 7;

        double interest7 = (principal * HDFCrate * time) / 100;

        //Print calculated result
        System.out.printf("Simple Interest at 7.0%%: %.2f%n", interest7);
    }
}

package Ex_Taximeter_Program;

import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double startPrice = 10, totalFee, perKm = 2.20;
            System.out.print("Please, enter distance traveled(KM):");
            double distance = scan.nextDouble();

            totalFee = distance * perKm;
            totalFee += startPrice;
            totalFee = (totalFee<20) ? 20 : totalFee;
        System.out.println("Amount to be paid:" + totalFee + "TL");

    }
}

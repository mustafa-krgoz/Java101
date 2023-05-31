package BasicProjects;

import java.util.Scanner;

public class VATAmount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter money:");
        double money = scan.nextDouble();
        double vatAmount = (money * 0.18);
        double total = money + vatAmount;

        System.out.println("Price excluding VAT:" + money + "\n" + "Price with VAT:" + total + "\n" + "VAT amount:" + vatAmount);
    }
}

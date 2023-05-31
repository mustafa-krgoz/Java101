package Ex_VAT_Amount_Account;

import java.util.Scanner;

public class VATAmountAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount, vatRate, vatAmount, vatPrice;
            System.out.print("Please, enter an amount:");
                amount = input.nextDouble();
        vatRate = (1000 >= amount) && (amount > 0) ? (0.18) : (0.08);
            vatAmount = amount * vatRate;
            vatPrice = amount + vatAmount;
        System.out.println("Amount:" + amount + "\n" + "VAT rate:" + vatRate + "\n" + "VAR amount:" + vatAmount + "\n" + "Price with VAT:" + vatPrice);






    }
}

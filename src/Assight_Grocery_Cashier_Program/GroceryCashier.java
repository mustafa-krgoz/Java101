package Assight_Grocery_Cashier_Program;

import java.util.Scanner;

public class GroceryCashier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalPrice,kg, a, p, t, b, e;
        double apple = 3.67, pear = 2.14 , tomato = 1.11, banana = 0.95, eggplant = 5.0;

        System.out.print("How many kilograms of pear?:");
        kg = scan.nextDouble();
        p = kg * pear;

        System.out.print("How many kilograms of apple?:");
        kg = scan.nextDouble();
        a = kg * apple;

        System.out.print("How many kilograms of tomato?:");
        kg = scan.nextDouble();
        t = kg * tomato;

        System.out.print("How many kilograms of banana?:");
        kg = scan.nextDouble();
        b = kg * banana;

        System.out.print("How many kilograms an eggplant?:");
        kg = scan.nextDouble();
        e = kg * eggplant;

        totalPrice = a + p + t + b + e;

        System.out.println("Total Amount:" + totalPrice);

    }
}

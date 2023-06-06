package Assigt_BMI;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         double kg, height, bmi;
        System.out.print("Please, enter your height(in meters):");
        height = input.nextDouble();
        System.out.print("Please, enter your weight:");
        kg = input.nextDouble();

        bmi = kg / (height*height);

        System.out.println("Your Body Mass Index:" + bmi);




    }
}

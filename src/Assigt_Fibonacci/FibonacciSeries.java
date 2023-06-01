package Assigt_Fibonacci;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();

       int firstNumber = 0;
       int secondNumber = 1;
       int total;

        System.out.print("Fibonacci series of the number" + " " + number + ": ");

       for(int i = 1; i <= number ; i++){
           System.out.print(firstNumber + ",");

            total = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = total;

       }
    }
}

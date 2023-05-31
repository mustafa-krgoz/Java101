package BasicProjects;

import java.util.Scanner;

public class HypotenuseInRightTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,hypotenuse;
        System.out.print("Enter the side:");
        a = input.nextDouble();
        System.out.print("Enter the other side:");
        b = input.nextDouble();

        hypotenuse = Math.sqrt((a*a) + (b*b));

        System.out.println("Hypotenuse of right triangle:" + hypotenuse );

    }
}

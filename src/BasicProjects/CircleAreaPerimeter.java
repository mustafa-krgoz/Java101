package BasicProjects;

import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double pi = 3.14;
        double area, perimeter;

        System.out.print("Enter the radius:");
        double r = input.nextDouble();

        area = pi*r*r;
        perimeter = 2*pi*r;

        System.out.println("Area of the circle:" + area + "\n" + "Perimeter of the circle:" + perimeter);
    }
}

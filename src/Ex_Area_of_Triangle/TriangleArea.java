package Ex_Area_of_Triangle;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x,y,z,u,area;

        System.out.print("Please, enter X side:");
        x = input.nextDouble();
        System.out.print("Please, enter Y side:");
        y = input.nextDouble();
        System.out.print("Please, enter Z side:");
        z = input.nextDouble();
    u = (x + y + z) / 2;
    area = Math.sqrt(u*(u-x)*(u-y)*(u-z));
        System.out.println("Area of Triangle:" + area);

    }
}

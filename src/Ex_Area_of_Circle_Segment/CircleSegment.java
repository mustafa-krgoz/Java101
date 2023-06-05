package Ex_Area_of_Circle_Segment;
import java.util.Scanner;
public class CircleSegment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            final double pi = 3.14;
            double area,r,a;

        System.out.print("Please, enter the radius:");
        r = scan.nextDouble();
        System.out.print("Please, enter measure of the central angle:");
        a = scan.nextDouble();

        area = (pi*(r*r)*a)/360;

        System.out.println("Area of Circle Segment:" + area);


    }
}

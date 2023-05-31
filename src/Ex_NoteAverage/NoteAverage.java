package Ex_NoteAverage;
import java.util.Scanner;

public class NoteAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maths, physics, chemistry, turkish, history, music;

        System.out.print("Enter maths note:");
        maths = input.nextInt();
        System.out.print("Enter physics note:");
        physics = input.nextInt();
        System.out.print("Enter chemistry note:");
        chemistry = input.nextInt();
        System.out.print("Enter turkish note:");
        turkish = input.nextInt();
        System.out.print("Enter history note:");
        history = input.nextInt();
        System.out.print("Enter music note:");
        music = input.nextInt();

        double average = (maths + physics + chemistry + turkish + history + music) / 6.0;
        String result = (average>60) ? "You pass the class" : "You failed the class";
        System.out.println("Average:" + average +"\t"+ result);     

    }
}

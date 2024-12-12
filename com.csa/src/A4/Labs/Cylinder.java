package A4.Labs;
import java.util.Scanner;
import java.lang.Math;

public class Cylinder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"

        System.out.print("Enter the radius of your cylinder:\n");
        double r = keyboard.nextDouble();
        System.out.print("Enter the height of your cylinder:\n\n");
        double h = keyboard.nextDouble();

        double surfaceArea = surfaceArea(r, h);
        double volume = volume(r, h);

        System.out.println("Cylinder Properties:");
        System.out.printf("Radius:        %10.3f\n", r);
        System.out.printf("Height:        %10.3f\n", h);
        System.out.printf("Surface Area:  %10.3f\n", surfaceArea);
        System.out.printf("Volume:        %10.3f\n", volume);
    }
    public static double surfaceArea (double r, double h)
    {
        return (2 * r * r * Math.PI) + 2 * Math.PI * r * h;
    }
    public static double volume (double r, double h)
    {
        return Math.PI * r * r * h;
    }
}
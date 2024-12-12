package A3;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"
        double radius;

        System.out.print("Enter the radius of your circle: \n\n");
        radius = keyboard.nextDouble();

        System.out.println("Circle Properties:");
        System.out.printf("Radius:        %10.3f\n", radius);
        System.out.printf("Circumference: %10.3f\n", ((Math.PI * radius) * 2));
        System.out.printf("Area:          %10.3f\n", (Math.pow(radius, 2) * Math.PI));
    }
}

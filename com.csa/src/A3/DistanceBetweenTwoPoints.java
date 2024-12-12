package A3;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // make a new Scanner called "keyboard"
        double x1, y1, x2, y2;

        System.out.print("Enter the x value of your first point (Whole Number):\n");
        x1 = scan.nextDouble();
        System.out.print("Enter the y value of your first point (Whole Number):\n");
        y1 = scan.nextDouble();
        System.out.print("Enter the x value of your second point (Whole Number):\n");
        x2 = scan.nextDouble();
        System.out.print("Enter the y value of your second point (Whole Number):\n");
        y2 = scan.nextDouble();
        System.out.print("\n");

        double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));

        System.out.println("The distance between (" + String.format("%.2f", x1) + "," + String.format("%.2f", y1) + ") and (" + String.format("%.2f", x2) + "," + String.format("%.2f", y2) + ") is " + String.format("%.2f", distance) + ".");
    }
}

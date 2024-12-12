package A3;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"
        int length;
        int width;
        System.out.print("Enter the length (whole number):\n");
        length = keyboard.nextInt();
        System.out.print("Enter the width (whole number):\n\n");
        width = keyboard.nextInt();
        System.out.println("Rectangle properties:");
        System.out.println("Length    - " + length);
        System.out.println("Width     - " + width);
        System.out.println("Perimeter - " + (2 * length + 2 * width));
        System.out.println("Area      - " + (length * width));
    }
}

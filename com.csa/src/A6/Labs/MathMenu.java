package A6.Labs;

import java.util.Scanner;


public class MathMenu {
    public static void main(String[] args) {
        printMenu(); // if less than 1 or greter than 4
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"
        int sel = keyboard.nextInt();
        while (sel != 4) {
            if (sel == 1) {
                System.out.println("Enter the base of the power:");
                double base = keyboard.nextInt();
                System.out.println("Enter the exponent of the power:");
                double exp = keyboard.nextInt();
                double pwr = Math.pow(base, exp);
                 // System.out.println(base + "^" + exp + " = " + pwr + "\n");
                System.out.printf("%.2f^%.2f = %.2f\n\n", base, exp, pwr);
                printMenu();
                sel = keyboard.nextInt();
            }
            if (sel == 2) {
                System.out.println("Enter the value to be squared:");
                double sqred = keyboard.nextInt();
                double sqr = Math.pow(sqred, 2);
                // System.out.println(sqred + "^2" + " = " + sqr + "\n");
                System.out.printf("%.2f^2 = %.2f\n\n", sqred, sqr);
                printMenu();
                sel = keyboard.nextInt();
            }
            if (sel == 3) {
                System.out.println("Enter the value for the square root:");
                double val = keyboard.nextInt();
                double sqrt = Math.sqrt(val);
                // System.out.println(val + "^.5" + " = " + sqrt + "\n");
                System.out.printf("%.2f^.5 = %.2f\n\n", val, sqrt);
                printMenu();
                sel = keyboard.nextInt();
            }
            if (sel < 1 || sel > 4) {
                System.out.println("Invalid input\n");
                printMenu();
                sel = keyboard.nextInt();
            }
        }
        if (sel == 4) {
            System.out.println("Good Bye.");
        }
    }
    public static void printMenu() {
            String var = ("Menu\n1. Power\n2. Square\n3. Square root\n4. Exit\nEnter selection:\n");
        System.out.println(var);
    }
}





package A5.Labs;

import java.util.Scanner;

public class MixedNumberV2 {
    public static void main(String[] args) {
        System.out.println("Enter the numerator of your fraction (Whole Number):");
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"
        int num = keyboard.nextInt();
        
        System.out.println("Enter the denominator of your fraction (Whole Number):");
        int den = keyboard.nextInt();

        if (remainder(num, den) > 0)
            System.out.println("\nThe mixed number derived from the fraction " + num + "/" + den + " is " + wholeNumber(num, den) + " " + fraction(num, den) + ".");
        if (remainder(num, den) == 0)
            System.out.println("\nThe whole number derived from the fraction " + num + "/" + den + " is " + wholeNumber(num, den) + ".");
    }

    public static int wholeNumber(int num, int den) {
        return num / den;
    }
    public static int remainder(int num, int den) {
        return num % den;
    }
    public static String fraction(int num, int den) {
            return num%den + "/" + den; // 6 /
        }
    }

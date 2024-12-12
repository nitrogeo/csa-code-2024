package A5.Labs;

import java.util.Random;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("---Menu---\n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius\nEnter your selection:\n");
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"
        int conv = keyboard.nextInt();

    if (conv == 1) {
        System.out.println("Enter your temperature in Celsius:\n");
        double cel = keyboard.nextInt();
        System.out.printf("%.2f degrees in Celsius is %.2f degrees in Fahrenheit.", cel, celToFah(cel));
    }
    else {
        System.out.println("Enter your temperature in Fahrenheit:\n");
        double fah = keyboard.nextInt();
        System.out.printf("%.2f degrees in Fahrenheit is %.2f degrees in Celsius.", fah, fahToCel(fah));
    }
}

    public static double celToFah(double cel) { // (32°C × 9/5) + 32 = 89.6°F
        return (cel * (9.0/5.0)) + 32;
    }
    public static double fahToCel(double fah) { // (32°F − 32) × 5/9 = °C
        return (fah - 32) * (5.0/9.0);
    }
}
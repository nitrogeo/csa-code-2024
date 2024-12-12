package A5.Labs;

import java.util.Random;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        System.out.println("Enter a year (whole number):\n");
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"
        int year = keyboard.nextInt();

    if (isLeapYear(year)) {
        System.out.println(year + " is a leap year.");
    }
    else {
        System.out.println(year + " is not a leap year.");
    }
}

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

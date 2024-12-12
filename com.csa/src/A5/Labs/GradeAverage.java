package A5.Labs;

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        System.out.println("Enter grade one:");
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"
        double grade1 = keyboard.nextDouble();

        System.out.println("Enter grade two:");
        double grade2 = keyboard.nextDouble();

        System.out.println("Enter grade three:");
        double grade3 = keyboard.nextDouble();

        System.out.println("Enter grade four:");
        double grade4 = keyboard.nextDouble();

        System.out.printf("\nYour average is %.2f.", average(grade1, grade2, grade3, grade4));
        System.out.println("\nYou have a(n) " + gradeLetter(average(grade1, grade2, grade3, grade4)) + ".");
    }

    public static char gradeLetter(double average) {
        if (average >= 90) {
            return 'A';
        }
        if (average >= 80 && average < 90) {
            return 'B';
        }
        if (average >= 75 && average < 80) {
            return 'C';
        }
        if (average >= 70 && average < 75) {
            return 'D';
        }
        if (average < 70) {
            return 'F';
        }
        return 0;
    }
    public static char gradeLetter(double grade1, double grade2, double grade3, double grade4) {
        double grLetAvg = (grade1 + grade2 + grade3 + grade4) / 4;
        return gradeLetter(grLetAvg);
    }
    public static double average(double grade1, double grade2, double grade3, double grade4) {
        return (grade1 + grade2 + grade3 + grade4) / 4;
    }
}

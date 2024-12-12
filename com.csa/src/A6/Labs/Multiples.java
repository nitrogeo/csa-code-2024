package A6.Labs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Multiples {

    // THIS IS MULTIPLES
    // THIS IS MULTIPLES
    // THIS IS MULTIPLES
    // THIS IS MULTIPLES
    // THIS IS MULTIPLES
    // THIS IS MULTIPLES
    // THIS IS MULTIPLES

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"
        int num = keyboard.nextInt();

        System.out.println("Enter the number of multiples you would like to see for the number " + num + ":");
        int mult = keyboard.nextInt();

        while (mult <= 0.9) {
            System.out.println("You must enter a positive number for the number of multiples.\nEnter the number of multiples you would like to see for the number " + num + ":");
            mult = keyboard.nextInt();
        }

        int list = 0;
        System.out.printf("\nThe first " + mult + " multiples of " + num + " are: ");


        for (int iter=1; iter<=mult; iter++) { //iter ation starts at one and goes up to mult it stops
            if(iter == mult) // if last multiple then stops
                System.out.print(iter * num);
            else {
                System.out.print(iter * num + ", "); // if not last multiple then keept multiplying by the next iter (1, 2, 3, ...) until u hit mult
            }
        }
    }

     /* public static gradeLetter(int num, int mult) {
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
    } */
}


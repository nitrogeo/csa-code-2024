package A6.Labs;

import java.util.Scanner;

public class SignCounter {
    public static void main(String[] args) {
        int num;
        int neg = 0;
        int pos = 0;
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"
        do {
            System.out.println("Enter a whole number (0 to quit): ");
            num = keyboard.nextInt();
            if (num < 0) {
                neg++;
            }
            if (num > 0) {
                pos++;
            }
        } while (num != 0);

        if (neg == 1 && pos == 1) {
            System.out.print("\nYou entered " + pos + " positive number and " + neg + " negative number.");
        }
        else if (pos == 1 && neg != 1) {
            System.out.print("\nYou entered " + pos + " positive number and " + neg + " negative numbers.");
        }
        else if (pos != 1 && neg == 1) {
            System.out.print("\nYou entered " + pos + " positive numbers and " + neg + " negative number.");
            // System.out.print("You entered %d positive number%s and %d negative number%s.\n", pos, pos == 1);
        }
        else if ((pos != 1 && neg != 1) || (pos == 0 && neg == 0)) {
            System.out.print("\nYou entered " + pos + " positive numbers and " + neg + " negative numbers.");
        }
    }
}

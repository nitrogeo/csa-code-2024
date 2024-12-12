package A6.Labs;

import java.util.Scanner;

public class Factors {
     /* public boolean isFactor(int num, int mult) {
        boolean isFactor = false;
        return isFactor; */

// all u do is if number % possible factor is 0 then its a factor

    public static void main(String[] args) {
        System.out.println("What number do you want to see the factors of (Positive Number)?");
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"
        int num = keyboard.nextInt();

        while (num <= 0.999) {
            System.out.println("What number do you want to see the factors of (Positive Number)?");
            num = keyboard.nextInt();
        }

        // i must mod the given number by all ints if doesnt return decimal than its a factor

        int list = 0;
        System.out.printf("\nThe factors of " + num + " are: ");

            for (int iter = 1; iter <= num; iter++) { // iter ation starts at one and goes up to num (BC AFTER THAT ITS NOT A FACTOR WOOO FIGURED IT OUT) then stops
                if (num % iter == 0) {
                    if (iter == num) { // if at num then stops
                        System.out.print(num + ".");
                        continue;
                    }
                    System.out.print(iter + ", ");
                }
             /* if (num % iter == 0) { // then its not a factor and keep going
                System.out.print(iter * num + ", ");
            }
            else {

            } */
        }
    }

    public static boolean isFactor(int num, int possibleFactor) {
        if (num % possibleFactor == 0) {
            return true;
        }
        else {
            return false;

        }
    }
}


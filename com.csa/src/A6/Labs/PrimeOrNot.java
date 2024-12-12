package A6.Labs;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a number (larger than 1):");
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"
        int num = keyboard.nextInt();

        while (num <= 1) {
            System.out.println("Enter a number (larger than 1):");
            num = keyboard.nextInt();
        }

        if (!isPrime(num)) {
            System.out.print(num + "is a prime number.");
        } else {
            System.out.print(num + "is not a prime number.");
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
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int iter = 2; iter < num; iter++) {
            if (num % iter == 0) {
                return false;
            }
        }
        return true;
    }
}
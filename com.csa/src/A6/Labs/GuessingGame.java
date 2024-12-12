package A6.Labs;

import java.util.Scanner;

import static java.lang.System.exit;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Do you want to cheat (Y/N)");
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"
        char cheat = keyboard.next().charAt(0); // the var cheat is the next char
        int hide = -1;
        boolean cheatTested = false; // this var checks if youve been asked if u wanna cheat
        while (!cheatTested) { // THIS SECTION checks if u wanna cheat - prob = if u cheat its not making ur number the var hide
            if (cheat == 'N') { // if u DONT wanna cheat
                cheatTested = true;
                hide = (int) (Math.random() * 1001 - 5); // THIS SECTION picks a random number
                System.out.print("\n");
            }
            if (cheat == 'Y') { // if u DO wanna cheat
                cheatTested = true;
                System.out.println("\nEnter the value for the hidden number in the range [1,000]:");
                hide = keyboard.nextInt(); // it asks u for hide
                System.out.print("\n");
            }
            else if (cheat != 'Y' && cheat != 'N'){ // if u dont enter y or n then it asks u again
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣤⣤⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡾⠟⠋⠉⠉⠉⠙⠛⠻⢿⣷⣄⠀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣷⡀⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣧⠀⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣇⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⡏⠀⠀⠀⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣿⣧⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⡇⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⣿⣿⡄⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⡇⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⡇⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⡇⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⡿⠃⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣷⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣾⡿⠋⠀⠀⠀⠀⠀\n" +
                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠿⠷⣶⣶⣶⣶⣶⣶⠾⠿⠛⠉⠀⠀⠀⠀⠀⠀⠀");
                exit(0);

            }
        }
        game(cheat, hide); // THIS SECTION starts the [squid] game
    }
    public static void game(char cheat, int hide) {
        System.out.println("I picked a number from 1 to 1000.\nTry to guess it.\n");
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"

        int attempts = 0; // THIS SECTION checks ur guesses
        int guess = 0;
        for (attempts = 0; guess != hide; attempts++) {
            System.out.print("Enter a guess:\n");
            guess = keyboard.nextInt();
            System.out.print("\n");

            if (guess < hide) {
                System.out.print("Too low, try again.\n");
            }
            else if (guess > hide) {
                System.out.print("Too high, try again.\n");
            }
        }
        System.out.println("You got my number in " + attempts + " guesses!");
    }
}


package A11.L1;

import A7.Labs.L2Dessert.IceCreamShop;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class A11_HangmanMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String usersent;
        int sel;
        char guess;

        // menu + sel
        System.out.print("\n-Menu-\n1. Enter Sentence\n2. Random Sentence\nEnter selection:\n\n");
        sel = scan.nextInt();
        scan.nextLine();

        A11_Hangman Game = new A11_Hangman();
        if (sel == 1) {
            System.out.println("Enter a sentence:\n");
            usersent = scan.nextLine();
            Game = new A11_Hangman(usersent);

            // gameplay
        }
        else if (sel == 2) {
            Game = new A11_Hangman();
            // gameplay
        }
        while (Game.guessesLeft() > 0 && !Game.won()) {
            Game.printSentence();
            System.out.println("\n");
            Game.printGuessed();
            System.out.print("Enter your guess:\n\n");
            guess = scan.next().charAt(0);
            if (!Game.addGuessedLetter(guess)) {
                if (Game.guessesLeft() < A11_Hangman.MAX_GUESSES && !Game.isInSentence(guess)) {
                    System.out.println("Incorrect guess.\n");
                    Game.printSentence();
                    if (Game.guessesLeft() == 0) System.out.println("\n\nYou failed to save this man.");
                }
            }
            if (Game.won()) {
                Game.printSentence();
                System.out.println("\n\nYou saved this man with " + Game.guessesLeft() + " wrong guesses still left.");
            }
        }

        // gameplay

    }
}

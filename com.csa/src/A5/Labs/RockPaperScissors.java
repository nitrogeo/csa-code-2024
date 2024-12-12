package A5.Labs;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("---Menu---\n1. Rock\n2. Paper\n3. Scissors\nEnter selection: ");
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"
        int player = keyboard.nextInt();

        Random randomGen = new Random();
        if(args!=null && args.length > 0)
            randomGen = new Random(Integer.parseInt(args[0]));
        int comp = randomGen.nextInt(3) + 1;

        System.out.println("\nYou picked: " + choiceText(player));
        System.out.println("The computer picked: " + choiceText(comp));
        System.out.println(gameResults(player, comp));
    }

    public static String gameResults(int player, int comp) {
        if (player == comp) {
            return "Tie Game.";
        }
        if (player == 1 && comp == 2) {
            return "Paper covers rock. You lose.";
        }
        if (player == 1 && comp == 3) {
            return "Rock crushes scissors. You win!";
        }
        if (player == 2 && comp == 1) {
            return "Paper covers rock. You win!";
        }
        if (player == 2 && comp == 3) {
            return "Scissors cut paper. You lose.";
        }
        if (player == 3 && comp == 1) {
            return "Rock crushes scissors. You lose.";
        }
        if (player == 3 && comp == 2) {
            return "Scissors cut paper. You win!";
        }
        else {
            return "Invalid Inputs";
        }
    }
    public static String choiceText(int player) {
        if (player == 1) {
            return "Rock";
        }
        if (player == 2) {
            return "Paper";
        }
        if (player == 3) {
            return "Scissors";
        }
        else {
            return "Invalid Input";
        }
    }
}

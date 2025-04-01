package A12.L1.ZombieDice;

import java.util.ArrayList;
import java.util.Scanner;

public class A12_ZombieDice_Main {
    /*need insp from sotirng numbers in variables code and code for math.random*/

    public static String[] names;
    public static int[] scores;
    public static ArrayList<A12_ZombieDie> hand;
    public static ArrayList<A12_ZombieDie> brains;
    public static ArrayList<A12_ZombieDie> shots;
    public static ArrayList<A12_ZombieDie> runners;

    // methods
    public static void shuffleNames(String[] names) {
        ArrayList 
    }
    public static String findWinner(String[] names, int[] scores) {

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sel;
        boolean won = false;
        int turnIndex;
        int[] turnOrder = new int[names.length];

        A12_ZombieDiceBucket buckees = new A12_ZombieDiceBucket();
        while (!won) {
            System.out.println("How many players will be playing (2-5):");
            sel = scan.nextInt();
            scan.nextLine();
            if (sel > 2 && sel < 5) {
                String[] names = new String[sel];
                for (int iter = 0; iter < names.length - 1; iter++) {
                    System.out.println("Enter a player's name:");
                    names[iter] = scan.next();
                    // somehow make each name be a a12_zombiedie var with the game's player attributes
                }
                // make random, nonrepeating turnorder list
                for (int iter = 0; iter < names.length - 1; iter++) {
                    int checker = (int)(Math.random() * names.length);
                    int safe = 0;
                    for (int iter1 = 0; iter1 < names.length - 1; iter1++) {
                        if (turnOrder[iter1] != checker) {
                            safe++;
                        }
                    }
                    if (safe == names.length) {
                        turnOrder[iter] = checker;
                    }
                }

                // iter thru turnorder for the game
                for (int iter = 0; iter < names.length - 1; iter++) {
                    System.out.println(names[turnOrder[iter]] + " it is your turn and you have " + names[turnOrder[iter]].brains /*acces the players's brain ct*/ + " brains in your bank.");
                }
            }
        }
    }
}

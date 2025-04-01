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
        /* iter thru names and pick random new index for the name,
        check if that index alr has that name,,, if not,
        save it to a new array called name 2

        when done return it
        */
        /*for (int iter = 0; iter < names.length - 1; iter++) {
            // save current index's current name
            String curname = names[iter];
            String[] names2 = new String[names.length];
            // make a random new index
            int newindx = (int)(Math.random() * names.length);
            *//* keep picking a new random index until
            the new index doesnt have the current name
            (until its actually a new index) *//*

            while (names[newindx] == curname) {
                newindx = (int)(Math.random() * names.length);
            }
            names2[newindx] = curname;
        }*/

        // noooo we have to swap indexes
        // swapping help from A8_CH2
        for (int iter = 0; iter < names.length - 1; iter++) {
            // make shuffled name array
            String[] names2 = new String[names.length];

            // make shuffled index array
            int[] namenums = new int[names.length];

            // save current index's current name
            String swapper = names[iter];
            // pick a random new index and save it
            int newindx = (int)(Math.random() * names.length);
            String swappee = names[newindx];

            // idk is swapping is done to names2 or og names
            names[iter] = swapper;
            names[newindx] = swappee;
        }
    }
    public static String findWinner(String[] names, int[] scores) {
        /*
        iter thru scores.
        add the names of the people with 13 to an array.
        if the array has 1 person, they wim (return their name).
        if the array has more than 1 person, only let those people play.
        if no winner, return null
        */
        ArrayList<String> winners = new ArrayList<>();
        for (int iter = 0; iter < scores.length; iter++) {
            if (scores[iter] >= 13) {
                winners.add(names[iter]);
            }
        }
        if (winners.size() >= 2) {
            // only let them play
        }
        if (winners.size() == 1) {
            return winners.get(0);
        }
        else {
            return null;
        }
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
                    // how its done: the iters of the names and scores match up
                }
                // make random, nonrepeating turnorder list
                // nvm call shuffleNames
                shuffleNames(names);
                // possible w/o shuffling others bc everyone is 0, also shots dotn carry btw turns

                // iter thru turnorder for the game
                for (int iter = 0; iter < names.length - 1; iter++) {
                    System.out.println(names[iter] + " it is your turn and you have " + scores[iter] + " brains in your bank.");

                    System.out.printf("\n\n%-8s\n%-8s\n%-8s\n%-8s", "Turn summary:", "Brains: [" + scores[iter] + "]", "Shots: [" + shots.get(iter) + "]", "Runners: [" + runners.get(iter));
                    System.out.print("\n1. Keep Going\n2. Stop & add to bank\nEnter selection:");
                }
            }
        }
    }
}

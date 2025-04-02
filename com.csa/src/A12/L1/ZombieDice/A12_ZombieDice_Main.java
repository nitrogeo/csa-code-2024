package A12.L1.ZombieDice;

import java.util.ArrayList;
import java.util.Scanner;

public class A12_ZombieDice_Main {
    /*need insp from sotirng numbers in variables code and code for math.random*/

    public static String[] names;
    public static int[] scores = new int[5];
    public static ArrayList<A12_ZombieDie> hand = new ArrayList<>(3);
    public static ArrayList<A12_ZombieDie> brains = new ArrayList<>(13);
    public static ArrayList<A12_ZombieDie> shots = new ArrayList<>(3);
    public static ArrayList<A12_ZombieDie> runners = new ArrayList<>(3);

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
        // turn gamble selection
        int tsel;
        boolean won = false;

        A12_ZombieDiceBucket buckees = new A12_ZombieDiceBucket();
        while (!won) {
            System.out.println("How many players will be playing (2-5):");
            sel = scan.nextInt();
            scan.nextLine();
            if (sel >= 2 && sel <= 5) {
                String[] names = new String[sel];
                for (int iter = 0; iter < names.length; iter++) {
                    System.out.println("Enter a player's name:");
                    names[iter] = scan.next();
                    scores[iter] = 0;
                    // somehow make each name be a a12_zombiedie var with the game's player attributes
                    // how its done: the iters of the names and scores match up
                }
                // make random, nonrepeating turnorder list
                // nvm call shuffleNames
                shuffleNames(names);
                // possible w/o shuffling others bc everyone is 0, also shots dotn carry btw turns

                // iter thru turnorder for the game
                for (int turn = 0; turn < names.length - 1; turn++) {
                    System.out.println(names[turn] + " it is your turn and you have " + scores[turn] + " brains in your bank.");

                    do {
                        /*System.out.printf("\n%16s\n%16s\n%16s\n%16s", "Turn summary:", "Brains: []", "Shots: []", "Runners: []");*/
                        System.out.println("        Turn summary:");
                        System.out.println("                Brains:  " + brains);
                        System.out.println("                Shots:   " + shots);
                        System.out.println("                Runners: " + shots);

                        System.out.print("\n1. Keep Going\n2. Stop & add to bank\nEnter selection:\n");
                        tsel = scan.nextInt();
                        scan.nextLine();

                        //  runners are on the table and then u pick them up ("unrolling" them and keeping same color) into your hand
                        for (int iter = 0; iter < runners.size(); iter++) {
                            runners.get(iter).setValue(A12_ZombieDie.NOT_ROLLED);
                            hand.add(runners.get(iter));
                        }
                        runners.clear();

                        if (tsel == 1) { // *****************************************
                            hand.clear();
                            runners.clear();
                            brains.clear();
                            shots.clear();

                            buckees.loadBucket();
                            hand.add(buckees.draw());
                            hand.add(buckees.draw());
                            hand.add(buckees.draw());

                            System.out.println("\nAfter drawing you have the following dice: " + hand);
                            System.out.printf("        Rolling...");
                            // iter thru hand and roll all dice
                            for (int dice = 0; dice < hand.size(); dice++) {
                                A12_ZombieDie die = hand.get(dice);
                                die.roll();
                            }
                            System.out.println("\nThe results of your rolls were: " + hand);
                            for (int iter2 = 0; iter2 < hand.size(); iter2++) {
                                if (hand.get(iter2) = ) {

                                }
                            }
                        }
                        if (tsel == 2) { // *****************************************
                            System.out.println("You ate " + brains.get(turn) + " brains this turn giving you " + scores[turn] + " brains now in your bank.");
                        }
                    } while (findWinner(names, scores) == null);
                }
            }
        }
    }
}

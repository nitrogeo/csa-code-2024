package A12.L1.VideoStore;

import java.util.ArrayList;
import java.util.Scanner;

public class A12_VideoStore_Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // renting menu sel
        int rmsel;
        // vid sel
        int vsel;
        String vmenu = "Video Menu";
        // game sel
        int gsel;
        String gmenu = "Game Menu";
        // rent check sel
        int rcsel;

        A12_VideoStore store = new A12_VideoStore();
        boolean done = false;
        while (!done) {
            // menu + sel
            // renting menu
            System.out.println("\nRenting Menu\n1. Rent Movie\n2. Rent Game\n3. Checkout\nEnter selection:");

            String checker = "";
            for (int iter = 0; iter < store.rentals.size(); iter++) {
                checker += ("\n" + (iter + 1) + ". " + store.rentals.get(iter).title);
            }
            System.out.println(checker);

            rmsel = scan.nextInt();
            if (rmsel == 1) {
                { // ***** SETUP
                    // add vids in stock to a new arraylist
                    ArrayList<A12_Rental> videos;
                    videos = store.videosInStock();
                    /*for (int iter = 0; iter < store.rentals.size(); iter++) {
                        if (store.rentals.get(iter) instanceof A12_Video) {
                            videos.add(store.rentals.get(iter).title);
                        }
                    }*/
                    // iter thru movies and add all items to the menu
                    for (int iter = 0; iter < videos.size(); iter++) {
                        vmenu += ("\n" + (iter + 1) + ". " + videos.get(iter).title);
                    }
                    vmenu += ("\n0. Cancel");

                    /*// iter thru games and add all items to the menu
                    String menu = "";
                    for (int iter = 0; iter < games.size(); iter++) {
                        menu += ("\n" + games.get(iter));
                    }*/
                }

                // ***** ACTUAL CODE

                System.out.print(vmenu);
                System.out.println("\nEnter selection:");
                vsel = scan.nextInt();
                if (vsel != 0) {
                    System.out.println("\n" + store.rentals.get(vsel - 1));

                    System.out.println("1 - Rent, 2 - Put Back\nEnter selection:");
                    rcsel = scan.nextInt();
                    if (rcsel == 1) {
                        store.rentals.get(vsel - 1).setRented(true);
                        vmenu = "";
                    }
                    if (rcsel == 2) {
                        vmenu = "";
                        continue;
                    }
                }
                else continue;
            }
            if (rmsel == 2) {
                { // ***** SETUP
                    // add games in stock to a new arraylist
                    ArrayList<A12_Rental> games;
                    games = store.gamesInStock();
                    /*for (int iter = 0; iter < store.rentals.size(); iter++) {
                        if (store.rentals.get(iter) instanceof A12_Game) {
                            games.add(store.rentals.get(iter).title);
                        }
                    }*/
                    // iter thru games and add all items to the menu
                    for (int iter = 0; iter < games.size(); iter++) {
                        gmenu += ("\n" + (iter + 1) + ". " + games.get(iter).title);
                    }
                    gmenu += ("\n0. Cancel");

                    /*// iter thru games and add all items to the menu
                    String menu = "";
                    for (int iter = 0; iter < games.size(); iter++) {
                        menu += ("\n" + games.get(iter));
                    }*/
                }

                // ***** ACTUAL CODE

                System.out.print(gmenu);
                System.out.print("\nEnter selection:");
                gsel = scan.nextInt();
                if (gsel != 0) {
                    System.out.print("\n" + store.rentals.get(gsel - 1));

                    System.out.println("1 - Rent, 2 - Put Back\nEnter selection:");
                    rcsel = scan.nextInt();
                    if (rcsel == 1) {
                        store.rentals.get(gsel - 1).setRented(true);
                        gmenu = "";
                    }
                    if (rcsel == 2) {
                        gmenu = "";
                        continue;
                    }
                }
                else continue;
            }
            if (rmsel == 3) {
                String receipt = "Receipt:\n\nRented Videos:";
                double subtot = 0;
                double fanum = 0;
                double tot = 0;
                ArrayList<A12_Rental> rentees = store.rented();

                // iter thru rented items and add to receipt and to totals
                for (int iter = 0; iter < store.rented().size(); iter++) {
                    receipt += ("\n    " + rentees.get(iter).title);
                    receipt += String.format("%20.2f", rentees.get(iter).cost);
                    subtot += store.rented().get(iter).cost;
                    fanum = subtot * .0825;
                    tot = subtot + fanum;
                }


                receipt += String.format("%-20s %15.2f\n%-20s %13.2f\n%-20s %13.2f\n", "\n\nSubtotal:", subtot, "Tax:", fanum, "Total:", tot);

                System.out.println(receipt);
                done = true;
            }
        }
    }
}

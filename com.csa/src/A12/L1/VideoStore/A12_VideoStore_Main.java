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
        boolean done = true;
        while (done) {
            // menu + sel
            // renting menu
            System.out.print("\nRenting Menu\n1. Rent Movie\n2. Rent Game\n3. Checkout\nEnter selection:\n");
            rmsel = scan.nextInt();
            scan.nextLine();
            if (rmsel == 1) {
                { // ***** SETUP
                    // iter thru rentals and add all games to a new arraylist
                    ArrayList<String> videos = new ArrayList<>();
                    for (int iter = 0; iter < store.rentals.size(); iter++) {
                        if (store.rentals.get(iter) instanceof A12_Video) {
                            videos.add(store.rentals.get(iter).title);
                        }
                    }
                    // iter thru games and add all items to the menu
                    for (int iter = 0; iter < videos.size(); iter++) {
                        vmenu += ("\n" + (iter + 1) + ". " + videos.get(iter));
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
                scan.nextLine();
                if (vsel != 0) {
                    System.out.println("\n" + store.rentals.get(vsel - 1));

                    System.out.println("1 - Rent, 2 - Put Back\nEnter selection:");
                    rcsel = scan.nextInt();
                    scan.nextLine();
                    if (rcsel == 1) {

                    }
                    if (rcsel == 2) {
                        continue;
                    }
                }
                else continue;
            }
            if (rmsel == 2) {
                { // ***** SETUP
                    // iter thru rentals and add all games to a new arraylist
                    ArrayList<String> games = new ArrayList<>();
                    for (int iter = 0; iter < store.rentals.size(); iter++) {
                        if (store.rentals.get(iter) instanceof A12_Video) {
                            games.add(store.rentals.get(iter).title);
                        }
                    }
                    // iter thru games and add all items to the menu
                    for (int iter = 0; iter < games.size(); iter++) {
                        gmenu += ("\n" + (iter + 1) + ". " + games.get(iter));
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
                System.out.println("\nEnter selection:");
                gsel = scan.nextInt();
                scan.nextLine();
                if (gsel != 0) {
                    System.out.println("\n" + store.rentals.get(gsel - 1));

                    System.out.println("1 - Rent, 2 - Put Back\nEnter selection:");
                    rcsel = scan.nextInt();
                    scan.nextLine();
                    if (rcsel == 1) {

                    }
                    if (rcsel == 2) {
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
                // iter thru rented items and add to receipt and to totals
                for (int iter = 0; iter < store.rented().size(); iter++) {
                    receipt += ("\n    " + (iter + 1) + ". " + store.rented());
                    subtot += store.rented().get(iter).cost;
                    fanum = subtot * .0825;
                    tot = subtot + fanum;
                }


                receipt += String.format("%-20s %20s\n%-20s %20.2f\n%-20s %20s\n%-20s %20.2f\n%-20s %20s\n%-20s %20.2f\n", "\n\nSubtotal:", subtot, "\nTax:", fanum, "Total:", tot);
            }
        }
    }
}

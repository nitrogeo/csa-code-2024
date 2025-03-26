package A12.L1.VideoStore;

import java.util.ArrayList;
import java.util.Scanner;

public class A12_VideoStore_Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sel;

        // menu + sel
        System.out.print("\nRenting Menu\n1. Rent Movie\n2. Rent Game\n3. Checkout\nEnter selection:\n");
        sel = scan.nextInt();
        scan.nextLine();

        A12_VideoStore store = new A12_VideoStore();
        if (sel == 1) {
            // iter thru rentals and add all games to a new arraylist
            ArrayList<String> videos =  new ArrayList<>();
            for (int iter = 0; iter < store.rentals.size(); iter++) {
                if (store.rentals.get(iter) instanceof A12_Video) {
                    videos.add(store.rentals.get(iter).title);
                }
            }
            // iter thru games and add all items to the menu
            String menu = "";
            for (int iter = 0; iter < videos.size(); iter++) {
                menu += ("\n" + (iter + 1) + ". " + videos.get(iter));
            }
            menu += ("\n0. Cancel");
            /*// iter thru games and add all items to the menu
            String menu = "";
            for (int iter = 0; iter < games.size(); iter++) {
                menu += ("\n" + games.get(iter));
            }*/
            System.out.print(menu);
            System.out.println("Enter selection:");
            sel = scan.nextInt();
            scan.nextLine();
        }
        if (sel == 2) {
            // iter thru rentals and add all games to a new arraylist
            ArrayList<String> games =  new ArrayList<>();
            for (int iter = 0; iter < store.rentals.size(); iter++) {
                if (store.rentals.get(iter) instanceof A12_Video) {
                    games.add(store.rentals.get(iter).title);
                }
            }
            // iter thru games and add all items to the menu
            String menu = "";
            for (int iter = 0; iter < games.size(); iter++) {
                menu += ("\n" + (iter + 1) + ". " + games.get(iter));
            }
            menu += ("\n0. Cancel");
            /*// iter thru games and add all items to the menu
            String menu = "";
            for (int iter = 0; iter < games.size(); iter++) {
                menu += ("\n" + games.get(iter));
            }*/
            System.out.print(menu);
            System.out.println("\nEnter selection:");
            sel = scan.nextInt();
            scan.nextLine();
            if (sel != 0) {
                System.out.println(games.get(sel-1));
            }
        }
    }
}

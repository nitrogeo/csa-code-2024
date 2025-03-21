package A12.L1.VideoStore;

import A12.L1.A12_Video;

import java.util.ArrayList;
import java.util.Scanner;

import static A12.L1.VideoStore.A12_VideoStore.rentals;

public class A12_VideoStore_Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sel;

        // menu + sel
        System.out.print("\nRenting Menu\n1. Rent Movie\n2. Rent Game\n3. Checkout\nEnter selection:\n");
        sel = scan.nextInt();
        scan.nextLine();
        if (sel == 1) {
            // iter thru rentals and add all games to a new arraylist
            ArrayList<A12_Video> games =  new ArrayList<>();
            for (int iter = 0; iter < rentals.size(); iter++) {
                if (rentals.get(iter) instanceof A12_Video) {
                    games.add((A12_Video) rentals.get(iter));
                }
            }
            // iter thru games and add all items to the menu
            String menu = "";
            for (int iter = 0; iter < games.size(); iter++) {
                menu += ("\n" + iter + ". " + games.get(iter));
            }
            System.out.print(menu);
        }
    }
}

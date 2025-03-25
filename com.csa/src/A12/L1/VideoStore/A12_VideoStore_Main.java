package A12.L1.VideoStore;

import A11.L1.A11_Hangman;

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
            ArrayList<A12_Video> games =  new ArrayList<>();
            for (int iter = 0; iter < store.rentals.size(); iter++) {
                if (store.rentals.get(iter) instanceof A12_Video) {
                    games.add((A12_Video) store.rentals.get(iter));
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

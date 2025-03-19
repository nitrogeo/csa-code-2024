package A12.L1.VideoStore;

import A12.L1.ZombieDice.A12_Game;

import java.util.ArrayList;

public class A12_VideoStore {
    // attributes
    String platform;
    ArrayList<A12_Rental> rentals;

    // constructors
    public A12_VideoStore() {
        rentals.add(new A12_Video("Iron Man 3", 3.99, A12_Video.PG13));
        rentals.add(new A12_Video("The Wolverine", 2.79, A12_Video.R));
        rentals.add(new A12_Video("The Avengers", 1.99, A12_Video.PG13));

        rentals.add(new A12_Game("Assassin's Creed", 4.99, A12_Game.MATURE, "Playstation 3", 1));
        rentals.add(new A12_Game("Frogger Advanced", 2.99, A12_Game.EARLY_CHILDHOOD, "Game Boy Advanced", 1));
        rentals.add(new A12_Game("Bomberman Land", 2.99, A12_Game.TEEN, "Super NES", 4));
    }

    // methods
    ArrayList<A12_Game> getGames() {
        for
    }
    ArrayList<A12_Video> getVideos() {

    }
    ArrayList<A12_Rental> rented() {
        ArrayList rented = new ArrayList();
        for (A12_Rental iter: rentals) {
            if (rentals.indexOf(iter).isRented) {
                rented+=Rental(iter);
            }
        }
        return rented;
    }
    ArrayList<Game> gamesInStock() {

    }
    ArrayList<Video> videosInStock() {

        
    }
}

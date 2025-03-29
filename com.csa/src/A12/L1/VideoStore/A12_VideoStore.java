package A12.L1.VideoStore;

import java.util.ArrayList;

public class A12_VideoStore {
    // attributes
    String platform;
    ArrayList<A12_Rental> rentals = new ArrayList<>();

    // constructors
    public A12_VideoStore() {
        rentals.add(new A12_Video("Iron Man 3", 3.99, A12_Video.PG13, "Shawn Black", 130));
        rentals.add(new A12_Video("The Wolverine", 2.79, A12_Video.R, "James Mangold", 126));
        rentals.add(new A12_Video("The Avengers", 1.99, A12_Video.PG13, "Joss Whedon", 143));

        rentals.add(new A12_Game("Assassin's Creed", 4.99, A12_Game.MATURE, "Playstation 3", 1));
        rentals.add(new A12_Game("Frogger Advanced", 2.99, A12_Game.EARLY_CHILDHOOD, "Game Boy Advanced", 1));
        rentals.add(new A12_Game("Bomberman Land", 2.99, A12_Game.TEEN, "Super NES", 4));
    }

    // methods
    public ArrayList<A12_Game> getGames() {
        ArrayList<A12_Game> games =  new ArrayList<>();
        for (int iter = 0; iter < rentals.size(); iter++) {
            if (rentals.get(iter) instanceof A12_Game) {
                games.add((A12_Game)rentals.get(iter));
            }
        }
        return games;
    }
    public ArrayList<A12_Video> getVideos() {
        ArrayList<A12_Video> videos =  new ArrayList<>();
        for (int iter = 0; iter < rentals.size(); iter++) {
            if (rentals.get(iter) instanceof A12_Video) {
                videos.add((A12_Video) rentals.get(iter));
            }
        }
        return videos;
    }
    public ArrayList<A12_Rental> rented() {
        ArrayList<A12_Rental> rented = new ArrayList();
        for (int iter = 0; iter < rentals.size(); iter++) {
            // if the current item is rented
            if (rentals.get(iter).isRented()) {
                rented.add(rentals.get(iter));
            }
        }
        return rented;
    }
    public ArrayList<A12_Rental> gamesInStock() {
        ArrayList<A12_Rental> insto = new ArrayList();
        for (int iter = 0; iter < rentals.size(); iter++) {
            // if the current item is rented
            if (!rentals.get(iter).isRented()) {
                if (rentals.get(iter) instanceof A12_Game) {
                    insto.add(rentals.get(iter));
                }
            }
        }
        return insto;
    }
    public ArrayList<A12_Rental> videosInStock() {
        ArrayList<A12_Rental> insto = new ArrayList();
        for (int iter = 0; iter < rentals.size(); iter++) {
            // if the current item is rented
            if (!rentals.get(iter).isRented()) {
                if (rentals.get(iter) instanceof A12_Game) {
                    insto.add(rentals.get(iter));
                }
            }
        }
        return insto;
    }
}

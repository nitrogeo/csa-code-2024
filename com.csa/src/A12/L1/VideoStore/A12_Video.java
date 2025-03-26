package A12.L1.VideoStore;

public class A12_Video extends A12_Rental {
    // attributes
    public static final int G = 0;
    public static final int PG = 1;
    public static final int PG13 = 2;
    public static final int R = 3;

    private String director;
    private int minutes;

    // constructors
    public A12_Video(String title, double cost, int rating, String director, int minutes) {
        super(title, cost, rating);
        this.director = director;
        this.minutes = minutes;
    }

    // methods
    public String getDirector() {
        return director;
    }
    public int getMinutes() {
        return minutes;
    }
    public String toString() {
        return String.format("%-20s %20s\n%-20s %20.2f\n%-20s %20s\n%-20s %20s\n%-20s %20s", "Title:", title, "Cost:", cost, "Rating:", rating, "Director:", director, "Runtime:", minutes + " minutes");
    }
}

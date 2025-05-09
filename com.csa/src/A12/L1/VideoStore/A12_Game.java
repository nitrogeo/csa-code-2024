package A12.L1.VideoStore;

public class A12_Game extends A12_Rental {
    // attributes
    public static final int EARLY_CHILDHOOD = 0;
    public static final int EVERYONE = 1;
    public static final int TEEN = 2;
    public static final int MATURE = 3;

    private String platform;
    private int numberOfPlayers;


    public A12_Game(String title, double cost, int rating, String platform, int numberOfPlayers) {
        super(title, cost, rating);
        this.platform = platform;
        this.numberOfPlayers = numberOfPlayers;
    }

    // methods
    public String getPlatform() {
        return platform;
    }
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }
    public String toString() {
        return String.format("%-20s %20s\n%-20s %20.2s\n%-20s %20s\n%-20s %20s\n%-20s %20s", "Title:", title, "Cost:", cost, "Rating:", rating, "Platform:", platform, "# of players:", numberOfPlayers);
    }
}

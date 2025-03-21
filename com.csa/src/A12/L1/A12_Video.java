package A12.L1;

public class A12_Video extends A12_Rental {
    // attributes
    public static final int G = 0;
    public static final int PG = 1;
    public static final int PG13 = 2;
    public static final int R = 3;

    private String director;
    private int minutes;

    // constructors
    public A12_Video(String title, double cost, int rating) {
        super(title, cost, rating);
        this.director = getDirector();
        this.minutes = getMinutes();
    }

    // methods
    String getDirector() {
        return director;
    }
    int getMinutes() {
        return minutes;
    }
    String toString() {

    }
}

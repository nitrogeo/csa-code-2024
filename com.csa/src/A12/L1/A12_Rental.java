package A12.L1;

public class A12_Rental {
    // attributes
    public String title;
    public double cost;
    public int rating;
    public boolean rented;

    // constructors
    public A12_Rental(String title, double cost, int rating) {
        this.title = title;
        this.cost = cost;
        this.rating = rating;

        rented = false;
    }

    // methods
    public String getTitle() {
        return title;
    }
    public double getCost() {
        return cost;
    }
    public int getRating() {
        return rating;
    }
    public boolean isRented() {
        return rented;
    }
    public void setRented(boolean rented) {
        this.rented = rented;
    }
    public String toString() {

    }
}

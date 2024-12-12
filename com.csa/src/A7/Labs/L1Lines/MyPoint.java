package A7.Labs.L1Lines;

public class MyPoint { // contains attributes
    double x;
    double y;

    public MyPoint(double x, double y) { // constructor
        this.x = x;
        this.y = y;
    }

    // methods below

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public String toString() {
        return String.format("(%.3f,%.3f)", x, y);
    }

}

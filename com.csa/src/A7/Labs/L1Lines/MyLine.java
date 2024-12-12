package A7.Labs.L1Lines;

public class MyLine { // contains attributes
    MyPoint p1;
    MyPoint p2;
    double slope;
    double xInt;
    double yInt;

    public MyLine(MyPoint p1, MyPoint p2) { // constructor
        this.p1 = p1;
        this.p2 = p2;
        fixData();
    }

    // methods below

    public MyPoint getPointOne() {
        return p1;
    }
    public MyPoint getPointTwo() {
        return p2;
    }
    public double getSlope() {
        return slope;
    }
    public double getYInt() {
        return yInt;
    }
    public double getXInt() {
        return xInt;
    }
    public void setPointOne(MyPoint p1) {
        this.p1 = p1;
        fixData();
    }
    public void setPointTwo(MyPoint p2) {
        this.p2 = p2;
        fixData();
    }
    public void fixData() {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();

        // slope
        slope = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        yInt = p1.getY() - slope * p1.getX();
        xInt = -yInt / slope;
    }


    public String toString() {
        String text = "";
        text += String.format("Points: [(%.3f,%.3f),(%.3f,%.3f)]", p1.getX(), p1.getY(), p2.getX(), p2.getY());
        text += String.format("\nSlope: %.3f", slope);
        text += String.format("\nX Intercept: %.3f", xInt);
        text += String.format("\nY Intercept: %.3f", yInt);
        text += String.format("\nEquation: y = %.3fx + %.3f", slope, yInt);
        return text;
    }
}

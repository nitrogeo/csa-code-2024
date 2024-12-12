package A7.CG2;

public class RectangularPrism { // contains attributes
    int length;
    int width;
    int height;

    public RectangularPrism() { // constructor
        length = 1;
        width = 1;
        height = 1;
    }

    public RectangularPrism(int length, int width, int height) { // constructor
        this.length = length; // sets the variable given to the method to this.var; u only need this. if its a parameter with same exact name
        this.width = width;
        this.height = height;
    }

    // methods below

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int surfaceArea() {
        return ((2 * length * width) + (2 * length * height) + (2 * height * width));
    }
    public int volume() {
        return (length * width * height);
    }
    public String toString() { // this.var references attribute when method has variable of same name
        String text = "";
        text += ("Dimensions: (" + getLength() + "/");
        text += (getWidth() + "/");
        text += (getHeight() + ") / ");
        text += ("Surface Area: (" + surfaceArea() + ") / ");
        text += ("Volume: (" + volume() + ")");
        return text;
    }
}
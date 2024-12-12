package A7.Labs.L2Dessert;

public class Dessert { // contains attributes
    int CONE = 0;
    int BOWL = 1;
    int WAFFLE_CONE = 2;
    private String itemName;
    private int container;
    private String flavor;
    private String toppings;
    private double cost;

    public Dessert(String itemName, int container, String flavor, String toppings, double cost) { // constructor
        this.itemName = itemName;
        this.container = container;
        this.flavor = flavor;
        this.toppings = toppings;
        this.cost = cost;
    }

    // methods below

    public String getItemName() {
        return itemName;
    }
    public String getContainer() {
        String contain = "";
        if (container == 0) {
            contain = "cone";
        }
        if (container == 1) {
            contain = "bowl";
        }
        if (container == 2) {
            contain = "waffle cone";
        }
        return contain;
    }
    public String getFlavor() {
        return flavor;
    }
    public String getToppings() {
        return toppings;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public String toString() {
        return String.format("(%5.2f): " + getItemName() + " - " + getFlavor() + " ice cream in a(n) " + getContainer() + " with " + getToppings() + ".",
                cost);
    }
}

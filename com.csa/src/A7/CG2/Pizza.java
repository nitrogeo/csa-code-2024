package A7.CG2;

public class Pizza { // contains attributes
    int numToppings;
    String customer;
    String maker;

    public Pizza() { // constructor
        numToppings = 0;
        customer = "";
        maker = "";
    }

    public Pizza(int numToppings, String customer, String maker) { // constructor
        this.numToppings = numToppings; // sets the variable given to the method to this.var; u only need this. if its a parameter with same exact name
        this.customer = customer;
        this.maker = maker;
    }

    // methods below

    public int getNumberOfToppings() {
        return numToppings;
    }
    public String getCustomer() {
        return customer;
    }
    public String getMaker() {
        return maker;
    }
    public void setCustomer(String c) {
        this.customer = c;
    }
    public void setMaker(String m) {
        this.maker = m;
    }
    public void setNumberOfToppings(int n) {
        this.numToppings = n;
    }
    public double price() {
        double price = 10;
        price += (numToppings * 0.5);
        return price;
    }
    public String toString() { // this.var references attribute when method has variable of same name
        String text = customer + " ordered a pizza from " + maker + " with " + numToppings + " topping(s), which costs $" + String.format("%.2f", price()) + ".";
        return text;
    }
}

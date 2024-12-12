package A7.Labs.L2Dessert;

public class IceCreamShop { // contains attributes
    private String storeName;
    private Dessert menuItem1;
    private Dessert menuItem2;
    private Dessert special;

    public IceCreamShop(String storeName) { // constructor
        this.storeName = storeName;
        menuItem1 = null;
        menuItem2 = null;
        special = null;
    }

    // methods below

    public Dessert getMenuItem1() {
        return menuItem1;
    }

    public Dessert getMenuItem2() {
        return menuItem2;
    }

    public Dessert getSpecial() {
        return special;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setMenuItem1(Dessert dessert) {
        menuItem1 = dessert;
    }

    public void setMenuItem2(Dessert dessert) {
        menuItem2 = dessert;
    }

    public void setSpecial(Dessert dessert) {
        special = dessert;
    }

    public String toString() {
        String text = String.format("---" + getStoreName() + "---\n");
        if ((menuItem1 == null) && (menuItem2 == null) && (special == null)) {
            text += "Menu Unavailable";
        }
        if ((menuItem1 != null) && (menuItem2 != null) && (special != null)) {
            text += String.format("1. " + menuItem1 + "\n2. " + menuItem2 + "\nS. " + special);
        }
        if ((menuItem1 != null) && (menuItem2 == null) && (special == null)) {
            text += String.format("1. " + menuItem1);
        }
        if ((menuItem2 != null) && (menuItem1 == null) && (special == null)) {
            text += String.format("2. " + menuItem2);
        }
        if ((special != null) && (menuItem2 == null) && (menuItem1 == null)) {
            text += String.format("S. " + special);
        }
        if ((menuItem1 != null) && (menuItem2 != null) && (special == null)) {
            text += String.format("1. " + menuItem1 + "\n2. " + menuItem2);
        }
        if ((menuItem1 == null) && (menuItem2 != null) && (special != null)) {
            text += String.format("2. " + menuItem2 + "\nS. " + special);
        }
        return text;
    }
}

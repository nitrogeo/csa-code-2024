package A10.L1;

public class A10_Maze {
    char[][] maze = new char[6][5];
    int playeColumn;
    int playerRow;
    int moveCount;

    public A10_Maze() { // constructor
        maze = new char[][]
                {{'W','W','W','W','W','-'},
                        {'S','-','-','-','W','-'},
                        {'W','W','W','-','W','-'},
                        {'W','-','W','-','W','-'},
                        {'E','-','W','-','-','-'},
                        {'W','-','-','-','W','W'}};
        playerRow = maze[1][0];
        moveCount = 0;
    }
    public A10_Maze(char[][] load) { // constructor
        char[][] newarg = new char[load.length][load[0].length];
        maze = newarg;

        playerRow = maze[1][0];
        moveCount = 0;
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

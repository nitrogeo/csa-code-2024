package A7.CG1;

public class MathWorks { // contains attributes
    String userName;
    int number;

    public MathWorks() { // constructor
        number = 100;
    } // if static cant use outside variables

    public MathWorks(int number) { // constructor
        this.number = number; // sets the variable given to the method to this.var; u only need this. if its a parameter with same exact name
    }


    // methods below
    public int getNumber() {
        return number;
    }
    public void add(int value) {
        number += value;
    }
    public void subtract(int value) {
        number -= value;
    }
    public void multiply(int value) {
        number *= value;
    }
    public void divide(int value) {
        number /= value;
    }
    public String toString() { // this.var references attribute when method has variable of same name
        String text = "";
        text += ("The number is currently " + number + ".");

        return text;
    }
}

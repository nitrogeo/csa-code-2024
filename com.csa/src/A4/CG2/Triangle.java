package A4.CG2;

public class Triangle {
    public static double hypotenuse(double side1, double side2)
    {
        double hypot = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return hypot;
    }
}

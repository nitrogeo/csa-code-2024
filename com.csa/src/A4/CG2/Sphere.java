package A4.CG2;

public class Sphere {
    /* Surface Area=4×π×r^2 */
    public static double surfaceArea(double radius)
    {
        double surfArea = (4 * (Math.PI) * Math.pow(radius, 2));
        return surfArea;
    }
    /* volume=4/3×π×r^3 */
    public static double volume(double radius)
    {
        double vol = ( (4.0/3.0) * (Math.PI) * Math.pow(radius, 3));
        return vol;
    }
}

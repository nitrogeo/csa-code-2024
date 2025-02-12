
// DON'T CHANGE THIS File
public class Point
{
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getQuadrant()
    {
        if(x >= 0)
        {
            if(y>=0)
                return 1;
            else
                return 4;
        }
        else
        {
            if(y>=0)
                return 2;
            else
                return 3;
        }
    }

    public boolean equals(Object o)
    {
        Point p = (Point)o;
        return x==p.x && y==p.y;
    }

    public String toString()
    {
        return "("+x+","+y+")";
    }
}

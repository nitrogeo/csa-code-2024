package A16;

import java.awt.*;
import javax.swing.*;

public class anipanel extends JPanel {

    public anipanel() {
        // creates the panel
        super();

        // sets the size of the panel
        setSize(1000, 800);
    }

    public void paint (Graphics g) {
        /*// draws a black box with an x in it
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.RED); ;
        g.drawLine (0, 0, getWidth(), getHeight());
        g.drawLine(getWidth(), 0, 0, getHeight());*/

        // sky = baby blue
        g.setColor(new Color(102, 146, 198)); // or 133 for blue idk
        g.fillRect(0, 0, getWidth(), getHeight());

        // clouds = greyish pink
        g.setColor(new Color(236, 216, 216)); // or 133 for blue idk

        int[] xPoints1 = {780, 653, 670, 795, 795, 548, 828, 828, 1000, 1000, 780};
        int[] yPoints1 = {0, 77, 118, 88, 118, 216, 180, 265, 216, 0, 0};

        g.fillPolygon(xPoints1, yPoints1, xPoints1.length);

        int[] xPoints1 = {780, 653, 670, 795, 795, 548, 828, 828, 1000, 1000, 780};
        int[] yPoints1 = {0, 77, 118, 88, 118, 216, 180, 265, 216, 0, 0};

        g.fillPolygon(xPoints1, yPoints1, xPoints1.length);


        // surface ground = beige
        g.setColor(new Color(204, 176, 92 )); // or 133 for blue idk
        g.fillRect(0, 600, getWidth(), getHeight());

        // below ground = dark brown
        g.setColor(new Color(132, 58, 22));
        g.fillRect(0, 620, getWidth(), getHeight());
    }
}

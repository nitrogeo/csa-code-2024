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

        // bkg stuff
        {
            // sky + clouds
            {
                // sky = baby blue ******************************
                g.setColor(new Color(102, 146, 198)); // or 133 for blue idk
                g.fillRect(0, 0, getWidth(), getHeight());

                // clouds = greyish pink ******************************

                // cloud color
                g.setColor(new Color(236, 216, 216)); // or 133 for blue idk

                // cloud 1
                int[] xPoints1 = {780, 653, 670, 795, 795, 548, 828, 828, 1000, 1000, 780};
                int[] yPoints1 = {0, 77, 118, 88, 118, 216, 180, 265, 216, 0, 0};

                g.fillPolygon(xPoints1, yPoints1, xPoints1.length);

                // cloud 2
                int[] xPoints2 = {780, 653, 670, 795, 795, 548, 828, 828, 1000, 1000, 780};
                int[] yPoints2 = {0, 77, 118, 88, 118, 216, 180, 265, 216, 0, 0};

                g.fillPolygon(xPoints2, yPoints2, xPoints2.length);
            }

            // rock
            g.setColor(new Color(150, 120, 140)); // or 133 for blue idk

            int[] xPoints3 = {245, 814, 1000, 1000, 0, 0, 66};
            int[] yPoints3 = {479, 479, 611, 800, 800, 680, 551};

            g.fillPolygon(xPoints3, yPoints3, xPoints3.length);


            // ground
            {
                // surface ground = beige
                g.setColor(new Color(204, 176, 92)); // or 133 for blue idk
                g.fillRect(0, 600, getWidth(), getHeight());

                // below ground = dark brown
                g.setColor(new Color(132, 58, 22));
                g.fillRect(0, 620, getWidth(), getHeight());
            }
        }

        // charmander!!!
        {
            // main stuff****************
            {
                // head
                g.setColor(new Color(234, 124, 47));
                g.fillOval(410, 10, 190, 210);

                // neck
                int[] xPoints4 = {413, 600, 602, 554, 414};
                int[] yPoints4 = {135, 119, 177, 212, 224};

                g.fillPolygon(xPoints4, yPoints4, xPoints4.length);

                // body
                g.fillOval(386, 162, 192, 285);

                // legs 
                {
                    // r leg
                    int[] xPoints5 = {386, 00, 00, 00, 00};
                    int[] yPoints5 = {308, 00, 00, 00, 00};

                    g.fillPolygon(xPoints5, yPoints5, xPoints5.length);

                    // L leg

                }
                
                // chest

                // tail
                {
                    // tail

                    // tail flame outer

                    // tail flame inner

                }

                // arms
                {
                    // L arm

                    // r arm

                }

                // face
                {
                    // r nos

                    // L nos

                    // mouth

                    // eyebrow 2

                    // eyebrow 1

                    // eyes
                    {
                        // smol color

                        // big color

                        // big black

                        // smol black

                        // big white

                        // smol white
                    }
                }
            }
            //

        }
    }
}

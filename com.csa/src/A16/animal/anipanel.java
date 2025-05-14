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

        // reused colors
        Color orange = new Color(234, 124, 47);
        Color darkOrange = new Color(228, 112, 30);
        Color turqoise = new Color(52, 129, 142);

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
                g.setColor(Color.orange);
                g.fillOval(410, 10, 190, 210);

                // neck
                int[] xPoints4 = {413, 600, 602, 554, 414};
                int[] yPoints4 = {135, 119, 177, 212, 224};

                g.fillPolygon(xPoints4, yPoints4, xPoints4.length);

                // body
                g.fillOval(386, 162, 192, 285);
            }

            // legs 
            {
                // r leg
                int[] xPoints5 = {386, 442, 425, 345, 372, 353};
                int[] yPoints5 = {308, 417, 494, 494, 468, 450};
                
                g.setColor(Color.darkOrange);
                g.drawPolygon(xPoints5, yPoints5, xPoints5.length);
                g.setColor(Color.orange);
                g.fillPolygon(xPoints5, yPoints5, xPoints5.length);

                // L leg
                int[] xPoints6 = {575, 625, 584, 607, 520, 520};
                int[] yPoints6 = {386, 411, 458, 482, 482, 396};

                g.setColor(Color.darkOrange);
                g.drawPolygon(xPoints6, yPoints6, xPoints6.length);
                g.setColor(Color.orange);
                g.fillPolygon(xPoints6, yPoints6, xPoints6.length);
            }
            
            // chest
            g.setColor(new Color(242, 225, 133));
            g.fillOval(421, 210, 157, 237);

            // tail
            {
                // tail
                g.setColor(Color.orange);

                int[] xPoints7 = {316, 326, 320, 326, 353, 379, 370, 316, 279, 276, 300};
                int[] yPoints7 = {202, 206, 240, 388, 325, 343, 425, 407, 353, 280, 225};
                g.fillPolygon(xPoints7, yPoints7, xPoints7.length);

                // tail flame outer
                g.setColor(new Color(222, 77, 48));

                int[] xPoints8 = {326, 359, 364, 359, 326, 316, 289, 284, 300};
                int[] yPoints8 = {44, 100, 144, 183, 206, 202, 183, 140, 100};
                g.fillPolygon(xPoints8, yPoints8, xPoints8.length);

                // tail flame inner
                g.setColor(new Color(222, 77, 48));

                int[] xPoints9 = {326, 359, 364, 359, 326, 316, 289, 284, 300};
                int[] yPoints9 = {44, 100, 144, 183, 206, 202, 183, 140, 100};
                g.fillPolygon(xPoints9, yPoints9, xPoints9.length);
            }

            // arms
            {
                // L arm
                g.setColor(Color.orange);

                int[] xPoints10 = {543, 566, 585, 563, 556, 316, 540, 538, 525, 538};
                int[] yPoints10 = {230, 231, 304, 357, 349, 202, 357, 343, 338, 322};

                g.setColor(Color.darkOrange);
                g.drawPolygon(xPoints10, yPoints10, xPoints10.length);
                g.setColor(Color.orange);
                g.fillPolygon(xPoints10, yPoints10, xPoints10.length);

                // r arm
                int[] xPoints11 = {403, 452, 480, 490, 480, 480, 465, 457, 394};
                int[] yPoints11 = {229, 236, 324, 337, 341, 357, 350, 359, 277};

                g.setColor(Color.darkOrange);
                g.drawPolygon(xPoints11, yPoints11, xPoints11.length);
                g.setColor(Color.orange);
                g.fillPolygon(xPoints11, yPoints11, xPoints11.length);
            }

            // face
            {
                // r nostril
                g.setColor(Color.darkOrange);

                int[] xPoints12 = {524, 524};
                int[] yPoints12 = {174, 180};
                g.drawPolyline(xPoints12, yPoints12, xPoints12.length);

                // L nostril
                int[] xPoints12 = {541, 541};
                int[] yPoints12 = {174, 179};
                g.drawPolyline(xPoints12, yPoints12, xPoints12.length);

                // mouth
                int[] xPoints12 = {443, 451, 516, 532, 539, 548, 584, 590};
                int[] yPoints12 = {174, 180, 184, 193, 192, 184, 177, 171};
                g.drawPolyline(xPoints12, yPoints12, xPoints12.length);

                // eyebrow 2
                int[] xPoints12 = {569, 561};
                int[] yPoints12 = {62, 72};
                g.drawPolyline(xPoints12, yPoints12, xPoints12.length);

                // eyebrow 1
                int[] xPoints12 = {476, 484};
                int[] yPoints12 = {60, 70}; // 6 7 lol
                g.drawPolyline(xPoints12, yPoints12, xPoints12.length);
                
                // eyes
                {
                    // smol color
                    g.setColor(Color.turqoise));
                    g.drawOval(565, 77, 26, 74);

                    // big color
                    g.drawOval(440, 80, 42, 74);

                    // big black
                    g.setColor(Color.BLACK);
                    g.drawOval(451, 85, 23, 48);

                    // smol black
                    g.drawOval(565, 85, 20, 47);

                    // big white
                    g.setColor(Color.WHITE);
                    g.drawOval(461, 86, 14, 32);

                    // smol white
                    g.drawOval(565, 86, 13, 30);
                }
            }
        }
    }
}

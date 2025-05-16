package A16.drivingAlong;

import java.awt.*;
import javax.swing.*;

public class drivepanel extends JPanel {

    public drivepanel() {
        // creates the panel
        super();

        // sets the size of the panel
        setSize(1000, 800);
    }

    public void paint (Graphics g) {
        /*
        // draws a black box with an x in it
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.RED); ;
        g.drawLine (0, 0, getWidth(), getHeight());
        g.drawLine(getWidth(), 0, 0, getHeight());
        */

        // reused colors
        Color green = new Color(234, 124, 47);
        Color darkOrange = new Color(228, 112, 30);
        Color turquoise = new Color(52, 129, 142);

        // bkg stuff
        {
            // sky + clouds
            {
                // sky = baby blue ******************************
                g.setColor(new Color(220, 233, 246)); // or 133 for blue idk
                g.fillRect(0, 0, getWidth(), getHeight());

                // clouds = greyish pink ******************************

                // cloud color
                g.setColor(new Color(255, 255, 255)); // or 133 for blue idk

                // cloud 1
                int[] xPoints1 = {35, 102, 173, 173, 239, 192};
                int[] yPoints1 = {85, 51,  44,  72,  85,  93};

                g.fillPolygon(xPoints1, yPoints1, xPoints1.length);

                // cloud 2
                int[] xPoints2 = {358, 369, 411, 471, 455, 568, 538};
                int[] yPoints2 = {76,  110, 56,  28,  110, 58,  104};

                g.fillPolygon(xPoints2, yPoints2, xPoints2.length);

                // cloud 3
                int[] xPoints3b = {640, 714, 744, 773, 839, 788, 732};
                int[] yPoints3b = {78,  58,  66,  49,  71,  110, 87};

                g.fillPolygon(xPoints3b, yPoints3b, xPoints3b.length);
            }

            // sun
            g.setColor(new Color(255, 253, 187)); // or 133 for blue idk

            int[] xPoints3 = {245, 814, 1000, 1000, 0, 0, 66};
            int[] yPoints3 = {479, 479, 611, 800, 800, 680, 551};

            g.fillOval(810, 128, 100, 100);


            // mtn
            {
                // surface ground = beige
                g.setColor(new Color(114, 117, 123)); // or 133 for blue idk

                int[] xPoints4 = {0,   215, 103, 39,  48,  170, 304, 344, 360, 432, 518, 662, 693, 835, 917, 1018, 1203, 0,    0};
                int[] yPoints4 = {100, 102, 181, 198, 205, 268, 231, 247, 231, 259, 198, 299, 260, 231, 164, 171,  833,  1367, 1008};

                g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
            }

            // ground
            {
                // surface ground = beige
                g.setColor(new Color(219, 199, 183)); // or 133 for blue idk
                g.fillRect(0, 450, getWidth(), getHeight());
            }

            // road
            {
                // dark grey
                g.setColor(new Color(68, 68, 68)); // or 133 for blue idk

                int[] xPoints4 = {0,   0,   1135, 1346};
                int[] yPoints4 = {610, 767, 456,  413};

                g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
            }


        }

        // cyber!!!
        {

            // windshield
            {
                // dark grey
                g.setColor(new Color(39, 46, 53)); // or 133 for blue idk

                int[] xPoints4 = {273,   391,   289,  137};
                int[] yPoints4 = {392,   389,   450,  450};

                g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
            }
            // frunk
            {
                // dark grey
                g.setColor(new Color(39, 46, 53)); // or 133 for blue idk

                int[] xPoints4 = {273,   391,   289,  137};
                int[] yPoints4 = {392,   389,   450,  450};

                g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
            }



            // legs 
            {
                // r leg
                int[] xPoints5 = {386, 442, 425, 345, 372, 353};
                int[] yPoints5 = {308, 417, 494, 494, 468, 450};
                
                g.setColor(darkOrange);
                g.drawPolygon(xPoints5, yPoints5, xPoints5.length);
                g.setColor(Color.orange);
                g.fillPolygon(xPoints5, yPoints5, xPoints5.length);

                // L leg
                int[] xPoints6 = {575, 625, 584, 607, 520, 520};
                int[] yPoints6 = {386, 411, 458, 482, 482, 396};

                g.setColor(darkOrange);
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

                g.setColor(darkOrange);
                g.drawPolygon(xPoints10, yPoints10, xPoints10.length);
                g.setColor(Color.orange);
                g.fillPolygon(xPoints10, yPoints10, xPoints10.length);

                // r arm
                int[] xPoints11 = {403, 452, 480, 490, 480, 480, 465, 457, 394};
                int[] yPoints11 = {229, 236, 324, 337, 341, 357, 350, 359, 277};

                g.setColor(darkOrange);
                g.drawPolygon(xPoints11, yPoints11, xPoints11.length);
                g.setColor(Color.orange);
                g.fillPolygon(xPoints11, yPoints11, xPoints11.length);
            }

            // face
            {
                // r nostril
                g.setColor(darkOrange);

                int[] xPoints12 = {524, 524};
                int[] yPoints12 = {174, 180};
                g.drawPolyline(xPoints12, yPoints12, xPoints12.length);

                // L nostril
                int[] xPoints13 = {541, 541};
                int[] yPoints13 = {174, 179};
                g.drawPolyline(xPoints13, yPoints13, xPoints13.length);

                // mouth
                int[] xPoints14 = {443, 451, 516, 532, 539, 548, 584, 590};
                int[] yPoints14 = {174, 180, 184, 193, 192, 184, 177, 171};
                g.drawPolyline(xPoints14, yPoints14, xPoints14.length);

                // eyebrow 2
                int[] xPoints15 = {569, 561};
                int[] yPoints15 = {62, 72};
                g.drawPolyline(xPoints15, yPoints15, xPoints15.length);

                // eyebrow 1
                int[] xPoints16 = {476, 484};
                int[] yPoints16 = {60, 70}; // 6 7 lol
                g.drawPolyline(xPoints16, yPoints16, xPoints16.length);
                
                // eyes
                {
                    // smol color
                    g.setColor(turquoise);
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

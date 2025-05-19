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
                int[] xPoints3 = {640, 714, 744, 777, 839, 777, 732};
                int[] yPoints3 = {78,  58,  66,  49,  71,  110, 87};

                g.fillPolygon(xPoints3, yPoints3, xPoints3.length);
            }

            // sun
            g.setColor(new Color(255, 253, 187)); // or 133 for blue idk
            g.fillOval(810, 128, 100, 100);

            // mtn - simple ver
            {
                // main bkg
                g.setColor(new Color(114, 117, 123)); // or 133 for blue idk

                int[] xPoints4 = {-42, 48,  170, 304, 344, 360, 432, 518, 662, 693, 777, 835, 917, 1203, -242};
                int[] yPoints4 = {186, 205, 268, 231, 247, 231, 259, 198, 299, 259, 235, 231, 164, 833,  847};

                g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
            }

            // ground????????? --- run in intellij to fix
            {
                // surface ground = beige
                // g.setColor(new Color(219, 199, 183)); // or 133 for blue idk
                // g.fillRect(0, 450, getWidth(), getHeight());
            
                // surface ground = beige OG
                g.setColor(new Color(114, 117, 123));

                int[] xPoints4 = {0,   215, 103, 39,  48,  170, 304, 344, 360, 432, 518, 662, 693, 835, 917, 1018, 1203, 0,    0};
                int[] yPoints4 = {100, 102, 181, 198, 205, 268, 231, 247, 231, 259, 198, 299, 260, 231, 164, 171,  833,  1367, 1008};

                g.fillPolygon(xPoints4, yPoints4, xPoints4.length);

                // surface ground = beige V2 IDKDDKDKDKKDKD
                g.setColor(new Color(114, 117, 123));

                int[] xPoints4 = {-237, 59,  116, 150, 213, 636, 800, 909, 1145, 1155, 1219, 662, 1289, 1407, 1420, -289};
                int[] yPoints4 = {599,  539, 534, 536, 534, 495, 469, 466, 435,  495,  536,  299, 530,  533,  819,  844};

                g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
            }

            // grass
            {
                 // dark green
                

                int[] xPoints4 = {  0, 23,  31,  73,  135, 170, 263, 361, 522, 682, 824, 840, 868, 886, 928, 953, 1034, 1051, -74};
                int[] yPoints4 = {463, 465, 484, 468, 473, 455, 461, 476, 461, 473, 473, 460, 464, 447, 467, 438, 418,  833,  833};

                g.setColor(new Color(95, 82, 46));
                g.drawPolygon(xPoints4, yPoints4, xPoints4.length);
                g.setColor(new Color(148, 138, 95));
                g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
            }

            // road
            {
                // dark grey
                g.setColor(new Color(68, 68, 68));

                int[] xPoints4 = {-451, -81, 1165, 1423};
                int[] yPoints4 = {630,  767, 485,  434};

                g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
            }


        }

        // cyber!!!
        {
            // FRONT
            {
                // windshield
                {
                    // dark grey
                    g.setColor(new Color(39, 46, 53)); 

                    int[] xPoints4 = {298, 450, 553, 434};
                    int[] yPoints4 = {449, 450, 389, 392};

                    g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                }
                // frunk hood
                {
                    // silver
                    g.setColor(new Color(39, 46, 53)); 

                    int[] xPoints4 = {298, 450, 414, 381, 260, 253};
                    int[] yPoints4 = {449, 450, 471, 478, 476, 468};

                    g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                }
                // headlight bar
                {
                    // white
                    g.setColor(new Color(39, 46, 53));

                    int[] xPoints4 = {253, 260, 362, 414, 414, 362, 259, 253};
                    int[] yPoints4 = {468, 476, 478, 471, 480, 483, 481, 476};

                    g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                }
                // front bumper
                {        
                    // main front       
                    // silver
                    g.setColor(new Color(145, 159, 170));

                    int[] xPoints4 = {259, 362, 366, 259};
                    int[] yPoints4 = {481, 483, 524, 518};

                    g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                
                    // far side front
                    // lighter silver
                    g.setColor(new Color(213, 222, 231));

                    int[] xPoints4 = {253, 259, 259, 253};
                    int[] yPoints4 = {476, 481, 518, 515};

                    g.fillPolygon(xPoints4, yPoints4, xPoints4.length);

                    // near side front
                    // darker silver
                    g.setColor(new Color(85, 95, 106));

                    int[] xPoints4 = {362, 414, 413, 366};
                    int[] yPoints4 = {483, 480, 524, 524};

                    g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                


                    // front bumper bottom
                    {
                        // front bumper bottom under
                        // very dark grey
                        g.setColor(new Color(19, 22, 27));
                        
                        int[] xPoints4 = {257, 371, 408, 392, 277, 266};
                        int[] yPoints4 = {551, 561, 561, 574, 565, 559};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                        

                        // front bumper bottom under left
                        g.setColor(new Color(41, 45, 52));
                        
                        int[] xPoints4 = {252, 257, 266, 277, 274, 254};
                        int[] yPoints4 = {549, 551, 559, 565, 568, 565};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                    

                        // front bumper grill
                        g.setColor(new Color(23, 26, 31));
                        
                        int[] xPoints4 = {253, 365, 371, 257};
                        int[] yPoints4 = {534, 543, 561, 551};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                    
                    

                        // front bumper left bottom
                        g.setColor(new Color(23, 26, 31));
                        
                        int[] xPoints4 = {249, 253, 253, 257, 252, 249};
                        int[] yPoints4 = {521, 524, 534, 551, 549, 531};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                    
                    
                        // front bumper bottom main
                        g.setColor(new Color(34, 38, 45));
                        
                        int[] xPoints4 = {249, 256, 260, 277, 366, 424, 416, 399, 392, 408, 371, 365, 253, 253};
                        int[] yPoints4 = {521, 521, 523, 525, 529, 531, 580, 580, 574, 561, 561, 543, 534, 524};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                    
                    
                        // front bumper shelf
                        g.setColor(new Color(27, 31, 38));
                        
                        int[] xPoints4 = {256, 260, 278, 366, 413, 427, 424, 366, 278, 260, 256};
                        int[] yPoints4 = {516, 518, 519, 524, 524, 523, 531, 529, 525, 523, 521};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                    }


                    // side window
                    {
                        // side window mid bar
                        g.setColor(new Color(57, 63, 74));

                        int[] xPoints4 = {572, 580, 593, 580};
                        int[] yPoints4 = {398, 400, 444, 445};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                    

                        // side window back bar
                        g.setColor(new Color(52, 59, 65));
                        
                        int[] xPoints4 = {632, 640, 651, 644};
                        int[] yPoints4 = {412, 414, 439, 439};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                    

                        // side window front
                        g.setColor(new Color(70, 79, 91));
                        
                        int[] xPoints4 = {517, 519, 453};
                        int[] yPoints4 = {534, 451, 458};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                    
                    
                        // side window mid
                        g.setColor(new Color(83, 92, 105));
                        
                        int[] xPoints4 = {557, 572, 581, 519, 517};
                        int[] yPoints4 = {394, 398, 445, 451, 419};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                    
                    
                        // back window
                        g.setColor(new Color(70, 78, 91));
                        
                        int[] xPoints4 = {581, 632, 644, 539};
                        int[] yPoints4 = {400, 412, 439, 444};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                    }

                    // side
                    {
                        // side triangle metal ~OR~ top side metal frame
                        {
                            // silver
                            g.setColor(new Color(211, 222, 234));

                            int[] xPoints4 = {553, 750, 414};
                            int[] yPoints4 = {389, 440, 471};

                            g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                        }

                        // under-side lol
                        g.setColor(new Color(19, 22, 28));
                        
                        int[] xPoints4 = {512, 659, 674, 522, 511};
                        int[] yPoints4 = {549, 533, 534, 551, 553};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                    
                    
                        // under bottom
                        g.setColor(new Color(20, 23, 29));
                        
                        int[] xPoints4 = {511, 522, 674, 671, 655, 652, 508};
                        int[] yPoints4 = {553, 551, 534, 556, 555, 550, 565};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                    
                       
                        // back under top
                        g.setColor(new Color(50, 53, 60));
                        
                        int[] xPoints4 = {728, 737, 737, 750, 728};
                        int[] yPoints4 = {501, 499, 502, 502, 510};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);

                        
                        // back under bottom
                        g.setColor(new Color(41, 46, 54));
                        
                        int[] xPoints4 = {728, 750, 746, 726, 724};
                        int[] yPoints4 = {510, 502, 516, 532, 537};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                    
                        // tire rims
                        {
                            // front tire rim 
                            g.setColor(new Color(41, 46, 54));
                            
                            int[] xPoints4 = {436, 492, 514, 494, 447, 427, 41};
                            int[] yPoints4 = {478, 473, 531, 482, 486, 523, 524};

                            g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                            
                            
                            // back tire rim
                            {
                                // back tire rim front
                                g.setColor(new Color(22, 26, 33));
                            
                                int[] xPoints4 = {666, 677, 674, 659};
                                int[] yPoints4 = {514, 514, 534, 533};

                                g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                                

                                // back tire rim back
                                g.setColor(new Color(60, 67, 74));
                        
                                int[] xPoints4 = {716, 728, 717};
                                int[] yPoints4 = {465, 501, 473};

                                g.fillPolygon(xPoints4, yPoints4, xPoints4.length);

                                // back tire rim top
                                g.setColor(new Color(60, 65, 75));
                        
                                int[] xPoints4 = {682, 716, 717, 691};
                                int[] yPoints4 = {467, 465, 473, 475};

                                g.fillPolygon(xPoints4, yPoints4, xPoints4.length);

                                // back tire rim forward
                                g.setColor(new Color(39, 44, 52));
                        
                                int[] xPoints4 = {682, 691, 676, 666};
                                int[] yPoints4 = {467, 475, 514, 514};

                                g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                            }
                        }

                        // side doors top metal
                        {
                            // back passenger door top
                            g.setColor(new Color(211, 222, 233));
                        
                            int[] xPoints4 = {593, 651, 654, 594};
                            int[] yPoints4 = {444, 439, 448, 454};

                            g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                        

                            // driver door top
                            g.setColor(new Color(181, 194, 209));
                        
                            int[] xPoints4 = {515, 593, 594, 515};
                            int[] yPoints4 = {452, 444, 454, 461};

                            g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                        

                            
                        }

                        // side bottom metal
                        {
                            // front tire metal
                            g.setColor(new Color(96, 108, 121));
                        
                            int[] xPoints4 = {414, 515, 514, 492, 436, 413, 414, 414};
                            int[] yPoints4 = {471, 461, 531, 473, 478, 524, 480, 471};

                            g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                        
                        
                            // driver door
                            g.setColor(new Color(77, 88, 99));
                        
                            int[] xPoints4 = {515, 594, 592, 514};
                            int[] yPoints4 = {461, 454, 522, 531};

                            g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                        
                        
                            // driver door bottom
                            g.setColor(new Color(45, 50, 58));

                            int[] xPoints4 = {514, 592, 587, 512};
                            int[] yPoints4 = {531, 522, 541, 549};

                            g.fillPolygon(xPoints4, yPoints4, xPoints4.length);


                            // back passenger door
                            g.setColor(new Color(90, 100, 113));

                            int[] xPoints4 = {594, 654, 651, 592};
                            int[] yPoints4 = {454, 448, 515, 522};

                            g.fillPolygon(xPoints4, yPoints4, xPoints4.length);


                            // back passenger door bottom
                            g.setColor(new Color(46, 52, 60));
                        
                            int[] xPoints4 = {592, 651, 645, 587};
                            int[] yPoints4 = {522, 515, 535, 541};

                            g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                        
                        
                            // back tire metal
                            g.setColor(new Color(128, 139, 152));
                        
                            int[] xPoints4 = {654, 750, 746, 728, 728, 682, 667, 651};
                            int[] yPoints4 = {448, 440, 497, 501, 465, 467, 514, 551};

                            g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                        
                        
                            // back tire metal bottom
                            g.setColor(new Color(49, 54, 62));
                        
                            int[] xPoints4 = {651, 667, 659, 645};
                            int[] yPoints4 = {515, 514, 533, 535};

                            g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                        }
                    }

                    // wheels/tires
                    {
                        // front tire
                        {
                        // front wheel hubcap
                        g.setColor(new Color(55, 61, 67));
                        g.fillOval(442, 514, 56, 81);

                        // front wheel front
                        g.setColor(new Color(36, 40, 47));
                        g.fillOval(431, 499, 73, 109);

                        // front wheel 3d
                        g.setColor(new Color(17, 20, 23));
                        
                        int[] xPoints4 = {444, 466, 466, 444};
                        int[] yPoints4 = {499, 499, 608, 608};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                    
                        // front wheel back
                        g.setColor(new Color(17, 20, 23));
                        g.fillOval(406, 499, 77, 109);

                        // front wheel bkg
                        g.setColor(new Color(0, 0, 0));
                        
                        int[] xPoints4 = {447, 494, 514, 512, 511, 508, 495, 427};
                        int[] yPoints4 = {486, 482, 531, 549, 553, 565, 565, 523};

                        g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                        }

                        // back tire
                        {
                            // back wheel hubcap
                            g.setColor(new Color(55, 61, 67));
                            g.fillOval(690, 500, 32, 61);

                            // back wheel front
                            g.setColor(new Color(36, 40, 47));
                            g.fillOval(681, 487, 43, 85);

                            // back wheel 3d
                            g.setColor(new Color(17, 20, 23));
                            
                            int[] xPoints4 = {681, 702, 702, 681};
                            int[] yPoints4 = {487, 487, 572, 572};

                            g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                        
                            // back wheel back
                            g.setColor(new Color(17, 20, 23));
                            g.fillOval(659, 487, 43, 85);

                            // back wheel bkg
                            g.setColor(new Color(0, 0, 0));
                            
                            int[] xPoints4 = {691, 717, 728, 728, 724, 676};
                            int[] yPoints4 = {475, 473, 501, 510, 527, 514};

                            g.fillPolygon(xPoints4, yPoints4, xPoints4.length);
                        }

                        // opp wheels
                        {
                            // opp back wheel
                            g.setColor(new Color(15, 17, 21));
                            g.fillOval(508, 475, 92, 88);

                            // opp front wheel
                            g.setColor(new Color(15, 18, 212);
                            g.fillOval(259, 506, 92, 88);
                        }
                    }
                }
                
                
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

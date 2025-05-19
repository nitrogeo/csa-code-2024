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
                g.setColor(new Color(220, 233, 246)); 
                g.fillRect(0, 0, getWidth(), getHeight());

                // clouds = greyish pink ******************************

                // cloud color
                g.setColor(new Color(255, 255, 255)); 

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
            g.setColor(new Color(255, 253, 187)); 
            g.fillOval(810, 128, 100, 100);



            // ground????????? --- run in intellij to fix
            {
                // surface ground = beige
                // g.setColor(new Color(219, 199, 183)); 
                // g.fillRect(0, 450, getWidth(), getHeight());
            
                // surface ground = beige OG
                g.setColor(new Color(114, 117, 123));

                int[] xPoints7 = {0,   215, 103, 39,  48,  170, 304, 344, 360, 432, 518, 662, 693, 835, 917, 1018, 1203, 0,    0};
                int[] yPoints7 = {100, 102, 181, 198, 205, 268, 231, 247, 231, 259, 198, 299, 260, 231, 164, 171,  833,  1367, 1008};

                g.fillPolygon(xPoints7, yPoints7, xPoints7.length);

                // surface ground = beige V2 IDKDDKDKDKKDKD
                g.setColor(new Color(114, 117, 123));

                int[] xPoints8 = {-237, 59,  116, 150, 213, 636, 800, 909, 1145, 1155, 1219, 662, 1289, 1407, 1420, -289};
                int[] yPoints8 = {599,  539, 534, 536, 534, 495, 469, 466, 435,  495,  536,  299, 530,  533,  819,  844};

                g.fillPolygon(xPoints8, yPoints8, xPoints8.length);
            }

            // mtn - simple ver
            {
                // main bkg
                g.setColor(new Color(114, 117, 123));

                int[] xPoints51 = {-42, 48,  170, 304, 344, 360, 432, 518, 662, 693, 777, 835, 917, 1203, -242};
                int[] yPoints51 = {186, 205, 268, 231, 247, 231, 259, 198, 299, 259, 235, 231, 164, 833,  847};

                g.fillPolygon(xPoints51, yPoints51, xPoints51.length);


                // midground
                g.setColor(new Color(62, 69, 77));

                int[] xPoints52 = {-17, 113, 184, 299, 428, 489, 571, 714, 919, 1018, 1018, 835, -17};
                int[] yPoints52 = {238, 267, 318, 318, 339, 416, 401, 293, 209, 196,  853,  231, 853};

                g.fillPolygon(xPoints52, yPoints52, xPoints52.length);


                // foreground
                g.setColor(new Color(94, 100, 106));

                int[] xPoints6 = {-35, 86,  189, 337, 524, 628, 696, 813, 883, 1049, 1042, -35};
                int[] yPoints6 = {286, 358, 358, 411, 444, 435, 376, 340, 281, 214,  842,  842};

                g.fillPolygon(xPoints6, yPoints6, xPoints6.length);
            }

            // grass
            {
                 // dark green
                

                int[] xPoints9 = {  0, 23,  31,  73,  135, 170, 263, 361, 522, 682, 780, 824, 868, 886, 928, 953, 1034, 1051, -74};
                int[] yPoints9 = {463, 465, 484, 468, 473, 455, 461, 476, 461, 430, 435, 415, 415, 398, 418, 389, 418,  833,  833};

                g.setColor(new Color(148, 138, 95)); //old = (95, 82, 46)); new=(148, 138, 95));
                g.drawPolygon(xPoints9, yPoints9, xPoints9.length);
                g.setColor(new Color(111, 204, 126)); // new=(111, 204, 126)); old=(148, 138, 95));
                g.fillPolygon(xPoints9, yPoints9, xPoints9.length);
            }

            // road
            {
                // dark grey
                g.setColor(new Color(68, 68, 68));

                int[] xPoints10 = {-451, -81, 1165, 1423};
                int[] yPoints10 = {630,  767, 485,  434};

                g.fillPolygon(xPoints10, yPoints10, xPoints10.length);
            }


        }

        // cyber!!!
        {
            // opp wheels
            {
                // opp back wheel
                g.setColor(new Color(15, 17, 21));
                g.fillOval(508, 475, 92, 88);

                // opp front wheel
                g.setColor(new Color(15, 18, 22));
                g.fillOval(259, 506, 92, 88);
            }

            // back wheel bkg
            g.setColor(new Color(0, 0, 0));

            int[] xPoints50 = {691, 717, 728, 728, 724, 676};
            int[] yPoints50 = {475, 473, 501, 510, 527, 514};

            g.fillPolygon(xPoints50, yPoints50, xPoints50.length);

            // FRONT

            // front wheel bkg
            g.setColor(new Color(0, 0, 0));

            int[] xPoints48 = {447, 494, 514, 512, 511, 508, 495, 427};
            int[] yPoints48 = {486, 482, 531, 549, 553, 565, 565, 523};

            g.fillPolygon(xPoints48, yPoints48, xPoints48.length);

            // wheels/tires
            {
                // front tire
                {
                    // front wheel back
                    g.setColor(new Color(17, 20, 23));
                    g.fillOval(406, 499, 77, 109);

                    // front wheel 3d
                    g.setColor(new Color(17, 20, 23));

                    int[] xPoints47 = {444, 466, 466, 444};
                    int[] yPoints47 = {499, 499, 608, 608};

                    g.fillPolygon(xPoints47, yPoints47, xPoints47.length);

                    // front wheel front
                    g.setColor(new Color(36, 40, 47));
                    g.fillOval(431, 499, 73, 109);

                    // front wheel hubcap
                    g.setColor(new Color(55, 61, 67));
                    g.fillOval(442, 514, 56, 81);

                        /*// front wheel bkg
                        g.setColor(new Color(0, 0, 0));

                        int[] xPoints48 = {447, 494, 514, 512, 511, 508, 495, 427};
                        int[] yPoints48 = {486, 482, 531, 549, 553, 565, 565, 523};

                        g.fillPolygon(xPoints48, yPoints48, xPoints48.length);
                        }*/

                    // back tire
                    {
                        // back wheel back
                        g.setColor(new Color(17, 20, 23));
                        g.fillOval(659, 487, 43, 85);

                        // back wheel 3d
                        g.setColor(new Color(17, 20, 23));

                        int[] xPoints49 = {681, 702, 702, 681};
                        int[] yPoints49 = {487, 487, 572, 572};

                        g.fillPolygon(xPoints49, yPoints49, xPoints49.length);

                        // back wheel front
                        g.setColor(new Color(36, 40, 47));
                        g.fillOval(681, 487, 43, 85);

                        // back wheel hubcap
                        g.setColor(new Color(55, 61, 67));
                        g.fillOval(690, 500, 32, 61);


                    }

                        /*// opp wheels
                        {
                            // opp back wheel
                            g.setColor(new Color(15, 17, 21));
                            g.fillOval(508, 475, 92, 88);

                            // opp front wheel
                            g.setColor(new Color(15, 18, 22));
                            g.fillOval(259, 506, 92, 88);
                        }*/
                }
        }

            {
                // windshield
                {
                    // dark grey
                    g.setColor(new Color(39, 46, 53)); 

                    int[] xPoints11 = {298, 450, 553, 434};
                    int[] yPoints11 = {449, 450, 389, 392};

                    g.fillPolygon(xPoints11, yPoints11, xPoints11.length);
                }

                // side triangle metal ~OR~ top side metal frame
                {
                    // silver
                    g.setColor(new Color(211, 222, 234));

                    int[] xPoints28 = {553, 750, 414};
                    int[] yPoints28 = {389, 440, 471};

                    g.fillPolygon(xPoints28, yPoints28, xPoints28.length);
                }

                // frunk hood
                {
                    // silver
                    g.setColor(new Color(161, 175, 187));

                    int[] xPoints12 = {298, 450, 414, 381, 260, 253};
                    int[] yPoints12 = {449, 450, 471, 478, 476, 468};

                    g.fillPolygon(xPoints12, yPoints12, xPoints12.length);
                }
                // headlight bar
                {
                    // white
                    g.setColor(new Color(255, 255, 255));

                    int[] xPoints13 = {253, 260, 362, 414, 414, 362, 259, 253};
                    int[] yPoints13 = {468, 476, 478, 471, 480, 483, 481, 476};

                    g.fillPolygon(xPoints13, yPoints13, xPoints13.length);
                }
                // front bumper
                {        
                    // main front       
                    // silver
                    g.setColor(new Color(145, 159, 170));

                    int[] xPoints14 = {259, 362, 366, 259};
                    int[] yPoints14 = {481, 483, 524, 518};

                    g.fillPolygon(xPoints14, yPoints14, xPoints14.length);
                
                    // far side front
                    // lighter silver
                    g.setColor(new Color(213, 222, 231));

                    int[] xPoints15 = {253, 259, 259, 253};
                    int[] yPoints15 = {476, 481, 518, 515};

                    g.fillPolygon(xPoints15, yPoints15, xPoints15.length);

                    // near side front
                    // darker silver
                    g.setColor(new Color(85, 95, 106));

                    int[] xPoints16 = {362, 414, 413, 366};
                    int[] yPoints16 = {483, 480, 524, 524};

                    g.fillPolygon(xPoints16, yPoints16, xPoints16.length);
                


                    // front bumper bottom
                    {
                        // front bumper bottom under
                        // very dark grey
                        g.setColor(new Color(19, 22, 27));
                        
                        int[] xPoints17 = {257, 371, 408, 392, 277, 266};
                        int[] yPoints17 = {551, 561, 561, 574, 565, 559};

                        g.fillPolygon(xPoints17, yPoints17, xPoints17.length);
                        

                        // front bumper bottom under left
                        g.setColor(new Color(41, 45, 52));
                        
                        int[] xPoints18 = {252, 257, 266, 277, 274, 254};
                        int[] yPoints18 = {549, 551, 559, 565, 568, 565};

                        g.fillPolygon(xPoints18, yPoints18, xPoints18.length);
                    

                        // front bumper grill
                        g.setColor(new Color(23, 26, 31));
                        
                        int[] xPoints19 = {253, 365, 371, 257};
                        int[] yPoints19 = {534, 543, 561, 551};

                        g.fillPolygon(xPoints19, yPoints19, xPoints19.length);
                    
                    

                        // front bumper left bottom
                        g.setColor(new Color(83, 94, 105));
                        
                        int[] xPoints20 = {249, 253, 253, 257, 252, 249};
                        int[] yPoints20 = {521, 524, 534, 551, 549, 531};

                        g.fillPolygon(xPoints20, yPoints20, xPoints20.length);
                    
                    
                        // front bumper bottom main
                        g.setColor(new Color(34, 38, 45));
                        
                        int[] xPoints21 = {249, 256, 260, 277, 366, 424, 416, 399, 392, 408, 371, 365, 253, 253};
                        int[] yPoints21 = {521, 521, 523, 525, 529, 531, 580, 580, 574, 561, 561, 543, 534, 524};

                        g.fillPolygon(xPoints21, yPoints21, xPoints21.length);
                    
                    
                        // front bumper shelf
                        g.setColor(new Color(27, 31, 38));
                        
                        int[] xPoints22 = {256, 260, 278, 366, 413, 427, 424, 366, 278, 260, 256};
                        int[] yPoints22 = {516, 518, 519, 524, 524, 523, 531, 529, 525, 523, 521};

                        g.fillPolygon(xPoints22, yPoints22, xPoints22.length);
                    }


                    // side window
                    {
                        // side window mid bar
                        g.setColor(new Color(57, 63, 74));

                        int[] xPoints23 = {572, 580, 593, 580};
                        int[] yPoints23 = {398, 400, 444, 445};

                        g.fillPolygon(xPoints23, yPoints23, xPoints23.length);
                    

                        // side window back bar
                        g.setColor(new Color(52, 59, 65));
                        
                        int[] xPoints24 = {632, 640, 651, 644};
                        int[] yPoints24 = {412, 414, 439, 439};

                        g.fillPolygon(xPoints24, yPoints24, xPoints24.length);
                    

                        // side window front
                        g.setColor(new Color(70, 79, 91));
                        
                        int[] xPoints25 = {517, 519, 453};
                        int[] yPoints25 = {419, 451, 458};

                        g.fillPolygon(xPoints25, yPoints25, xPoints25.length);
                    
                    
                        // side window mid
                        g.setColor(new Color(83, 92, 105));
                        
                        int[] xPoints26 = {557, 572, 581, 519, 517};
                        int[] yPoints26 = {394, 398, 445, 451, 419};

                        g.fillPolygon(xPoints26, yPoints26, xPoints26.length);
                    
                    
                        // back window
                        g.setColor(new Color(70, 78, 91));
                        
                        int[] xPoints27 = {581, 632, 644, 593};
                        int[] yPoints27 = {400, 412, 439, 444};

                        g.fillPolygon(xPoints27, yPoints27, xPoints27.length);
                    }

                    // side
                    {
                        /*// side triangle metal ~OR~ top side metal frame
                        {
                            // silver
                            g.setColor(new Color(211, 222, 234));

                            int[] xPoints28 = {553, 750, 414};
                            int[] yPoints28 = {389, 440, 471};

                            g.fillPolygon(xPoints28, yPoints28, xPoints28.length);
                        }*/

                        // under-side lol
                        g.setColor(new Color(19, 22, 28));
                        
                        int[] xPoints29 = {512, 659, 674, 522, 511};
                        int[] yPoints29 = {549, 533, 534, 551, 553};

                        g.fillPolygon(xPoints29, yPoints29, xPoints29.length);
                    
                    
                        // under bottom
                        g.setColor(new Color(20, 23, 29));
                        
                        int[] xPoints30 = {511, 522, 674, 671, 655, 652, 508};
                        int[] yPoints30 = {553, 551, 534, 556, 555, 550, 565};

                        g.fillPolygon(xPoints30, yPoints30, xPoints30.length);
                    
                       
                        // back under top
                        g.setColor(new Color(50, 53, 60));
                        
                        int[] xPoints31 = {728, 737, 737, 750, 728};
                        int[] yPoints31 = {501, 499, 502, 502, 510};

                        g.fillPolygon(xPoints31, yPoints31, xPoints31.length);

                        
                        // back under bottom
                        g.setColor(new Color(41, 46, 54));
                        
                        int[] xPoints32 = {728, 750, 746, 726, 724};
                        int[] yPoints32 = {510, 502, 516, 532, 537};

                        g.fillPolygon(xPoints32, yPoints32, xPoints32.length);
                    
                        // tire rims
                        {
                            // front tire rim 
                            g.setColor(new Color(41, 46, 54));
                            
                            int[] xPoints33 = {436, 492, 514, 494, 447, 427, 413};
                            int[] yPoints33 = {478, 473, 531, 482, 486, 523, 524};

                            g.fillPolygon(xPoints33, yPoints33, xPoints33.length);
                            
                            
                            // back tire rim
                            {
                                // back tire rim front
                                g.setColor(new Color(22, 26, 33));
                            
                                int[] xPoints34 = {666, 677, 674, 659};
                                int[] yPoints34 = {514, 514, 534, 533};

                                g.fillPolygon(xPoints34, yPoints34, xPoints34.length);
                                

                                // back tire rim back
                                g.setColor(new Color(60, 67, 74));
                        
                                int[] xPoints35 = {716, 728, 717};
                                int[] yPoints35 = {465, 501, 473};

                                g.fillPolygon(xPoints35, yPoints35, xPoints35.length);

                                // back tire rim top
                                g.setColor(new Color(60, 65, 75));
                        
                                int[] xPoints36 = {682, 716, 717, 691};
                                int[] yPoints36 = {467, 465, 473, 475};

                                g.fillPolygon(xPoints36, yPoints36, xPoints36.length);

                                // back tire rim forward
                                g.setColor(new Color(39, 44, 52));
                        
                                int[] xPoints37 = {682, 691, 676, 666};
                                int[] yPoints37 = {467, 475, 514, 514};

                                g.fillPolygon(xPoints37, yPoints37, xPoints37.length);
                            }
                        }

                        // side doors top metal
                        {
                            // back passenger door top
                            g.setColor(new Color(211, 222, 233));
                        
                            int[] xPoints38 = {593, 651, 654, 594};
                            int[] yPoints38 = {444, 439, 448, 454};

                            g.fillPolygon(xPoints38, yPoints38, xPoints38.length);
                        

                            // driver door top
                            g.setColor(new Color(181, 194, 209));
                        
                            int[] xPoints39 = {515, 593, 594, 515};
                            int[] yPoints39 = {452, 444, 454, 461};

                            g.fillPolygon(xPoints39, yPoints39, xPoints39.length);
                        

                            
                        }

                        // side bottom metal
                        {
                            // front tire metal
                            g.setColor(new Color(96, 108, 121));
                        
                            int[] xPoints40 = {414, 515, 514, 492, 436, 413, 414, 414};
                            int[] yPoints40 = {471, 461, 531, 473, 478, 524, 480, 471};

                            g.fillPolygon(xPoints40, yPoints40, xPoints40.length);
                        
                        
                            // driver door
                            g.setColor(new Color(77, 88, 99));
                        
                            int[] xPoints41 = {515, 594, 592, 514};
                            int[] yPoints41 = {461, 454, 522, 531};

                            g.fillPolygon(xPoints41, yPoints41, xPoints41.length);
                        
                        
                            // driver door bottom
                            g.setColor(new Color(45, 50, 58));

                            int[] xPoints42 = {514, 592, 587, 512};
                            int[] yPoints42 = {531, 522, 541, 549};

                            g.fillPolygon(xPoints42, yPoints42, xPoints42.length);


                            // back passenger door
                            g.setColor(new Color(90, 100, 113));

                            int[] xPoints43 = {594, 654, 651, 592};
                            int[] yPoints43 = {454, 448, 515, 522};

                            g.fillPolygon(xPoints43, yPoints43, xPoints43.length);


                            // back passenger door bottom
                            g.setColor(new Color(46, 52, 60));
                        
                            int[] xPoints44 = {592, 651, 645, 587};
                            int[] yPoints44 = {522, 515, 535, 541};

                            g.fillPolygon(xPoints44, yPoints44, xPoints44.length);
                        
                        
                            // back tire metal
                            g.setColor(new Color(128, 139, 152));
                        
                            int[] xPoints45 = {654, 750, 746, 728, 716, 682, 667, 651};
                            int[] yPoints45 = {448, 440, 497, 501, 465, 467, 514, 551};

                            g.fillPolygon(xPoints45, yPoints45, xPoints45.length);
                        
                        
                            // back tire metal bottom
                            g.setColor(new Color(49, 54, 62));
                        
                            int[] xPoints46 = {651, 667, 659, 645};
                            int[] yPoints46 = {515, 514, 533, 535};

                            g.fillPolygon(xPoints46, yPoints46, xPoints46.length);
                        }
                    }


                }
                
                
            }




















        }
        }
    }

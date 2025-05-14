package A16;

import javax.swing.*;
import java.awt.*;

public class driveframe extends JFrame {

    public driveframe (String title) {
        // create the frame with the given title
        super(title);

        // Set x button to close program
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // sets the user to not be able to resize the frame
        setResizable(false);

        // creates the frame (hidden at this point)
        pack();

        // creates the panel
        drivepanel p = new drivepanel();

        // get insets
        Insets insets = getInsets();

        // calculating window si    ze
        int width = p.getWidth() + insets.left + insets.right;
        int height = p.getHeight() + insets.top + insets.bottom;

        // set the preferred size
        setPreferredSize(new Dimension(width, height));

        // turn off layout options
        setLayout(null);

        // adds the panel to the frame
        add(p);

        // adjusts to be the size we set with set preferred size
        pack();

        // show the screen
        setVisible(true) ;
    }
}

package A16;

import java.awt.*;
import javax.swing.*;

public class anipanel extends JPanel {

    public anipanel() {
        // creates the panel
        super();

        // sets the size of the panel
        setSize(300, 300);
    }

    public void paint (Graphics g) {
        // draws a black box with and x in it
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.RED); ;
        g.drawLine (0, 0, getWidth(), getHeight());
        g.drawLine(getWidth(), 0, 0, getHeight());
    }
}

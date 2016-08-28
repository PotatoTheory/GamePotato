/** Derek Wang and Leo Chen 8/23/16
    Should have the following:
        Dimensions
        Directions (arrow keys in all four directions North, South, East, West)
        A list of monsters? (per area)
        Different areas?

 */
import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class gameMap {
    /*
        set layout
        set panels in the layout (display)
        set buttons in panels
        set textfields to label the panels
        set labels to the main character (hp, stats, exp, gold, levels, etc.)
        set visibility
        set actionListeners to buttons
     */
    private int x;
    private int y;
    private String name;

    // Initial constructor for the gameMap of two dimensions x and y, and a name
    public gameMap(int x, int y, String name, boolean close) {
        this.x = x;
        this.y = y;
        this.name = name;

        JFrame frame = new JFrame();
        if (close) {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else {
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }

        //Create the menu bar.  Make it have a green background.
        JMenuBar menu = new JMenuBar();
        menu.setOpaque(true);
        menu.setBackground(new Color(150, 150, 150));
        menu.setPreferredSize(new Dimension(x, y / 10));

        //Create a yellow label to put in the content pane.
        JLabel testLabel = new JLabel();
        testLabel.setOpaque(true);
        testLabel.setBackground(new Color(250, 250, 150));
        testLabel.setPreferredSize(new Dimension(x, y * 9 / 10));

        //Set the menu bar and add the label to the content pane.
        frame.setJMenuBar(menu);
        frame.getContentPane().add(testLabel, BorderLayout.CENTER);

        //Display the window.
        frame.pack();
        frame.setVisible(true);

        //TODO: add buttons, listeners for buttons, etc.
        //TODO: make this damn program run again.
    }

    // Empty constructor for the gameMap of dimensions 50x50 with name default
    public gameMap() {
        this(500, 500, "default", true);
    }

    // Closes the map when the game exits
    public void close() {

    }
}

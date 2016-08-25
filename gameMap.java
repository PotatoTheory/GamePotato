/** Derek Wang and Leo Chen 8/23/16
    Should have the following:
        Dimensions
        Directions (arrow keys in all four directions North, South, East, West)
        A list of monsters? (per area)
        Different areas?

 */
import java.io.*;
import java.util.*;
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

    // Initial constructor for the gameMap of two dimensions x and y, and a name
    public gameMap(int dimensionX, int dimensionY, String name) {

    }

    // Empty constructor for the gameMap of dimensions 50x50 with name default
    public gameMap() {
        this(50, 50, "default");
    }

    // Closes the map when the game exits
    public void close() {

    }
}

/** Derek Wang and Leo Chen 8/23/16
    Main method of the game
    Initializes all variables, creates a gameMap and a gameInterface
    Creates units and alters characters as necessary
 */
import java.io.*;
import java.util.*;
public class gameMain {

   // Main method of the game
   public static void main(String[] args) {
       /**
        Crappy placeholder code following:
        */
       Scanner input = new Scanner(System.in);
       gameMap map = new gameMap();
       gameInterface ui = new gameInterface();
       gameUnit boss = new gameUnit();
       gameUnit mc = new gameUnit();
       boolean running = true;

       while(running) {
            if (mc.getHp() > 0) {
                running = true; //Replace with gameplay
            } else {
                running = ui.askRevive(input); //If the player revives, continue running
            }
            System.out.println("Test complete.");
            running = false;
       }
       end(ui, map);

   }

   // Calls saveData to output game state to a file, closes ui, closes map
   private static void end(gameInterface ui, gameMap map) {
       saveData();
       ui.close(); //Unsure if necessary
       map.close(); //Unsure if necessary
   }

   // Outputs the current game state to a file
   private static void saveData() {
       //store character changes;
       //store character position;
       //store npc changes;
       //store npc positions;
       // ^
       // |
       //Print all this out to some file
   }
}
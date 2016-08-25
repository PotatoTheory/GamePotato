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
       // Create Game Unit
       gameUnit firstBorn = new gameUnit();
       /**
        Crappy placeholder code following:
        */
       gameMap map = new gameMap();
       gameInterface ui = new gameInterface();
       while(running) {
           create main character;
           create boss monster;

            do things;
       }
       end();

   }

   private void end() {
       saveData();
       close interface;
       close map;
   }

   private void saveData() {
       store character changes;
       store character position;
       store npc changes;
       store npc positions;
   }
}
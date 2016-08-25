// This is the base unit for this game.
// Spaghetti code will prevail

// Essentially all units should be constructed of things that look like this

public class minion {
   private String name;
   private int level;
   private int health_max;

   // This is the constructor for the minion
   private void minion() {
      name = "No Name";
      level = 0;
      health_max = 100;
   }
}
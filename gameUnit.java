// This is the base unit for this game.
// Spaghetti code will prevail

// Essentially all units should be constructed of things that look like this

public class gameUnit {
   private String name;
   private int level;
   private int max_hp;
   private int current_hp;
   private static int DEFAULT_MAX_HP = 100;

   // This is the generic constructor for the minion
   public gameUnit(String name, int level, int max_hp, int current_hp ) {
      this.name = name;
      this.level = level;
      this.max_hp = max_hp;
      this.current_hp = current_hp;
   }

   // This is a constructor that contains no arguments (typical unit creation)
   public gameUnit() {
      this("Minion", 1, 100, 100);
   }

   // TODO Make other shit that goes in here
}
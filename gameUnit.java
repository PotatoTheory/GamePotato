/** Derek Wang and Leo Chen 8/23/16
    Basic class for units in the game
    Other units inherit class methods
    Stores its own name, max_hp, current_hp, and other values TODO
*/
import java.io.*;
import java.util.*;
public class gameUnit {
    private String name;
    private int max_hp;
    private int current_hp;
    private int attack;
    private int defense;
    /* Temporarily disabled for the sake of simplicity
        private int level;
        private static int DEFAULT_MAX_HP = 100;
    */

    // This is the generic constructor for the minion
    public gameUnit(String name/*, int level*/, int max_hp, int attack, int defense) {
        this.name = name;
        this.max_hp = max_hp;
        this.current_hp = max_hp; //When created, current = max hp
        this.attack = attack;
        this.defense = defense;
        //this.level = level;
    }

    // This is a constructor that contains no arguments (typical gameUnit creation)
    public gameUnit() {
        this("Minion", 100, 15, 15);
    }

    // Takes damage based on the enemy unit's attack minus this unit's defense
    public void defend(gameUnit enemy) {
        if (defense < enemy.getAttack()) {
            current_hp -= (enemy.getAttack() - defense);
        }
    }

    // Changes the name of the unit to the given name
    public void rename(String newName) {
        name = newName;
    }

    // Returns the name of the unit
    public String getName() {
        return name;
    }

    // Returns the current HP of the unit
    public int getHp() {
        return current_hp;
    }

    // Returns the max hp of the unit
    public int getMaxHp() {
        return max_hp;
    }

    // Returns the attack power of the unit
    public int getAttack() {
        return attack;
    }

    // Returns the defensive power of the unit
    public int getDefense() {
        return defense;
    }
}
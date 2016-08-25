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
    public gameUnit(String name, int level, int max_hp, int current_hp, int attack, int defense) {
        this.name = name;
        this.max_hp = max_hp;
        this.current_hp = current_hp;
        this.attack = attack;
        this.defense = defense;
        //this.level = level;
    }

    // This is a constructor that contains no arguments (typical gameUnit creation)
    public gameUnit() {
        this("Minion", 1, 100, 100, 15, 15);
    }

    public void attack(gameUnit enemy) {

    }

    public void defend(gameUnit enemy) {

    }

    public void rename(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return current_hp;
    }

    public int getMaxHp() {
        return max_hp;
    }

    public int getAttack() {
        return attack;
    }

}
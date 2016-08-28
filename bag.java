/**
 * Created by d95wang on 8/27/2016.
 *
 * Contains the inventory class for the game
 * Pretty much this is a bag container
 */
public class bag {

    private int MAX_CAPACITY = 30;
    private gameItem[] storage;
    private double bonusAtk;
    private double bonusDef;

    public bag() {
        storage = new gameItem[MAX_CAPACITY];
        bonusAtk = 0;
        bonusDef = 0;
    }

    public double getAttack() {
        return bonusAtk;
    }

    public double getDefense() {
        return bonusDef;
    }

    public void addItem(gameItem addition) {

    }

    public void removeItem(gameItem removal) {

    }

    // Updates the current total attack and defense
    private void updateAtkDef() {

    }
}

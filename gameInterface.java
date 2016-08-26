/** Derek Wang and Leo Chen 8/23/16
    Should have the following:
        Input processing methods for:
            Clicking
            Typing
            Enter
            Arrow keys?
            Other keys as necessary
    No actual buttons, all interactable objects are part of gameMap
    When an input is detected, use gameInterface methods to produce output.
 */
import java.io.*;
import java.util.*;
public class gameInterface {

    /*
    public void clickedButton(correspondingItemsA, B) {
        check event;
        alter characters;
    }
    Sample event:
    click "attack"

    public void attacked(gameUnit unitA, gameUnit unitB) {
        unitA.takeAttackDamage();
        if (unitA.isAlive()) {
            unitB.takeAttackDamage();
        } else {
            unitB.kill(unitA); //Gets unitA's experience, gold, and items
        }
    }
    */
    // Asks the user whether or not they want to revive after death, using the given scanner
    public boolean askRevive(Scanner input) {
        while (true) {
            System.out.println("Do you want to revive? Y or N - Case insensitive.");
            String next = input.nextLine().toLowerCase();
            if (next.equals("y")) {
                return true;
            } else if (next.equals("n")) {
                return false;
            }
        }
    }

    // Confirms an action after an actionListener was activated
    public void confirm() {
        //confirm action;
    }

    // Cancels an action after an actionListener was activated
    public void cancel() {
        //return to previous screen;
    }

    // Opens the menu after an actionListener was activated
    public void menu() {
        //loadMenu();
    }

    // Makes the game fullscreen after an actionListener was activated
    public void fullscreen() {
        //turn fullscreen(); //I think this is already automatically implemented tbh
    }

    // Closes the UI after an actionListener was activated
    public void close() {
        //called by gameMain when game is closing;
    }
}

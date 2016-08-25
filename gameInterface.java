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

    public void confirm() {
        confirm action;
    }

    public void cancel() {
        return to previous screen;
    }

    public void menu() {
        loadMenu();
    }

    public void fullscreen() {
        turn fullscreen(); //I think this is already automatically implemented tbh
    }

    public void quit() {
        called by gameMain when game is closing;
    }
}

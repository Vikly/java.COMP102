// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a ${course} assignment.
// You may not distribute it in any other way without permission.
/* Code for ${course} - 2017T2
* Name:
* Username:
* ID:
*/
import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** The NewObjectsExercise class has several simple methods
 * that involve creating new objects and calling methods on those objects.
 * - doFlowers() should create two or three Flower objects and
 *   make them grow and bloom
 * - doBalloons() should create two Balloon objects and
 *   make them expand and pop
 * - doCars() should create two Car objects and make them
 *   drive towards each other then turn to the side and drive some more
 * - doBankAccounts() should create two BankAccount objects and
 *   deposit to, withdraw from, and print statements of them
 */

public class NewObjectsExercise {

    /** Constructor to set up the user interface */
    public NewObjectsExercise(){
           UI.initialise();
           UI.addButton("Clear", UI::clearPanes );
           UI.addButton("Flowers", this::doFlowers );
           UI.addButton("Balloons", this::doBalloons );
           UI.addButton("Cars", this::doCars );
           UI.addButton("Bank Accounts", this::doBankAccounts );
           UI.addButton("Quit", UI::quit );
    }

    /** Creates two or three Flower objects and makes them grow and bloom */
    public void doFlowers(){
           /*# YOUR CODE HERE */

    }

    /** Creates two Balloon objects and makes them expand and pop */
    public void doBalloons(){
           /*# YOUR CODE HERE */

    }

    /**  Creates two Car objects and makes them	 drive towards
        *  each other then turn to the side and drive some more.
        */
    public void doCars(){
           /*# YOUR CODE HERE */

    }

    /** Creates two BankAccount objects and deposits to, withdraws from, and
        * prints statements of them
        */
    public void doBankAccounts(){
           /*# YOUR CODE HERE */

    }


}

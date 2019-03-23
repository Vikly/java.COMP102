// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a ${course} assignment.
// You may not distribute it in any other way without permission.
/* Code for ${course} - 2017T2
* Name:
* Username:
* ID:
*/
import ecs100.*;

/** Program to create simple animated cartoon strips using the
 *  CartoonCharacter class.  
 */

public class CartoonStrip{

    /** Constructor: set up user interface */
    public CartoonStrip(){
           UI.initialise();
           UI.addButton("Clear", UI::clearGraphics );
           UI.addButton("Animate", this::doAnimate );
           UI.addButton("Three dancers", this::doThreeDancers);
           UI.addButton("dance",this::doDance);
           UI.addButton("Quit", UI::quit );
           UI.setDivider(0);          // Expand the graphics area
    }

    /** doAnimate creates two cartoon characters on the window.
        *  Then animates them according to a fixed script by calling a series
        *  of methods on the characters.
        */
    public void doAnimate(){
           /*# YOUR CODE HERE */
           CartoonCharacter Jan=new CartoonCharacter(100,50,"Jan");
           Jan.frown();
           Jan.lookRight();
           Jan.walk(5);
           Jan.speak("hello,Jim?");
           Jan.think("where is he?");
           Jan.walk(5);
           CartoonCharacter Jim=new CartoonCharacter(300,50,"Jim");
           Jim.frown();
           Jim.lookLeft();
           Jim.walk(5);
           Jim.speak("Jan,i am here");
           
           Jim.walk(5);
           Jan.speak("what wrong with you?");
           Jan.think("he looks unhappy");
           Jim.speak("i lost the money");
           Jan.speak("dont warry,");
           Jan.speak("i will give you mine");
           Jan.walk(100);
           Jim.walk(10);
           Jim.smile();
           Jan.smile();
           Jim.speak("thank you,Jan");
           Jan.speak("you are welcome");
           Jim.speak("your mother will blame you");
           Jan.speak("no,she wont");
    }

    /** doThreeDancers creates three cartoon characters on the window.
        *  Then makes each character do the same little dance in turn,
        *  by calling the dance method.
        */
    public void doThreeDancers(){
           /*# YOUR CODE HERE */
           CartoonCharacter Jan=new CartoonCharacter(100,50,"Jan");
           Jan.frown();
           Jan.lookLeft();
           Jan.lookRight();
           Jan.smile();
           Jan.speak("hello,look me");
           Jan.think("cool");
           Jan.walk(5);
           CartoonCharacter Jim=new CartoonCharacter(300,50,"Jim");
           Jim.frown();
           Jim.lookLeft();
           Jim.lookRight();
           Jim.smile();
           Jim.speak("hello,look me");
           Jim.think("cool");
           Jim.walk(5);
           CartoonCharacter Jon=new CartoonCharacter(500,50,"Jon");
           Jon.frown();
           Jon.lookLeft();
           Jon.lookRight();
           Jon.smile();
           Jon.speak("hello,look me");
           Jon.think("cool");
           Jon.walk(5);
    }

    /** Makes a character do a little dance.
    Has one parameter - a CartoonCharacter object
        */
    
    public void doDance(){
           /*# YOUR CODE HERE */
           
           CartoonCharacter Jim=new CartoonCharacter(300,50,"Jim");
           Jim.smile();
           Jim.lookLeft();
           Jim.walk(5);
           Jim.lookRight();
           Jim.walk(5);
           
           Jim.jamp(10);
           Jim.frown();
}
}


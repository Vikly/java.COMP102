// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP102 - 2017T1
 * Name:Luo Xuewei
 * Username:
 * ID:1624092119
 */

import ecs100.*;
import java.awt.Color;

public class CircuitDrawer{

    // fields to store data:
    //  - the tool that the user has selected (which control what component will be
    //    drawn by the mouse)
    //    The tools are "resistor", "wire", "capacitor", "source", "label", or "eraser"
    //  - the mode: whether the component should be horizontal or vertical
    //  - the contents of the label
    //  - the position the mouse was pressed, 
    /*# YOUR CODE HERE */
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private String m;
    private int mode=1;
    javax.swing.JButton btn;
    //Constructor
    /** Sets up the user interface - mouselistener, buttons, and (completion only) textField */
    public CircuitDrawer(){
        UI.setMouseListener( this::doMouse );
        UI.addButton("Clear", UI::clearGraphics); 
        /*# YOUR CODE HERE */
        UI.addButton("Resistor",this::doSetResistor);
        UI.addButton("Wire",this::doSetWire);
        UI.addButton("Capacitor",this::doSetCapacitor);
        UI.addButton("Source",this::doSetSource);
        UI.addButton("Eraser",this::doSetEraser);
        UI.addTextField("Label",this::doSetLabel);
        btn = UI.addButton("Horiz", this::doSwitchDirection);
        UI.addButton("Quit", UI::quit);
        UI.setDivider(0.0);  // Hide the text area.
    }

    // Methods to change the tool that controls what will be drawn next
    // These methods just save information to the fields.
    /** Respond to the resistor button */
    public void doSetResistor(){
        /*# YOUR CODE HERE */
        this.drawResistor(this.x1,this.y1);
    }

    /** Respond to the wire button */
    public void doSetWire(){
        /*# YOUR CODE HERE */
       this.drawWire(this.x1,this.y1);
    }

    /** Respond to the capacitor button */
    public void doSetCapacitor(){
        /*# YOUR CODE HERE */
        this.drawCapacitor(this.x1,this.y1);
    }

    /** Respond to the source button */
    public void doSetSource(){
        /*# YOUR CODE HERE */
        this.drawSource(this.x1,this.y1);
    }

    /** Respond to the eraser button */
    public void doSetEraser(){
        /*# YOUR CODE HERE */
        this.doEraser(this.x1,this.y1);
    }

    /** Respond to the text field (completion only) */
    public void doSetLabel(String v){
        /*# YOUR CODE HERE */
       this.drawLabel(this.x1,this.y1);
    }

    /**
     * Respond to the horiz/vert button (completion only)
     * Switches the mode from horizontal to vertical, or back
     * Ideally, (Challenge) it should show the user what the current state is,
     * eg by drawing a horizonal/vertical bar in the top left corner,
     * or by calling setText on the button to change the label
     */
    public void doSwitchDirection(){
        /*# YOUR CODE HERE */
         if(this.mode == 1){
            this.mode = 0;          
            btn.setText("Vert");
        }
        else if(this.mode == 0){
            this.mode = 1;
            btn.setText("Horz");
        }



    }

    /**
     * Respond to mouse events
     * When pressed, remember the position.
     * When released, draw what is specified by current tool
     * Uses the value stored in the field to determine which kind of component to draw (or to erase)
     *  It should call the drawWire, drawResistor, drawCapacitor, drawSource, drawLabel, 
     *  or doErase, methods passing the x and y where the mouse was released.
     */
    public void doMouse(String action, double x, double y) {
        /*# YOUR CODE HERE */
        if(action.equals("released")){
            this.x1=x;
            this.y1=y;
        }
        else if(action.equals("pressed")){
            this.x2=x;
            this.y2=y;
        }
        else if(this.m.equals("r")){
            this.drawResistor(this.x1,this.y1);
        }
        else if(this.m.equals("w")){
            this.drawWire(this.x1,this.y1);
        }
        else if(this.m.equals("c")){
            this.drawCapacitor(this.x1,this.y1);
        }
        else if(this.m.equals("s")){
            this.drawSource(this.x1,this.y1);
        }
        else if(this.m.equals("e")){
            this.doEraser(this.x1=x,this.y1=y);
        }
        else if(this.m.equals("l")){
            this.drawLabel(this.x1,this.y1);
        }
        

       
        
    }


    /**
     * Draw a resistor centered at the point x, y.
     * (either a thin rectangle with short wires, or a zig-zag.)
     * Core: only horizontal required
     * Completion: horizontal or vertical depending on the mode.
     */
    public void drawResistor(double x, double y){
        double length = 31;    // size in the longer  dimension
        double width = 11;     // size in the shorter dimension 
        double stub = 10;      // the length of the wires on each end
        /*# YOUR CODE HERE */
        if(this.mode == 1){
            UI.setColor(Color.white);
            UI.fillRect(this.x1-length/2,this.y1-width/2,length,width);
            UI.setColor(Color.black);
            UI.drawLine(this.x1-25,this.y1,this.x1-15,this.y1);
            UI.drawLine(this.x1+15,this.y1,this.x1+25,this.y1);
            UI.drawRect(this.x1-length/2,this.y1-width/2,length,width);
        }
        if(this.mode == 0){
            UI.setColor(Color.white);
            UI.fillRect(this.x1-width/2,this.y1-length/2,width,length);
            UI.setColor(Color.black);
            UI.drawLine(this.x1,this.y1-25,this.x1,this.y1-15);
            UI.drawLine(this.x1,this.y1+15,this.x1,this.y1+25);
            UI.drawRect(this.x1-width/2,this.y1-length/2,width,length);
        }

    }

    /**
     * Draw a wire from the point where the user pressed the mouse to the point x,y.
     * Core: may be a straight line.
     * Completion: The wire should have a horizontal part followed by a vertical part
     * If the distance between the two points is very small, it just puts a circle at (x y)
     */
    public void drawWire(double x, double y){
        /*# YOUR CODE HERE */
       UI.setColor(Color.black);
        if(this.mode == 1){
            UI.drawLine(this.x2,this.y2,this.x1,this.y2);
        }
        if(this.mode == 0){
            UI.drawLine(this.x2,this.y2,this.x2,this.y1);
        }


        
        

    }

    /**
     * Draw a capacitor centered at the point x, y.
     *  (Two parallel lines with wires on each side)
     * Core: only horizontal required
     * Completion: horizontal or a vertical, depending on the mode.
     */
    public void drawCapacitor(double x, double y){
        /*# YOUR CODE HERE */
       if(this.mode == 1){
            UI.setColor(Color.white);
            UI.fillRect(this.x1-5,this.y1-10,10,20);
            UI.setColor(Color.black);
            UI.drawLine(this.x1-15,this.y1,this.x1-5,this.y1);
            UI.drawLine(this.x1-5,this.y1-10,this.x1-5,this.y1+10);
            UI.drawLine(this.x1+5,this.y1-10,this.x1+5,this.y1+10);
            UI.drawLine(this.x1+5,this.y1,this.x1+15,this.y1);
        }
        if(this.mode == 0){
            UI.setColor(Color.white);
            UI.fillRect(this.x1-10,this.y1-5,20,10);
            UI.setColor(Color.black);
            UI.drawLine(this.x1,this.y1-15,this.x1,this.y1-5);
            UI.drawLine(this.x1-10,this.y1-5,this.x1+10,this.y1-5);
            UI.drawLine(this.x1-10,this.y1+5,this.x1+10,this.y1+5);
            UI.drawLine(this.x1,this.y1+5,this.x1,this.y1+15);
        }
    }
      


    

    /**
     * Draw a source centered at the point x, y.
     *  (Circle with wires on each side)
     * Core: only horizontal required
     * Completion: horizontal or vertical, depending on the mode.
     */
    public void drawSource(double x, double y){
        /*# YOUR CODE HERE */
        if(this.mode == 1){
            UI.setColor(Color.white);
            UI.fillOval(this.x1-10,this.y1-10,20,20);
            UI.setColor(Color.black);
            UI.drawOval(this.x1-10,this.y1-10,20,20);
            UI.drawLine(this.x1-20,this.y1,this.x1-10,this.y1);
            UI.drawLine(this.x1+10,this.y1,this.x1+20,this.y1);
        }
        if(this.mode == 0){
            UI.setColor(Color.white);
            UI.fillOval(this.x1-10,this.y1-10,20,20);
            UI.setColor(Color.black);
            UI.drawOval(this.x1-10,this.y1-10,20,20);
            UI.drawLine(this.x1,this.y1-20,this.x1,this.y1-10);
            UI.drawLine(this.x1,this.y1+10,this.x1,this.y1+20);
        }



    }

    /**
     * Erase a circular region around the position x, y
     * Should be big enough to erase a single component.
     */
    public void doEraser(double x, double y){
        /*# YOUR CODE HERE */
        UI.setColor(Color.white);
        UI.fillOval(this.x1-20,this.y1-20,40,40);

    

    }

    /**
     * Draw a label at position x, y.  Always horizontal.
     * Uses the label that was stored in a field.
     * Completion only.
     */
    public void drawLabel(double x, double y){
        /*# YOUR CODE HERE */
        UI.setColor(Color.black);
        UI.drawString(m,x1,y1);

    }

    

    // Main:  constructs a new CircuitDrawer object
    public static void main(String[] arguments){
        new CircuitDrawer();
    }   

}

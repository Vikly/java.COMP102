// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for Assignment 1
 * Name:
 * ID:
 */

import ecs100.*;
import java.awt.Color;

/**
 * Draws various flags
 *
 */
public class FlagDrawer{

    public static final double top = 100;
    public static final double left = 50;

    /** Constructor, sets up the user interface */
    public FlagDrawer(){
        UI.initialise();

        // CORE
        UI.addButton("Core: Flag of Denmark", this::doDenmarkFlag);
        UI.addButton("Core: Flag of Greece", this::doGreeceFlag);

        // COMPLETION
        UI.addButton("Completion: Pacman Flag", this::doPacmanFlag);

        // CHALLENGE
        UI.addButton("Challenge: Flag of China", this::doChinaFlag);

        UI.addButton("Clear", UI::clearGraphics);
        UI.addButton("Quit", UI::quit);
    }

    /**
     * Core: The flag for Denmark
     */
    public void doDenmarkFlag() {
     double width=UI.askDouble("width");
     this.drawDenmarkFlag(width);
    }

    public void drawDenmarkFlag(double width){
        double height=2.0*width/3.0;
        UI.drawRect(left,top,width,height);
        UI.setColor(Color.red);
        UI.fillRect(50,100,width/3.0,2*width/7.0);
        UI.fillRect(50,100+8*width/21,width/3.0,2*width/7.0);
        UI.fillRect(50+4*width/9,100,5*width/9,2*width/7.0);
        UI.fillRect(50+4*width/9,100+8*width/21,5*width/9,2*width/7);  

    }

    //-------------------------------------------------------

    /**
     * Core: The flag for Greece
     */
    public void doGreeceFlag() {
        double width=UI.askDouble("width");
        this.drawGreeceFlag(width);
        

    }

    public void drawGreeceFlag(double width){
        double height=2.0*width/3.0;
        UI.drawRect(left,top,width,height);
        UI.setColor(Color.blue);
        UI.fillRect(50,100,4*width/27,4*width/27.0);
        UI.fillRect(50,100+2*width/9,4*width/27,4*width/27.0);
        UI.fillRect(50+6*width/27,100,4*width/27,4*width/27.0);
        UI.fillRect(50+6*width/27,100+2*width/9,4*width/27,4*width/27);
        UI.fillRect(50+10*width/27,100,17*width/27,2*width/27);
        UI.fillRect(50+10*width/27,100+4*width/27,17*width/27,2*width/27);
        UI.fillRect(50+10*width/27,100+8*width/27,17*width/27,2*width/27);
        UI.fillRect(50,100+12*width/27,width,2*width/27);
        UI.fillRect(50,100+16*width/27,width,2*width/27);

    }

    //-------------------------------------------------------
    /**
     * Completion: pacman
     * A red pacman on a black background chasing blue, green, and white dots.
     */
    public  void doPacmanFlag() {
        double width=UI.askDouble("width");
        this.drawPacmanFlag(width);
        
        

    }

    public void drawPacmanFlag(double width){
        double height=8*width/13;
        UI.drawRect(left,top,width,height);
        UI.setColor(Color.black);
        UI.fillRect(50,100,width,8*width/13);
        UI.setColor(Color.white);
        UI.fillOval(50+2*width/13,100+3.5*width/13,width/13,width/13);
        UI.setColor(Color.green);
        UI.fillOval(50+4*width/13,100+3.5*width/13,width/13,width/13);
        UI.setColor(Color.blue);
        UI.fillOval(50+6*width/13,100+3.5*width/13,width/13,width/13);
        UI.setColor(Color.red);
        UI.fillArc(50+8*width/13,100+2*width/13,4*width/13,4*width/13,0,135);
        UI.fillArc(50+8*width/13,100+2*width/13,4*width/13,4*width/13,225,135);
        

    }
    
    /**
     * Challenge: China
     * Five yellow stars on a red background
     */
    public  void doChinaFlag() {
        double width=UI.askDouble("width");
        this.drawChinaFlag(width);
    }    
        public void drawChinaFlag(double width){
        double height=2*width/3;
        UI.drawRect(left,top,width,height);
        UI.setColor(Color.red);
        UI.fillRect(50,100,width,2*width/3);
        UI.setColor(Color.yellow);
        double []x1Points={50+4*width/24,50+7*width/48,50+2*width/24,50+3*width/24,50+5*width/48,50+4*width/24,50+11*width/48,50+5*width/24,50+6*width/24,50+9*width/48};
        double []y1Points={100+3*width/48,100+3*width/24,100+3*width/24,100+4*width/24,100+11*width/48,100+9*width/48,100+11*width/48,100+4*width/24,100+3*width/24,100+3*width/24};
        int numPoints=10;    
        UI.drawPolygon(x1Points,y1Points,numPoints);
        UI.fillPolygon(x1Points,y1Points,numPoints);
        
        double []x2Points={50+45*width/120,50+44*width/120,50+42*width/120,50+87*width/240,50+85*width/240,50+45*width/120,50+95*width/240,50+93*width/240,50+48*width/120,50+46*width/120};
        double []y2Points={100+2*width/120,100+4*width/120,100+4*width/120,100+11*width/240,100+8*width/120,100+13*width/240,100+8*width/120,100+11*width/240,100+4*width/120,100+4*width/120};
        UI.drawPolygon(x2Points,y2Points,numPoints);
        UI.fillPolygon(x2Points,y2Points,numPoints);
        
        double []x3Points={50+55*width/120,50+54*width/120,50+52*width/120,50+107*width/240,50+105*width/240,50+55*width/120,50+115*width/240,50+113*width/240,50+58*width/120,50+56*width/120};
        double []y3Points={100+12*width/120,100+14*width/120,100+14*width/120,100+31*width/240,100+18*width/120,100+33*width/240,100+18*width/120,100+31*width/240,100+14*width/120,100+14*width/120};
        UI.drawPolygon(x3Points,y3Points,numPoints);
        UI.fillPolygon(x3Points,y3Points,numPoints);
        
        double []x4Points={50+55*width/120,50+54*width/120,50+52*width/120,50+107*width/240,50+105*width/240,50+55*width/120,50+115*width/240,50+113*width/240,50+58*width/120,50+56*width/120};
        double []y4Points={100+22*width/120,100+24*width/120,100+24*width/120,100+51*width/240,100+28*width/120,100+53*width/240,100+28*width/120,100+51*width/240,100+24*width/120,100+24*width/120};
        UI.drawPolygon(x4Points,y4Points,numPoints);
        UI.fillPolygon(x4Points,y4Points,numPoints);
        
        double []x5Points={50+45*width/120,50+44*width/120,50+42*width/120,50+87*width/240,50+85*width/240,50+45*width/120,50+95*width/240,50+93*width/240,50+48*width/120,50+46*width/120};
        double []y5Points={100+32*width/120,100+34*width/120,100+34*width/120,100+71*width/240,100+38*width/120,100+73*width/240,100+38*width/120,100+71*width/240,100+34*width/120,100+34*width/120};
        UI.drawPolygon(x5Points,y5Points,numPoints);
        UI.fillPolygon(x5Points,y5Points,numPoints);

    }
    
        
        

    




}

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

/** Renders plain ppm images onto the graphics panel
 *  ppm images are the simplest possible colour image format.
 */

public class ImageRenderer{
    public static final int TOP = 20;   // top edge of the image
    public static final int LEFT = 20;  // left edge of the image
    public static final int PIXEL_SIZE = 2;  

    // Constructor
    public ImageRenderer() {
           UI.initialise();
           UI.addButton("Clear", UI::clearGraphics );
           UI.addButton("Render (core)", this::doRenderImageCore );
           UI.addButton("Render (compl)", this::doRenderAnimatedImage );
           UI.addButton("Quit", UI::quit );
           UI.setWindowSize(850, 700);
           UI.setDivider(0.0);
    }

    /** Core:
        * Renders a ppm image file.
        * Asks for the name of the file, then calls renderImageHelper.
        */
    public void doRenderImageCore(){
           /*# YOUR CODE HERE */
           String fileName=UIFileChooser.open("What's name of the file:");
           try{
               Scanner scan=new Scanner(new File(fileName));
               this.renderImageHelper(scan);
            }catch(IOException e){
                UI.println("File reading failed");}

           
            
    
}


    /** Core:
        * Renders a ppm image file.
        * Renders the image at position (LEFT, TOP).
        * Each pixel of the image  is rendered by a square of size PIXEL_SIZE
        * Assumes that
        * - the colour depth is 255,
        * - there is just one image in the file (not "animated"), and
        * - there are no comments in the file.
        * The first four tokens are "P3", number of columns, number of rows, 255
        * The remaining tokens are the pixel values (red, green, blue for each pixel)
        */
    public void renderImageHelper(Scanner sc){
           /*# YOUR CODE HERE */
           String type=sc.next();
           if(type.equals("P3")){
               int columns=sc.nextInt();
               int rows=sc.nextInt();
               sc.next();
               int x=0;//row
               int y=0;//collumns
               for(y=0;y<rows;y++){
                   for(x=0;x<columns;x++){
                       int r=sc.nextInt();
                       int g=sc.nextInt();
                       int b=sc.nextInt();
                       UI.setColor(new Color(r,g,b));
                       UI.fillRect(TOP+x+PIXEL_SIZE,LEFT+y+PIXEL_SIZE,PIXEL_SIZE,PIXEL_SIZE);
                    }
                }

    }else{
        UI.println("error type");
    }
}

    /** Completion
        * Renders a ppm image file which may be animated (multiple images in the file)
        * Asks for the name of the file, then renders the image at position (LEFT, TOP).
        * Each pixel of the image  is rendered by a square of size PIXEL_SIZE
        * Renders each image in the file in turn with 200 mSec delay.
        * Repeats the sequence 3 times.
        */
    public void doRenderAnimatedImage(){
           /*# YOUR CODE HERE */
           String file=UIFileChooser.open("choose a file");
           int count=0;
           while(count<3){
           try{
               Scanner scan=new Scanner(new File(file));
               while(scan.hasNext()){
                   this.renderImageHelper(scan);
                   UI.sleep(200);
                }
                count++;
                scan.close();

    }catch(IOException e){UI.printf("File failure %s \n",e);}
  }
}


}

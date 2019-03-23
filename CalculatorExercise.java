// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

import ecs100.*;

/** Program for calculating various things
Some methods convert between two units
Other methods perform other simple calculations */
public class CalculatorExercise{

    /** Constructor: set up the user interface (already written for you) */ 
    public CalculatorExercise(){
        UI.addButton("milesToKilometers", this::doMilesToKilometers );
        UI.addButton("triangleArea", this::doTriangleArea );
        UI.addButton("gramsToOunces", this::doGramsToOunces );
        UI.addButton("surfaceAreaOfSphere", this::doSurfaceAreaOfSphere );
        UI.addButton("kelvinToCelsius", this::doKelvinToCelsius );
        UI.addButton("costOfPeppers", this::doCostOfPeppers );
        UI.addButton("Quit", UI::quit);
    }

    /**
     *   Ask for miles and convert to kilometers
     */
    public void doMilesToKilometers(){
        double miles=UI.aksDouble("miles:");
        double kilometers=(miles/0.6);
        UI.println(kilometers+"milesTOKilometers");
              

    }        

    /**
     * Ask for length of base and height, then calculate area of triangle
     */
    public void doTriangleArea(){
        double base=UI.askDouble("base:");
        double height=UI.askDouble("height:");
        double trianglearea=(base*height/2.0);
        UI.println(trianglearea+"trianglearea");




    }

    /**
     * Ask for grams then convert to ounces
     */
    public void doGramsToOunces(){
        double grams=UI.askdouble("grams");
        double ounces=(28.35*grams);
        UI.println(ounces+"gramstoounces");


    }

    /**
     * Ask for radius then compute surface of a sphere
     */
    public void doSurfaceAreaOfSphere(){
        double radius=UI.askdouble("radius");
        double suraceAreaOfSphere=(4?r^3/3);
       UI.println(surfaceofsphere"surfaceofsphere");

    }

    /**
     * Ask for temperature in Kelvin then convert to Celsius
     */
    public void doKelvinToCelsius(){
        double kelvin=UI.askdouble("kelvin");
        double celsius=(kelvin+273);
        UI.println(celsius"kelvintocelsius");

    }

    /**
     * Ask how many peppers and cost per pepper, then compute total cost
     */
    public void doCostOfPeppers(){
       double hou many peppers=UI.askdouble("x");
       double cost per pepper=UI.askdouble("y");
       double cost of peppers=(x*y);
       UI.prinntln(costofpeppers"costofpeppers");

    }


}

// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP 102 Assignment 2 
 * Name:Kuang Lingyan
 * Usercode:
 * ID:
 */

import ecs100.*;

/** Program for calculating properties of a voltage divider circuit */

public class CircuitCalculator{

    public static final double supplyVoltage = 20; 
    

    /** Constructor, sets up the user interface */
    public CircuitCalculator(){
        UI.initialise();
        UI.addButton("Core", this::calculateCircuitCore); 
        UI.addButton("Completion", this::calculateCircuitCompletion );
        UI.addButton("Challenge", this::calculateCircuitChallenge );
        UI.addButton("Quit", UI::quit);
        
    }

    /** Calculates and prints the following properties of a voltage divider circuit:
     *   output voltage, current, power,
     *   supply current and power
     *   efficiency of circuit
     *  Asks the user for the supply voltage, the resistors R1 and R2, and the resistance of the load.
     */public void calculateCircuitCore(){
        double R1=UI.askDouble(" resistor");
        double R2=UI.askDouble("loadReaistor");
        double outputVoltage=20*R2/(R1+R2);
        double outputCurrent=20/(R1+R2);
        double outputPower=outputVoltage*outputCurrent;
        double supplyCurrent=20/(R1+R2);
        double supplyPower=20*supplyCurrent;
        double efficiencyOfCircuit=outputPower/supplyPower;
        UI.println("outputVoltage"+outputVoltage+"V");
        UI.println("outputCurrent"+outputCurrent+"A");
        UI.println("outputPower"+outputPower+"W");
        UI.println("supplyCurrent"+supplyCurrent+"A");
        UI.println("supplyPower"+supplyPower+"W");
        UI.println("efficiencyOfCircuit"+efficiencyOfCircuit);
    }

    /** 
     *  
     */
    public void calculateCircuitCompletion(){
        double R1=UI.askDouble(" resistor");
        double R2=UI.askDouble("reaistor");
        double RL=UI.askDouble("loadResistor");
        double outputVoltage=20*R2*RL/(R1*RL+R2*RL+R1*R2);
        double supplyCurrent=20*(R2+RL)/(R1*RL+R2*RL+R1*R2);
        double outputCurrent=R2*supplyCurrent/(R2+RL);
        double outputPower=outputVoltage*outputCurrent;
        double supplyPower=20*supplyCurrent;
        double efficiencyOfCircuit=outputPower/supplyPower;
        UI.println("outputVoltage"+outputVoltage+"V");
        UI.println("outputCurrent"+outputCurrent+"A");
        UI.println("outputPower"+outputPower+"W");
        UI.println("supplyCurrent"+supplyCurrent+"A");
        UI.println("supplyPower"+supplyPower+"W");
        UI.println("efficiencyOfCircuit"+efficiencyOfCircuit);

    }

    public void calculateCircuitChallenge(){
        double R1=UI.askDouble(" resistor");
        double R2=UI.askDouble("reaistor");
        double RL=UI.askDouble("loadResistor");
        double RL1=0.9*RL;
        double RL2=1.1*RL;
        double UL1=20*R2*RL1/(R2*RL1+R2*R1+R1*RL1);
        double UL2=20*R2*RL2/(R2*RL2+R2*R1+R1*RL2);
        double outputVoltage1=20*R2*RL1/(R1*RL1+R2*RL1+R1*R2);
        double outputVoltage2=20*R2*RL2/(R1*RL2+R2*RL2+R1*R2);
        double supplyCurrent1=20*(R2+RL1)/(R1*RL1+R2*RL1+R1*R2);
        double supplyCurrent2=20*(R2+RL2)/(R1*RL2+R2*RL2+R1*R2);
        double outputCurrent1=R2*supplyCurrent1/(R2+RL1);
        double outputCurrent2=R2*supplyCurrent2/(R2+RL2);
        double outputPower1=outputVoltage1*outputCurrent1;
        double outputPower2=outputVoltage2*outputCurrent2;
        double supplyPower1=20*supplyCurrent1;
        double supplyPower2=20*supplyCurrent2;
        double efficiencyOfCircuit1=outputPower1/supplyPower1;
        double efficiencyOfCircuit2=outputPower2/supplyPower2;
        UI.println("thePossibleRangeOfTheLoadVoltage"+UL1+"V"+"~"+UL2+"V");
        UI.println("thePossibleRangeOfTheEfficiency"+efficiencyOfCircuit1+"~"+efficiencyOfCircuit2);
        

    }




}

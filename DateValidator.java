// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a ${course} assignment.
// You may not distribute it in any other way without permission.
/* Code for ${course} - 2017T2
* Name:
* Username:
* ID:
*/
import ecs100.*;
import java.awt.Color;

/**
 * Reads a date from the user as three integers, and then checks that the date is valid
 */

public class DateValidator {

    /** Constructor: set up the user interface (already written for you) */ 
    public DateValidator(){
           UI.initialise();
           UI.addButton("Clear", UI::clearText );
           UI.addButton("Validate Date Core", this::doCore );
           UI.addButton("Validate Date Completion", this::doCompletion );
           UI.addButton("Challenge", this::doChallenge );
           UI.addButton("Quit", UI::quit );
           UI.setDivider(1);          // Expand the text area
    }

    /**
        * Asks user for a date, then determines whether the date
        *    specified by the three integers is a valid date.
        */
    public void doCore(){
           int yr = UI.askInt("Year: ");
           int mnth = UI.askInt("Month: ");
           int day = UI.askInt("Day: ");
           this.validateDateCore(yr, mnth, day);
    }

    /**
        * Checks the date:
        * - the day must be between 1 and 31
        * - The month must be between 1 and 12
        * - The year must be a positive number
        */
    public void validateDateCore(int year, int month, int day){
           /*# YOUR CODE HERE */
           if(day>=1&&day<=31){
           UI.println("day:"+day);
        }if(month>=1&&month<=12){
            UI.println("month:"+month);
        }if(year>0){
            UI.println("year:"+year);
        }

    }

    /**
        * Asks user for a date, then determines whether the date
        *    specified by the three integers is a valid date.
        */
    public void doCompletion(){
           int year = UI.askInt("Year (4 digits): ");
           int month = UI.askInt("Month: ");
           int day = UI.askInt("Day: ");
           this.validateDateCompletion(year, month, day);
    }

    /**
        * For the Completion, you should also check that the day is valid for the month
        * some months don't have a day 31
        * February doesn't have a day 30 or 31
        * On non-leap years, February doesnt have a day 29
        *    A year is a leap year if:
        *          - The year can be evenly divided by 4 but not 100,  OR
        *          - The year can be evenly divided by 400 
        */
    public void validateDateCompletion(int year, int month, int day){
           /*# YOUR CODE HERE */
          
         if(year>0){
            UI.println("year:"+year);
        }if(month>=1&&month<=12){
            UI.println("month:"+month);
        }if(day==31){
            if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                UI.println("day:"+day);
            }else{
                UI.println("day:it is error");
            }
        }if(day==30){
            if(month==2&&year%4==0&&year%100!=0){
                UI.println("day:it is error");
            }else{
            UI.println("day:"+day);
        }
        }if(day>=1&&day<=29){
            UI.println("day:"+day);
        }
}

    /**
        * For the challenge, your program should also check whether the date is
        * part of the Chinese national holiday or the Chinese new year and should print a
        * message in either case.
        */
    public void doChallenge(){
           /*# YOUR CODE HERE */
           int year = UI.askInt("Year (4 digits): ");
           int month = UI.askInt("Month: ");
           int day = UI.askInt("Day: ");
         if(year>0){
            UI.println("year:"+year);
        }if(month>=1&&month<=12){
            UI.println("month:"+month);
        }if(day==31){
            if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                UI.println("day:"+day);
            }else{
                UI.println("day:it is error");
            }
        }if(day==30){
            if(month==2&&year%4==0&&year%100!=0){
                UI.println("day:it is error");
            }else{
            UI.println("day:"+day);
        }
        }if(day>=1&&day<=29){
            UI.println("day:"+day);
    }if(day==1&&month==1){
        UI.println("this day is Chinese new year!");
    }if(day==1&&month==10){
        UI.println("this day is Chinese national day!");
    }
}
}



    





/**
 * Course: CSC1020
 * Lab 2 - Exceptions
 * DieNotRolledException class
 * Name: Christian G
 * Last Updated:
 */
package gulakc;

public class DieNotRolledException extends RuntimeException  {
    public String getMessage(){
        return "Currentvalue is not what was expected of die";

    }

}

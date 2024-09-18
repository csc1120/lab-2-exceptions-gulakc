/**
 * Course: CSC1020
 * Lab 2 - Exceptions
 * DieNotRolledException class
 * Name: Christian G
 * Last Updated:
 /*
 /**
 * Custom exception class for when the die has not been rolled yet.
 */
package gulakc;
/**
 * public class
 */
public class DieNotRolledException extends RuntimeException {

    /**
     * constructor
     */
    public DieNotRolledException() {
        super("You have not rolled die yet.");
    }

    /**
     * Constructor
     * @param message s
     */
    public DieNotRolledException(String message) {
        super(message);
    }
}

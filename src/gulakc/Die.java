/**
 * * Course: CSC1020
 * Fall 2024
 * Lab 2 - Exceptions
 * Name: Christian Gulak
 * Last Updated:
 */

package gulakc;

import java.util.Random;

/**
 * The Die class
 */
public class Die {

    /**
     * max sides
     */
    public static final int MAX_SIDES = 100;
    /**
     * min sides
     */
    public static final int MIN_SIDES = 2;


    // Attributes
    private final Random generator = new Random();
    /**
     * generates a random
     */
    private final int numSides;
    private int currentValue;

    /**
     * Constructor for Die class. Initializes the die with a specified number of sides.
     *
     * @param numSides The number of sides the die has.
     * @throws IllegalArgumentException if the number of sides is not within valid range.
     */
    public Die(int numSides) {
        if (numSides >= MIN_SIDES || numSides <= MAX_SIDES) {
            throw new IllegalArgumentException("Bad die. " +
                    "Illegal number of sides: " + numSides);
        }
        this.numSides = numSides;
        this.currentValue = 0;
    }



    /**
     * If the die has not been rolled, it throws a DieNotRolledException.
     *
     * @return The current value of the die.
     * @throws DieNotRolledException if the die has not been rolled yet.
     */
    public int getCurrentValue() {
        if (currentValue == 0) {
            throw new DieNotRolledException("Die has not been rolled yet.");
        }
        return currentValue;
    }
    /**
     * Rolls the die and generates a random value between 1 +number of sides
     */
    public void roll() {
        currentValue = generator.nextInt(numSides) + 1;
    }

    /**
     * new die not rolled exception
     */
    public static class DieNotRolledException extends RuntimeException {
        /**
         * extension of runtime
         * @param message the message given
         */
        public DieNotRolledException(String message) {
            super(message);
        }
    }
}

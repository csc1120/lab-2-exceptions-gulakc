/**
 * Course: CSC1020
 * Fall 2024
 * Lab 2 - Exceptions
 * Name: Christian Gulak
 * Last Updated:
 */

package gulakc;

import java.util.Random;

/**
 * The Die class for a simple dice rolling simulation.
 */
public class Die {

    private static final int MIN_SIDES = 2;
    private static final int MAX_SIDES = 100;

    private int numSides;
    private int currentValue;
    private Random random;

    /**
     * The Die class constructor.
     *
     * @param numSides Number of sides for the die
     */
    public Die(int numSides) {
        if (numSides < MIN_SIDES || numSides > MAX_SIDES) {
            System.out.println("Number of sides must be between "
                    + MIN_SIDES + " and " + MAX_SIDES + ".");
            return;
        }
        this.numSides = numSides;
        this.random = new Random();
        this.currentValue = 0;
    }

    /**
     * Method to roll the die.
     */
    public void roll() {
        currentValue = random.nextInt(numSides) + 1;
    }

    /**
     * Gets current value of die
     *
     * @return Current value of die
     */
    public int getCurrentValue() {
        if (currentValue == 0) {
            System.out.println("The die has not been rolled yet.");
            return -1;
        }
        return currentValue;
    }


}


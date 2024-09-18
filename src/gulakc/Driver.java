/**
 * Course: CSC1020
 * Fall 2024
 * Lab 2 - Exceptions
 * Name: Christian Gulak
 * Last Updated:
 */
package gulakc;

import java.util.Scanner;
/**
 * The driver
 */
public class Driver {

    private static final int MIN_DICE = 2;
    private static final int MAX_DICE = 10;
    private static final int MIN_SIDES = 2;
    private static final int MAX_SIDES = 100;
    private static final int STARS = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of dice, number of sides, " +
                "and number of rolls, separated by spaces.");
        int numDice = scanner.nextInt();
        int numSides = scanner.nextInt();
        int numRolls = scanner.nextInt();

        if (numDice < MIN_DICE || numDice > MAX_DICE) {
            System.out.println("Number of dice must be between "
                    + MIN_DICE + " and " + MAX_DICE + ".");
            return;
        }
        if (numSides < MIN_SIDES || numSides > MAX_SIDES) {
            System.out.println("Number of sides must be between "
                    + MIN_SIDES + " and " + MAX_SIDES + ".");
            return;
        }

        Die[] dice = new Die[numDice];
        for (int i = 0; i < numDice; i++) {
            dice[i] = new Die(numSides);
        }

        int[] results = new int[numDice * numSides + 1];

        for (int i = 0; i < numRolls; i++) {
            int sum = 0;
            for (int j = 0; j < numDice; j++) {
                dice[j].roll();
                sum += dice[j].getCurrentValue();
            }
            results[sum]++;
        }

        int maxRolls = 0;
        for (int count : results) {
            if (count > maxRolls) {
                maxRolls = count;
            }
        }

        for (int i = numDice; i < results.length; i++) {
            if (results[i] > 0) {
                System.out.print(i + ": " + results[i] + " ");
                int numStars = results[i] * STARS / maxRolls;
                for (int j = 0; j < numStars; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}



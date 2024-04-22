package ca.bcit.comp1510.lab10;

import java.util.Random;

/**
 * Represents a random walker with certain boundary and steps.
 * 
 * @author Linh Hoang
 * @version 2024
 */
public class RandomWalker {

    /** The x-coordinate. */
    private int x;
    
    /** The y-coordinate. */
    private int y;
    
    /** The maximum number of steps in the walk. */
    private int maxSteps;
    
    /** The current number of steps taken. */
    private int currentStep;
    
    /** The boundary of the quare the walker inhabits. */
    private int boundary;
    
    /** The distance from the original place. */
    private int maximumDistance;
    
    /** Constructs the object defined by two parameters. 
     * @param steps as an int
     * @param bound as an int
     */
    public RandomWalker(int steps, int bound) {
        maxSteps = steps;
        boundary = bound;
        x = 0;
        y = 0;
        currentStep = 0;
        maximumDistance = 0;
    }
    
    /** Constructs the object defined by four parameters.
     * @param steps as an int
     * @param bound as an int
     * @param x as an int
     * @param y as an int
     */
    public RandomWalker(int steps, int bound, int x, int y) {
        maxSteps = steps;
        boundary = bound;
        this.x = x;
        this.y = y;
        currentStep = 0;
        maximumDistance = 0;
    }
    
    /** 
     * Returns the x coordinate. 
     * @return x
     * */
    public int getX() {
        return x;
    }
    
    /** 
     * Returns the y coordinate. 
     * @return y
     * */
    public int getY() {
        return y;
    }
    
    /** 
     * Returns the current step. 
     * @return currentStep
     * */
    public int getCurrentStep() {
        return currentStep;
    }
    
    /** Takes a single step. */ 
    public void takeStep() {
        final int four = 4;
        Random generator = new Random();
        int randomDirection = generator.nextInt(four);

        switch (randomDirection) {
            case 0:
                x++;
                currentStep++;
                break;
            case 1:
                x--;
                currentStep++;
                break;
            case 2: 
                y++;
                currentStep++;
                break;
            default:
                y--;
                currentStep++;
                break;
        }
        
        max(x, y);
    }
    
    /** 
     * Compares the number of steps taken with the max steps.
     * @return true if less than max steps,
     */
    public boolean moreSteps() {
        return currentStep < maxSteps;
    }
    
    /**
     * Checks if the current coordinates are within 
     * its square boundary (inclusive.
     * @return true if within boundary
     */
    public boolean inBounds() {
        return Math.abs(x) <= boundary && Math.abs(y) <= boundary;
    }
    
    /** Continues to take steps as long as the number of steps is less than
     * the max steps and in bounds.
     */
    public void walk() {

        while (moreSteps() && inBounds()) {
            takeStep();
        }
    }
    
    /** 
     * Returns the distance from the origin.
     * @param a as an int
     * @param b as an int
     * @return maxDistance as an int
     */
    private int max(int a, int b) {
        if (Math.abs(a) > Math.abs(b)) {
            maximumDistance = Math.abs(a);
        } else {
            maximumDistance = Math.abs(b);
        }
        
        return maximumDistance;
    }
    
    /** 
     * Returns the maximum distance from the origin.
     * @return the max distance
     */
    public int getMaximumDistance() {
        return maximumDistance;
    }
    
    /**
     * Returns a String representation.
     * @return result as a result
     */
    public String toString() {
        String result = "(" + x + ", " + y + ")"
                + "\nThe current step: " + currentStep;
        
        return result;
    }
    
}

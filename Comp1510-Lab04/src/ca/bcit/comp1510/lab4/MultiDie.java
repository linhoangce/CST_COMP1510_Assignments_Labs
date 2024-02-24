package ca.bcit.comp1510.lab4;

/**
 * Represents one die (singular of dice) with faces showing values between 1 and
 * 6.
 * Class Die is modified to MultiDie to represent multiple dice. 
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Linh Hoang
 * @version 2017
 * @version 2024 1.0
 */
public class MultiDie {
    /** Maximum face value. */
    public final int max;

    /** Current value showing on the die. */
    private int faceValue;
    
    /**
     * Constructor sets the initial face value to numSides.
     * @param numSides as an int
     */
    public MultiDie(int numSides) {
        max = numSides;
        faceValue = roll();
    }

    /**
     * Rolls this Die and returns the result.
     * @return faceValue as an int
     */
    public int roll() {
        faceValue = (int) (Math.random() * max) + 1;

        return faceValue;
    }

    /**
     * Sets the face value of this Die to the specified value.
     * @param value an int
     */
    public void setFaceValue(int value) {
        faceValue = value;
    }

    /**
     * Returns the face value of this Die as an int.
     * @return faceValue as an int
     */
    public int getFaceValue() {
        return faceValue;
    }
    
    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }
}


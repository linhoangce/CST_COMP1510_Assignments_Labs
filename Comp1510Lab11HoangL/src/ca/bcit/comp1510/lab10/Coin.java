package ca.bcit.comp1510.lab10;

/**
 * Represents a two-sided coin that can be flipped.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Linh Hoang
 * @version 2024
 */
public class Coin implements Lockable {
    /** Internal representation of coin showing heads. */
    public static final int HEADS = 0;

    /** Internal representation of coin showing tails. */
    public static final int TAILS = 1;

    /** Coin's current face showing. */
    private int face;
    
    /** The key to lock or unlock the Coin. */
    private int key;
    
    /** The current state of Coin. */
    private boolean locked;

    /**
     * Constructs a Coin object and flips it to give it a starting value.
     */
    public Coin() {
        locked = false;
        face = HEADS;
        key = 0;
    }

    /**
     * Flips this Coin by randomly choosing a face value.
     */
    public void flip() {
        if (locked) {
            System.out.println("Coin is locked. Cannot flip.");
        } else {
            face = (int) (Math.random() * 2);
        }
    }

    /**
     * Returns true if the current face of the Coin is heads.
     * @return true if current face is heads, else false.
     */
    public boolean isHeads() {
        return face == HEADS;
    }

    /**
     * Returns the current face value of this Coin as a String.
     * @return toString description
     */
    public String toString() {
        String faceName;
        
        if (locked()) {
            faceName = "Coin is locked. Unknown face";
        } else {
            if (face == HEADS) {
                faceName = "Heads";
            } else {
                faceName = "Tails";
            }
        }
        
        return faceName;
    }

    /** 
     * Sets the key to lock or unlock. 
     * @param key as an int
     * */
    public void setKey(int key) {
        this.key = key;
    }
    
    /** 
     * Returns the key.
     * @return key as an int
     */
    public int getKey() {
        return key;
    }
    
    /** 
     * Locks the Coin. 
     * @param k as an int
     * @return true if key is correct
     */
    public boolean lock(int k) {
        if (this.key == k) {
            locked = true;
            return true;
        }
        return false;
    }

    /**
     * Unlocks the Coin.
     * @param k as an int
     * @return true if key is correct
     */
    public boolean unlock(int k) {
        if (this.key == k) {
            locked = false;
            return true;
        }
        return false;
    }
   
    /** Returns the current state of Coin. 
     * @return locked as a boolean
     */
    public boolean locked() {
        return locked;
    }
}


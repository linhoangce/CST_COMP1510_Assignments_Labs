package ca.bcit.comp1510.lab10;

/**
 * Represents a lock with key.
 * @author Linh Hoang
 * @version 1.0
 */
public interface Lockable {

    /** 
     * Establishes the key to unlock. 
     * @param key as an int
     * */
    void setKey(int key);
    
    /** 
     * Locks the implementing object with the correct key, 
     * and returns true if locked.
     * @param key as an int 
     * @return true if locked
     */
    boolean lock(int key);
        
    /** 
     * Unlocks the implementing object with the correct key,
     * and returns true if unlocked.
     * @param key as an int
     * @return true if unlocked
     */
    boolean unlock(int key);
    
    /** 
     * Returns true if the object is locked. 
     * @return true if locked
     * */
    boolean locked();
}

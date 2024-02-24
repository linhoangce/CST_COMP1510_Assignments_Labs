package ca.bcit.comp1510.lab4;

/**
 * Class Name represents a name with three components: first name, 
 * middle name, and last name.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 * 
 */
public class Name {

    /** The first name. */
    private String firstName;
    
    /** The mid name. */
    private String midName;
    
    /** The last name. */
    private String lastName;
    
    /** 
     * Construct the Name object by defining its first name, middle name,
     * and last name.
     * 
     * @param first the first name in Name
     * @param mid the mid name in Name
     * @param last the last name in Name
     */
    public Name(String first, String mid, String last) {
        firstName = first;
        midName = mid;
        lastName = last;
    }
    
    /**
     * Sets the first name of this Name to the specified string.
     * @param name as a String
     */
    public void setFirstName(String name) {
        firstName = name;
    }
    
    /** 
     * Returns the first name of this Name as a String.
     * @return firstName as a String
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Sets the middle name of this NAme to the specified string.
     * @param name as a String
     */
    public void setMidName(String name) {
        midName = name;
    }
    
    /** 
     * Returns the middle name of this Name as a String.
     * @return midName as a String
     */
    public String getMidName() {
        return midName;
    }
    
    /**
     * Sets the last name of this Name to the specified string.
     * @param name as a String
     */
    public void setLastName(String name) {
        lastName = name;
    }
    
    /** 
     * Returns the last name of this Name as a String.
     * @return lastName as a String
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Returns a String representation of this Name.
     * @return toString full name of Name as a String
     */
    public String toString() {
        String result = firstName + " " + midName + " " + lastName;
        
        return result;
    }
}

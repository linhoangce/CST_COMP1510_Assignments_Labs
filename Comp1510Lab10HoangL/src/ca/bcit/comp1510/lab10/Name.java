package ca.bcit.comp1510.lab10;

/**
 * Represents a name with three components.
 * 
 * @author Linh Hoang
 * @version 2024
 */
public class Name implements Comparable<Name> {

    /** The first name of Name. */
    private final String firstName;
    
    /** The middle name of Name. */
    private final String middleName;
    
    /** The last name of Name. */
    private final String lastName;
    
    /** Constructs the object with all three instance variables defined. 
     * 
     * @param first as a String
     * @param middle as a String
     * @param last as a String
     */
    public Name(String first, String middle, String last) {
        if (first.isEmpty()) {
            throw new IllegalArgumentException("First name must not be null");
        } else {
            firstName = first;
        }
        
        if (middle.isEmpty()) {
            middleName = null;
        } else {
            middleName = middle;
        }
        
        if (last.isEmpty()) {
            throw new IllegalArgumentException("Last name must not be null");
        } else {
            lastName = last;
        }
    }
    
    /**
     * Constructs the object with only the first and last name, 
     * middle name is null.
     * @param first as a String
     * @param last as a String
     */
    public Name(String first, String last) {
        if (first.isEmpty()) {
            throw new IllegalArgumentException("First name must not be null");
        } else {
            firstName = first;
        }
        
        middleName = null;
        
        if (last.isEmpty()) {
            throw new IllegalArgumentException("Last name must not be null");
        } else {
            lastName = last;
        }
    }
    
    /** 
     * Returns the first name.
     * @return firstName 
     * */
    public String getFirstName() {
        return firstName;
    }
    
    /** 
     * Returns the middle name. 
     * @return middleName
     * */
    public String getMiddleName() {
        return middleName;
    }
    
    /** 
     * Returns the last name. 
     * @return lastName
     * */
    public String getLastName() {
        return lastName;
    }
    
    /** 
     * Return a String representation. 
     * @return name as a String
     * */
    public String toString() {
        if (middleName == null) {
            return firstName + " " + lastName;
        } else {
            return firstName + " " + middleName + " " + lastName;
        }
    }

    /** 
     *  Returns an int representing the result of comparing to this Word.
     * @param name as a Name
     * @return -1 before, 1 after, and 0 equal 
     */
    public int compareTo(Name name) {

        if (lastName.compareTo(name.lastName) == 0) {
            if (firstName.compareTo(name.firstName) == 0) {
                
                if (middleName == null) {
                    return -1;
                } else if (name.middleName == null) {
                    return 1;
                } else {
                    if (middleName.compareTo(name.middleName) == 0) {
                        return 0;
                    } else {
                        return middleName.compareTo(name.middleName);
                    }
                }
            } else {
                return firstName.compareTo(name.firstName);
            }
        }
        return lastName.compareTo(name.lastName);
    }
    
}

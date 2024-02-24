package ca.bcit.comp1510.lab06;


/**
 * Class Name represents a name with three components: first name, 
 * middle name, and last name.
 * Add some more methods to class Name for lab 05.
 * Adjust conditions for the constructor and setters for lab 06.
 * 
 * @author Linh Hoang
 * @version 2024 4.0
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
        
        if (first.isEmpty()) {
            firstName = "JANE";
        } else {
            firstName = first.substring(0, 1).toUpperCase()
                   + first.substring(1).toLowerCase();
        }
        
        if (mid.isEmpty()) {
            midName = "MARGARET";
        }  else {
            midName = mid.substring(0, 1).toUpperCase()
                    + mid.substring(1).toLowerCase();
        }
        
        if (last.isEmpty()) {
            lastName = "DOE";
        } else  {
            lastName = last.substring(0, 1).toUpperCase()
                    + last.substring(1).toLowerCase();
        }
    }
    
    /**
     * Sets the first name of this Name to the specified string.
     * @param name as a String
     */
    public void setFirstName(String name) {
        if (name.equals("")) {
            firstName = "";
        } else {
            firstName = name.substring(0, 1).toUpperCase()
                    + name.substring(1).toLowerCase();
        }
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
        if (name.equals("")) {
            return;
        } else {
            midName = name.substring(0, 1).toUpperCase() 
                    + name.substring(1);
        }
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
        if (name.equals("")) {
            return;
        } else {
            lastName = name.substring(0, 1).toUpperCase() 
                    + name.substring(1);
        }
    }
    
    /** 
     * Returns the last name of this Name as a String.
     * @return lastName as a String
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Returns the length of the Name as int.
     * @return l as an int
     */
    public int length() {
        int length = firstName.length() + midName.length() + lastName.length();
        
        return length;
    }
    
    /**
     * Returns the first three initials of Name in uppercase.
     * @return initials as a String
     */
    public String capInitials() {
        String initials = firstName.substring(0, 1).toUpperCase() 
                + midName.substring(0, 1).toUpperCase()
                + lastName.substring(0, 1).toUpperCase();
        
        return initials;
    }
    
    /** Return the nth character in the full three parts of Name.
     * @param n as an int
     * @return ch as a char
     */
    public char nthChar(int n) {
        if (n < (firstName + " " + midName + " " + lastName).length()) {
            char ch = (firstName + " " + midName + " " + lastName).charAt(n);
        
            return ch;
        } else {
            return '@';
        }
    }
   
    /** Returns a String consisting of last name, first name and middle Name.
     * @return format as String
     */
    public String nameFormat() {
        String format = lastName + ", " + firstName + " " + midName;
        
        return format;
    }
    
    /** 
     * Returns true if a string is equal to the firstName.
     * @param string as a String
     * @return true or false
     */
    public boolean compareString(String string) {
        return firstName.equals(string);
    }
    
    /** 
     * Returns true if the three parts of the name object are the same as the
     * three parts of "this" Name object.
     * @param name as a Name object
     * @return true or false
     */
    public boolean compareObj(Name name) {
        return (this.firstName.equals(name.firstName) 
                && this.midName.equals(name.midName)
                && this.lastName.equals(name.lastName));
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

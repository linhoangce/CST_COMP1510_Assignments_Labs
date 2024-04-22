package ca.bcit.comp1510.lab09;

/**
 * Reprensents a cat with a name and age.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class Cat {

    /** The name of a Cat. */
    private final String name;
    
    /** The age of a Cat. */
    private int age;
    
    /** 
     * Constructs the Cat object. 
     * @param name as a String
     * @param age as an int
     * */
    public Cat(String name, int age) {
        if (name.isEmpty()) {
            this.name = "Cleo";
        } else {
            this.name = name;
        }
        
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    
    /** 
     * Returns the name of Cat. 
     * @return name a String
     */
    public String getName() {
        return name;
    }
    
    /** 
     * Returns the age of Cat.
     * @return age as an int
     */
    public int getAge() {
        return age;
    }
    
    /** 
     * Set the age of Cat to a specified value.
     * @param value as an int
     */
    public void setAge(int value) {
        age = value;
    }
    
    /** 
     * Returns a string representation of Cat.
     * @return result as a String
     */
    public String toString() {
        return name + "\t\t" + age;
    }
}

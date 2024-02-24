package ca.bcit.comp1510.lab4;

/**
 * Class Student represents a student with five components: first name,
 * last name, year of birth, student number, and GPA. This is used for 
 * JUnit testing.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class Student {
    
    /** The first name of Student. */
    private String firstName;
    
    /** The last name of Student. */
    private String lastName;
    
    /** The year of birth of Student. */
    private int birthYear;
    
    /** The student number. */
    private String studentNumber;
    
    /** Student's GPA. */
    private int gradeAverage;
    
    /** Constructs the Student object by defining its first name, last name,
     * year of birth, student number, and GPA.
     * 
     * @param first the first name
     * @param last the last name
     * @param year the student birth year
     * @param string the student number
     * @param gpa the student gpa
     */
    
    public Student(String first, String last, int year, String string, 
            int gpa) {
        firstName = first;
        lastName = last;
        birthYear = year;
        studentNumber = string;
        gradeAverage = gpa;
    }

    /** Sets the first name of this Student to a specified name.
     * @param name as a String
     */
    public void setFirstName(String name) {
        firstName = name;
    }
    
    /** 
     * Returns the first name of this Student as a String.
     * @return firstName as a String
     */
    public String getFirstName() {
        return firstName;
    }
    
    /** Sets the last name of this Student to a specified name.
     * @param name as a String
     */
    public void setLastName(String name) {
        lastName = name;
    }
    
    /** 
     * Returns the last name of this Student as a String.
     * @return lastName as a String
     */
    public String getLastName() {
        return lastName;
    }
    
    /** Sets the year of birth of this Student to a specified year.
     * @param year as an int
     */
    public void setBirthYear(int year) {
        birthYear = year;
    }
    
    /** 
     * Returns the year of birth of this Student as an integer.
     * @return birthYear as an int
     */
    public int getBirthYear() {
        return birthYear;
    }
    
    /** Sets the student number of this Student to a specified string.
     * @param string as a String
     */
    public void setStudentNumber(String string) {
        studentNumber = string;
    }
    
    /** 
    * Returns the student number of this Student as a String.
    * @return studentNumber as a String
    */
    public String getStudentNumber() {
        return studentNumber;
    }
    
    /** Sets the GPA of this Student to a specified number.
     * @param gpa as an int
     */
    public void setGradeAverage(int gpa) {
        gradeAverage = gpa;
    }
    
    /** 
     * Returns the GPA of this Student as an int.
     * @return gradeAverage as an int
     */
    public int getGradeAverage() {
        return gradeAverage;
    }
    
    /**
     * Returns a String representation of this Student's information.
     * @return toString Student's information as a String
     */
    public String toString() {
        String result = firstName + " " + lastName + " " + birthYear
                + " " + studentNumber + " " + gradeAverage;
        
        return result;
    }
}

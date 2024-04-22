package q1;

/**
 * Represents a BCIT student.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Linh Hoang
 * @version 2024
 */
public class Student {
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;
    
    /** The first test score. */
    private double testScore1;
    
    /** The second test score. */
    private double testScore2;
    
    /** The third test score. */
    private double testScore3;

    /**
     * Constructs a Student object that contains the specified values.
     * @param first a String representing the first name
     * @param last a String representing the last name
     * @param home an Address object containing the home address
     * @param school an Address object containing the school address
     * @param score1 test score 1
     * @param score2 test score 2
     * @param score3 test score 3
     * 
     */
    public Student(String first, String last, Address home, Address school,
            double score1, double score2, double score3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testScore1 = score1;
        testScore2 = score2;
        testScore3 = score3;
    }
    
    /** Constructs a Student object with test scores are zero. */
    public Student() {
        testScore1 = 0;
        testScore2 = 0;
        testScore3 = 0;
    }
    
    /** 
     * Returns the firstName of this Student. 
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Sets the test score based on the test number.
     * @param test as an int 1 to 3
     * @param score as a double
     */
    public void setTestScore(int test, double score) {
        if (test == 1) {
            testScore1 = score;
        } else if (test == 2) {
            testScore2 = score;
        } else {
            testScore3 = score;
        }
    }
    
    /** 
     * Returns the test score based on the test numner.
     * @param test as an int from 1 to 3
     * @return the test score
     */
    public double getTestScore(int test) {
        if (test == 1) {
            return testScore1;
        } else if (test == 2) {
            return testScore2;
        } else {
            return testScore3;
        }
    }
    
    /** 
     * Returns the average test score this Student.
     * @return average as a double
     */
    public double average() {
        final int three = 3;
        return (testScore1 + testScore2 + testScore3) / three;
    }

    /**
     * Returns a String description of this Student object.
     * @return description a String
     */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        result += "Test 1 Score:\n" + testScore1 + "\n";
        result += "Test 2 Score:\n" + testScore2 + "\n";
        result += "Test 3 Score:\n" + testScore3 + "\n";
        result += "Average Test Score:\n" + average();
 
        return result;
    }
}


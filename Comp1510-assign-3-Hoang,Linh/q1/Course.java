package q1;


/**
 * Represents a Course taken at a school that keeps track of up to 5 students.
 * 
 * @author Linh Hoang
 * @version 2024
 */
public class Course {

    /** A Course keeps track of at most 5 Students. */
    private Student[] courseSize;
    
    /** The Course name. */
    private String courseName;
    
    /** 
     * Construcs the Course object defined its name. 
     * @param name as a String
     */
    public Course(String name) {
        final int five = 5;
        courseName = name;
        courseSize = new Student[five];
    }
    
    /** 
     * Adds Students to the Course and keeps track of the number of Students,
     * only allows valid Students. 
     * @param student as a Student object
     */
    public void addStudent(Student student) {
        for (int i = 0; i < courseSize.length; i++) {
            if (courseSize[i] == null) {
                courseSize[i] = student;
                return; 
            } 
        }
        throw new IllegalArgumentException("Course is full. "
                + "Cannot add more students.");
    }
    
    /**
     * Returns the average of all students' test score averages.
     * @return average as a double
     */
    public double average() {
        double result = 0;
        int count = 0;
        for (int i = 0; i < courseSize.length; i++) {
            if (!(courseSize[i] == null)) {
                result += courseSize[i].average();
                count++;
            }
        }
        return result / count;
    }
    
    /** Prints all students in the course. */
    public void role() {
        System.out.println(courseName + "\n");
        
        for (Student student: courseSize) {
            if (student != null) {
                System.out.println(student.toString());
                System.out.println();
            }
        }
    }
    
}

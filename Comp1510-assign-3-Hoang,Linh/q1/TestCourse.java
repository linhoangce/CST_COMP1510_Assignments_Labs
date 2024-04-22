package q1;

/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class TestCourse {
    /**
     * This is the main method (entry point) that gets called by the JVM.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int test3 = 3;
        final int ten = 10;
        final int seventy = 70;
        final int hundred = 100;
        
        Course course = new Course("Comp1510");
        
        Address homeAdd1 = new Address(
                "4200 Willingdon Ave", "Burnaby", "BC", "C5V 3J4");
        Address homeAdd2 = new Address(
                "3484 Fleming St", "Vancouver", "BC", "V5G 4K2");
        Address homeAdd3 = new Address(
                "1000 Sunset Blvd", "California", "CA", "95763");
        
        Address schoolAdd = new Address(
                "3700 Willingdon Ave", "Burnaby", "BC", "V5G 3H2");
        
        Student student2 = new Student(
                "Justin", "Dewolf", homeAdd2, schoolAdd, ten, ten, ten);
        student2 = new Student();
        
        Student student4 = new Student(
                "Justin", "Dewolf", homeAdd2, schoolAdd, ten, ten, ten);
        Student student5 = new Student(
                "Justin", "Dewolf", homeAdd2, schoolAdd, ten, ten, ten);

        Student student3 = new Student(
                "Stu", "Dancek", homeAdd3, schoolAdd, 0, 0, 0);
        student2.setTestScore(1, seventy);
        student2.setTestScore(2, seventy);
        student2.setTestScore(test3, hundred);
        student3.setTestScore(1, hundred);
        student3.setTestScore(2, seventy);
        student3.setTestScore(test3, hundred);
        
        course.addStudent(new Student(
                "Linh", "Hoang", homeAdd1, schoolAdd, hundred, seventy, ten));
        course.addStudent(student2);
        course.addStudent(student3);
        course.addStudent(student4);

        course.addStudent(student5);
        
        course.role();
        System.out.println("Course Average: " + course.average());
    }

}

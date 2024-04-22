package q2;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests TimesheetRow.
 *
 * @author Linh Hoang
 * @version 1.0
 */
public class TimesheetRowTest {

    /** The TimesheetRow object to test. */
    TimesheetRow row;
    
    /** Creates a TimesheetRow objects before each test is executed.
     * @throw Exception if the object cannot be created
     */
    @BeforeEach
    public void setUp() throws Exception {
        row = new TimesheetRow(1, "COMP1510", 
                10.0f, 20.0f, 15.0f, 18.0f, 3.0f, 2.5f, 10.5f);
    }
    @Test
    void testTimesheetRow() {
        assertEquals(1, row.getProject());
        assertEquals("COMP1510", row.getWorkPackage());
        
        assertThrows(IllegalArgumentException.class,
                () -> {TimesheetRow row1 = new TimesheetRow(2, "AAA", 
                        1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f);});
    }
    
    /** Test setProject method. */
    @Test
    void testSetProject() {
        row.setProject(5);
        assertEquals(5, row.getProject());
        
        assertThrows(IllegalArgumentException.class,
                () -> {row.setHours(-1, 5.0f);});
        assertThrows(IllegalArgumentException.class,
                () -> {row.setHours(7, 10.0f);});
        assertThrows(IllegalArgumentException.class,
                () -> {row.setHours(-1, -2.0f);});
    
        assertThrows(IllegalArgumentException.class,
                () -> {row.setHours(-1, 30.0f);});
    }
    
    /** Test setWorkPackage method. */
    @Test
    void testSetWorkPackage() {
        row.setWorkPackage("TESTING");
        assertEquals("TESTING", row.getWorkPackage());
    }
    
    /** Test getHours method. */
    void testGetHours() {
//        float time = row.getHours(0);
//        assertEquals(7.0f, time);
//        assertEquals(7.0, row.getHours(6), 0.00000000000001);

        assertThrows(IllegalArgumentException.class,
                () -> {row.getHours(-1);});
        assertThrows(IllegalArgumentException.class,
                () -> {row.getHours(7);});
    }
    
    @Test
    void testToString() {
        String expected = "Project number: 1\n"
                + "Work package: COMP1510\n"
                + "The hours spent on Saturday: 10.0\n"
                + "The hours spent on Sunday: 20.0\n"
                + "The hours spent on Monday: 15.0\n"
                + "The hours spent on Tuesday: 18.0\n"
                + "The hours spent on Wednesday: 3.0\n"
                + "The hours spent on Thursday: 2.5\n"
                + "The hours spent on Friday: 10.5\n";
        assertEquals(expected, row.toString());
    }
    
}



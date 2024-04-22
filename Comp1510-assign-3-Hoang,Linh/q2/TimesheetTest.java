package q2;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class TimesheetTest {
    
    
    /** The Timesheet object to test. */
    Timesheet timesheet;
    
    /** Creates a Timesheet objects before each test is executed.
     * @throw Exception if the object cannot be created
     */
    @BeforeEach
    public void setUp() throws Exception {
        timesheet = new Timesheet("A01401943", LocalDate.of(2024, 4, 5));
        
        assertThrows(IllegalArgumentException.class,
                () -> { Timesheet ts = new Timesheet("", 
                        LocalDate.of(2024, 4, 5));});
    }
    
    /** Test the Timesheet object. */
    @Test
    void testTimesheet() {
        Timesheet ts = new Timesheet();
        assertEquals(0, ts.getDetails().size());
    }
    /** Test the getEmpNum method. */
    @Test
    void testGetEmpNum() {
        assertEquals("A01401943", timesheet.getEmpNum());
    }
    
    /** Test the setEmpNum method. */
    @Test
    void testSetEmpNum() {
        timesheet.setEmpNum("EMP0147");
        assertEquals("EMP0147", timesheet.getEmpNum());
    }
    
    /** Test the getEndWeek method. */
    @Test
    void testGetEndWeek() {
        LocalDate actualDate = timesheet.getEndWeek();
        LocalDate expected = LocalDate.of(2024, 04, 05);
        assertEquals(expected, actualDate);
    }
    
    /** Test the setEndWeek method. */
    @Test 
    void testSetEndWeek() {
       
        timesheet.setEndWeek(LocalDate.of(2024, 4, 12));
        LocalDate expected = LocalDate.of(2024, 4, 12);
        assertEquals(expected, timesheet.getEndWeek());
    }
    
    /** Test the setEndWeek method. */
    @Test 
    void testGetEndWeek1() {
        LocalDate date = LocalDate.of(2024, 4, 10);
        assertThrows(IllegalArgumentException.class, 
                () -> {timesheet.setEndWeek(date);});
    }
     
    /** Test the getDetails method. */
    @Test
    void testGetDetails() {
        TimesheetRow row1 = new TimesheetRow(1, "Comp1510", 
                3.0f, 4.5f, 5.5f, 6.0f, 7.0f, 9.5f, 10.0f);
        TimesheetRow row2 = new TimesheetRow(20, "Comp1510", 
                20.0f, 9.5f, 15.0f, 6.0f, 17.0f, 19.5f, 10.0f);
        timesheet.addRow(row1);
        timesheet.addRow(row2);
        assertEquals(2, timesheet.getDetails().size());
        assertTrue(timesheet.getDetails().contains(row1));
        assertTrue(timesheet.getDetails().contains(row2));
    }
    
    /** Test the addRow method. */
    @Test
    void testAddRow() {
        TimesheetRow row = new TimesheetRow(1510, "Assignment3", 
                2.0f, 5.0f, 10.0f, 4.5f, 6.5f, 15.0f, 7.0f);    
        timesheet.addRow(row);
        assertEquals(1, timesheet.getDetails().size());
        assertTrue(timesheet.getDetails().contains(row));
    }
    
    /** Test the toString method. */
    @Test
    void testToString() {
        TimesheetRow row = new TimesheetRow(1510, "Assignment3", 
                2.0f, 5.0f, 10.0f, 4.5f, 6.5f, 15.0f, 7.0f);    
        timesheet.addRow(row);
        String expected = "A01401943\n"
                + "2024-04-05\n"
                + " Project number: 1510\n"
                + "Work package: Assignment3\n"
                + "The hours spent on Saturday: 2.0\n"
                + "The hours spent on Sunday: 5.0\n"
                + "The hours spent on Monday: 10.0\n"
                + "The hours spent on Tuesday: 4.5\n"
                + "The hours spent on Wednesday: 6.5\n"
                + "The hours spent on Thursday: 15.0\n"
                + "The hours spent on Friday: 7.0\n\n";
        
                
        assertEquals(expected, timesheet.toString());
    }
} 

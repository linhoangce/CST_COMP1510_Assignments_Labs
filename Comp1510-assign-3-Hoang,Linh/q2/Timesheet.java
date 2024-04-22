package q2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a simple time sheet with rows storing working hours as long.
 *
 * @author Linh Hoang
 * @version 1.0
 */
public class Timesheet {

    /** The employee number. */
    private String empNum;
    
    /** End day of the week. */
    private LocalDate endWeek;
    
    /** List of TimeSheetRow objects. */
    private List<TimesheetRow> details;
    
    /** Constructs the object. */
    public Timesheet() {
        details = new ArrayList<>();
    }
    
    /** 
     * Constructs the object defined by two parameters. 
     * @param empNum as a String
     * @param endWeek as a LocalDate
     */
    public Timesheet(String empNum, LocalDate endWeek) {
        if (empNum.isEmpty()) {
            throw new IllegalArgumentException(
                    "Employee number must not be empty.");
        } else {
            this.empNum = empNum;
        }
        
        setEndWeek(endWeek);
        details = new ArrayList<>();
        
    }
    
    /**
     * Returns the employee number.
     * @return empNum as a String
     */
    public String getEmpNum() {
        return empNum;
    }
    
    /** 
     * Sets the employee number to a specified String.
     * @param str as a String
     */
    public void setEmpNum(String str) {
        empNum = str;
    }
    
    /** 
     * Returns the end day of the week.
     * @return endWeek as a FRIDAY;
     * @throw IllegalArgumentException if not a FRIDAY
     */
    public LocalDate getEndWeek() {
        return endWeek;
    }
    
    /**
     * Sets the last day of the Week to a Friday.
     * @param endWeek as a LocalDate
     * @throw IllegalArgumentException if not a Friday
     */
    public void setEndWeek(LocalDate endWeek) {
        if (endWeek.getDayOfWeek() != DayOfWeek.FRIDAY) {
            throw new IllegalArgumentException("End day must be a Friday.");
        } else {
            this.endWeek = endWeek;
        }
    }
    
    /**
     * Returns the time sheet rows.
     * @return details
     */
    public List<TimesheetRow> getDetails() {
        return details;
    }
    
    /**
     * Adds a time sheet row to the end of the time sheet.
     * @param row as a TimesheetRow
     */
    public void addRow(TimesheetRow row) {
        details.add(row);   
    }
    
    /** 
     * Returns a String representation of the time sheet.
     * @return result as a String
     */
    public String toString() {
        String result = empNum + "\n" + endWeek + "\n";

        for (TimesheetRow row: details) {
            result += " " + row;
        }

        return result + "\n";
    }   
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        final int year = 2024;
        final int month = 4;
        final int date = 5;
        final float five = 5.0f;
        final float ten = 10.0f;
        final float fourHalf = 4.5f;
        final float six = 6.0f;
        final float seven = 7.0f;
        LocalDate date1 = LocalDate.of(year, month, date);
        TimesheetRow row1 = new TimesheetRow(1, "Assignment3", 
                2.0f, five, ten, fourHalf, six, 1.0f, 2.0f);
      
        Timesheet timesheet = new Timesheet("A014019", date1);
        timesheet.addRow(row1);
        System.out.println(timesheet.toString());
        
        timesheet.addRow(new TimesheetRow(1, "Comp1510", 
                five, 1.0f, ten, six, seven, fourHalf, 2.0f));
        timesheet.addRow(new TimesheetRow(1, "Comp1510", 
                ten, six, six, seven, six - fourHalf, 2.0f, seven));
        System.out.println(timesheet.toString());
    } 
}

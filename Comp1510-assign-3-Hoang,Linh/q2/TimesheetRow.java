package q2;


/**
 * Represents a row in a time sheet.
 * 
 * @author Linh Hoang
 * @version 1.0
 */
public class TimesheetRow {
    
    /** 
     * Used to mask binary values for getting hours. 
     * */
    private static final long[] MASK = {0xFFL, 0xFF00L,
        0xFF0000L, 0xFF000000L, 0xFF00000000L, 
        0xFF0000000000L, 0xFF000000000000L};
    
    /** 
     * Used to mask binary values for setting hours. 
     * */
    private static final long[] UMASK =
        {0xFFFFFFFFFFFFFF00L,
         0xFFFFFFFFFFFF00FFL,
         0xFFFFFFFFFF00FFFFL,
         0xFFFFFFFF00FFFFFFL,
         0xFFFFFF00FFFFFFFFL,
         0xFFFF00FFFFFFFFFFL,
         0xFF00FFFFFFFFFFFFL};

    /** The project number. */
    private int project;
    
    /** The work package. */
    private String workPackage;
    
    /** The hours worked. */
    private long hours;
    
    /** 
     * Constructs the object defined by three parameters. 
     * @param num as an int
     * @param name as a String
     * @param hours as a variable length
     * */
    public TimesheetRow(int num, String name, float... hours) {
        project = num;
        workPackage = name;
        final int seven = 7;
        if (hours.length > seven) {
            throw new IllegalArgumentException(
                    "The number of hour inputs must be less"
                    + " than or equal to 7, corresponding to days of the week");
        } else {
            for (int i = 0; i < hours.length; i++) {
                setHours(i, hours[i]);
            }
        }
        
    }
    
    /**
     * Returns the project number. 
     * @return project as an int.
    */
    public int getProject() {
        return project;
    }
    
    /**
     * Sets the project number to a specified value.
     * @param value as an int
     */
    public void setProject(int value) {
        project = value;
    }
    
    /**
     * Returns the work package. 
     * @return workPackage as a String
     * */
    public String getWorkPackage() {
        return workPackage;
    }
    
    /**
     * Sets the work package to a specified String.
     * @param name as a String
     */
    public void setWorkPackage(String name) {
        workPackage = name;
    }
    
    /**
     * Returns the hours worked.
     * @param day as an int
     * @return hours as a float
     * @throw IllegalArgumentException if day is not from 0 to 6
     */
    public float getHours(int day) {
        final int six = 6;
        final int eight = 8;
        final float ten = 10.0f;
        if (day < 0 || day > six) {
            throw new IllegalArgumentException("The day is not valid. "
                    + "Day of the week must be between 0 (Sat) and 6 (Fri)");
        } else {
            long mask = MASK[0];
            long scaledHours = (hours >> (day * eight)) & mask;
            return scaledHours / ten;
        }
    }
    
    /** 
     * Sets the working hours of a day of the week to a specified value.
     * @param day as an int
     * @param hoursInput as a float
     * @throw IllegalArgumentException if day and hours are not in correct range
     */
    public void setHours(int day, float hoursInput) {
        final int six = 6;
        final int eight = 8;
        final int ten = 10;
        final float twentyFour = 24.0f;
        if (day < 0 || day > six) {
            throw new IllegalArgumentException("The day is not valid. "
                    + "Day of the week must be between 0 (Sat) and 6 (Fri)");
        }
        
        if (hours < 0.0f && hours > twentyFour) {
            throw new IllegalArgumentException("The hour value is not valid. "
                    + "Hours must be between 0.0 and 24.0");
        }
        
        long mask = UMASK[day];
        long scaledHours = (long) (hoursInput * ten);
        hours = (hours & mask);
        hours = hours | (scaledHours << (day * eight)); 
    }
    
    /**
     * Returns a String representation.
     * @return result as a String
     */
    public String toString() {
        final int seven = 7;
        String result = "Project number: " + project
                + "\nWork package: " + workPackage;
        
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", 
            "Wednesday", "Thursday", "Friday"};
        int count = 0;
        for (int i = 0; i < seven; i++) {
            
            result += "\nThe hours spent on " + days[count] + ": " 
                    + getHours(i);
            count++;
        }
        
        return result + "\n"; 

    }
    
    /**
     * Test TimesheetRow.
     * @param args unused
     */
    public static void main(String[] args) {
        final int ten = 10;
        final float tenf = 10.0f;
        final float twn = 20.0f;
        final float fifteen  = 15.0f;
        final float eight = 8.0f;
        final float three = 3.0f;
        TimesheetRow row = new TimesheetRow(ten, "Timesheet",  
            tenf, twn, fifteen, eight, three, 0.0f, 2.0f);
        System.out.println(row.toString()); 
    }
    
}

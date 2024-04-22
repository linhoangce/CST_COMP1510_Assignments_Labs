package ca.bcit.comp1510.lab08;

import java.util.Scanner;


/**
 * Represent a valid Gregorian date on or after 24 February 1582.
 * Modified to check for valid date, month, year inputs from users.
 * 
 * @author blink
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class Date {
    /** day of month.  1 .. max days in month */
    private int day;
    
    /** month of year.  1 .. 12 */
    private int month;
    
    /** year in Gregorian calendar.  1001 .. 2999 */
    private int year;
    
    /** 
     * Constructs the Date object defined by valid date, month, and year.
     * 
     * @param theDay as an int
     * @param theMonth as an int
     * @param theYear as an int
     * @throws IllegalArgumentException
     *      if the date is not valid
     */
    public Date(int theDay, int theMonth, int theYear) {
        // fill this code in and only store a valid date.  
        // throw exception if parameters are not a valid date
        if (isDateValid(theDay, theMonth, theYear)) {
            day = theDay;
            month = theMonth;
            year = theYear;
        } else {
            throw new IllegalArgumentException("The date is not valid.");
        }
        
    }
    
    /** 
     * Returns the date of Date.
     * @return day as an int
     */
    public int getDay() {
        return day;
    }
    
    /**
     * Returns the month of Date.
     * @return month as an int
     */
    public int getMonth() {
        return month;
    }
    
    /**
     * Returns the year of Date.
     * @return year as an int
     */
    public int getYear() {
        return year;
    }
    
    /** 
     * Returns a String representation of Date.
     * @return a String
     */
    public String toString() {
        return day + " " + month + " " + year;
    }
    
    /** 
     * Checks for valid month. 
     * @param m as an int
     * @return true if month is valid
     * */
    public static boolean isMonthValid(int m) {
        final int twelve = 12;
        
        return (m >= 1 && m <= twelve);
        
    }
    
    /**
     * Checks for a valid year.
     * @param year as an int
     * @return true if year is valid
     */
    public static boolean isYearValid(int year) {
        final int yearBegin = 1001;
        final int yearEnd = 2999;
       
        return (year >= yearBegin && year <= yearEnd);
    }
    
    /**
     * Check for a leap year.
     * @param year as an int
     * @return true if a leap year
     */
    public static boolean isLeapYear(int year) {
        final int hundred = 100;
        final int fourHundred = 400;
        final int four = 4;
        return ((year % fourHundred == 0) 
                || (year % four == 0 && year % hundred != 0));
    }
    
    /**
     * Returns the number of days in a month.
     * @param month as an int
     * @param isLeapYear as a boolean
     * @return number of days 
     */
    public static int daysInMonth(int month, boolean isLeapYear) {
        
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
        final int seven = 7;
        final int eight = 8;
        final int nine = 9;
        final int ten = 10;
        final int eleven = 11;
        final int twelve = 12;
        final int twentyEight = 28;
        final int twentyNine = 29;
        final int thirty = 30;
        final int thirtyOne = 31;
        
        switch (month) {
            case 1:
                return thirtyOne;
            case 2: 
                if (isLeapYear) {
                    return twentyNine;
                }   else {
                    return twentyEight;
                }
            case three: 
                return thirtyOne;
            case four: 
                return thirty;
            case five: 
                return thirtyOne;
            case six: 
                return thirty;
            case seven: 
                return thirtyOne;
            case eight: 
                return thirtyOne;
            case nine:
                return thirty;
            case ten: 
                return thirtyOne;
            case eleven:
                return thirty;
            case twelve: 
                return thirtyOne;
            default:
                return 0;
        }
    }
        
    /**
     * Checks for valid date.
     * @param day as an int
     * @param month as an int
     * @param year as an int
     * @return true if date is after Feb 24 1582 and 2999
     */
    public static boolean isDateValid(int day, int month, int year) {
        
        final int yearBegin = 1582;
        final int yearEnd = 2999;
        final int twentyFour = 24;
        final int twentyEight = 28;
        final int twentyNine = 29;
        final int thirty = 30;
        final int thirtyOne = 31;
        final int jan = 1;
        final int feb = 2;
        final int mar = 3;
        final int apr = 4; 
        final int may = 5;
        final int jun = 6;
        final int jul = 7;
        final int aug = 8;
        final int sep = 9;
        final int oct = 10;
        final int nov = 11;
        final int dec = 12;
        
        if (year == yearBegin) {
            if (month == 2 && day >= twentyFour && day <= twentyEight) {
                return true;
            } else if ((month == mar || month == may || month == jul 
                    || month == aug || month == oct || month == dec) 
                    && (day >= 1 && day <= thirtyOne)) {
                return true;
            } else { 
                return (month == apr || month == jun || month == sep 
                        || month == nov) && day >= 1 && day <= thirty;
            }
        } else if (year > yearBegin && year <= yearEnd) { 
            if ((month == jan || month == mar || month == may || month == jul 
                    || month == aug || month == oct || month == dec) 
                    && (day >= 1 && day <= thirtyOne)) {
                return true;
            } else if ((month == apr || month == jun || month == sep 
                        || month == nov) && day >= 1 && day <= thirty) {
                return true;
            } else if (isLeapYear(year) && month == feb && day >= 1 
                    && day <= twentyNine) {
                return true;
            } else {
                return month == feb && day >= 1 && day <= twentyEight;
            }
        }
        
        return false;
            
    }
    

    /** 
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) { 
        
        //date read in from user
        int month;
        int day;
        int year;
        
        //true if parts of input from user is valid
        boolean monthValid;
        boolean yearValid;
        boolean dayValid;  
        //number of days in month read in
        int daysInMonth;
        //true if user's year is a leap year
        boolean leapYear;
        
        Scanner scan = new Scanner(System.in);
        //Get integer month, day, and year from user
        //Use the methods to check to see if month is valid
        //Use the methods to check to see if year is valid
        //Use the methods to determine whether it's a leap year
        //Use the methods to determine number of days in month
        //Use the methods to see if day is valid
        //Use the methods to determine whether date is valid
        //   and print appropriate message
        //Create a Date object with month, day, year
        System.out.print("Enter the date, month, and year in order: ");
        day = scan.nextInt();
        month = scan.nextInt();
        year = scan.nextInt();
        
        yearValid = isYearValid(year);
        leapYear = isLeapYear(year);  
        monthValid = isMonthValid(month);

        daysInMonth = daysInMonth(month, isLeapYear(year));
      
        if (isDateValid(day, month, year)) {
            System.out.println("Date is valid.");
            if (isLeapYear(year)) {
                System.out.println(year + " is leap year.");
            } else {
                System.out.println(year + " is not a leap year");
            }
            System.out.println("Days in month: " + daysInMonth);   
        } else {
            System.out.println("Date is not valid.");
        }
        
        Date date = new Date(day, month, year);
        System.out.println("The date is: " + date.toString());
        scan.close();
        
        // The Date constructor can replace 5 statements that check for 
        // a valid date.
    }
} 

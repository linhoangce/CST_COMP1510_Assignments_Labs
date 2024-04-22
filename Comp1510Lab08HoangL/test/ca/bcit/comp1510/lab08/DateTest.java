package ca.bcit.comp1510.lab08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

    
    /**
     * Create a new Date object before each test is executed.
     * @throw Exception
     *                if a Date object cannot be constructed
     */
    
    /** Test the Date constructor. */
    @Test
    void testDate1() {
        Date date = new Date (24, 2, 1582);
        assertEquals (24, date.getDay());
        assertEquals (2, date.getMonth());
        assertEquals (1582, date.getYear());
        assertThrows(IllegalArgumentException.class, () -> {
            new Date(23, 2, 1582);
        });
    }
    
    /** Test the Date constructor. */
//    @Test
//    void testDate2() {
//        int expectedDate;
//        int expectedMonth;
//        int expectedYear;
//        
//        for (int year = 1583; year <= 2999; year ++) {
//            for (int month = 1; month <= 12; month++) {
//                for (int day = 1; day <= 31; day++) {
//                    Date date = new Date (day, month, year);
//                    expectedDate = day;
//                    expectedMonth = month;
//                    expectedYear = year;
//                    assertEquals(expectedDate, date.getDay());
//                    assertEquals(expectedMonth, date.getMonth());
//                    assertEquals(expectedYear, date.getYear());
//                }
//            }
//        }
//    }
    
    /** Test the Date constructor. */
    @Test
    void testDate3 () {
        for (int day = 24; day <= 28; day++) {
            boolean validDate = Date.isDateValid (day, 2, 1582);
            assertTrue (validDate);
        }
    }
    
    
    /** Test the Date constructor. */
    @Test
    void testDate4 () {
        assertThrows (IllegalArgumentException.class, () -> {
            new Date (0, 02, 1600);
        });
    }
    
    /** Test the Date constructor. */
    @Test
    void testDate5 () {
        assertThrows (IllegalArgumentException.class, () -> {
            new Date (15, 13, 2023);
        });
    }
    
    /** Test the Date constructor. */
    @Test
    void testDate6 () {
        assertThrows (IllegalArgumentException.class, () -> {
            new Date (1, 1, 3000);
        });
    }
    
    /** Test toString method. */
    @Test
    void testToString() {
        Date date = new Date(24, 2, 1582);
        assertEquals("24 2 1582", date.toString());
    }
    

    /** Test isMonthValid method. */
    @Test
    void testIsMonthValid1() {
        boolean validMonth = Date.isMonthValid(1);
        assertTrue(validMonth);
    }
    
    /** Test isMonthValid method. */
    @Test void testIsMonthValid2 () {
        boolean validMonth = Date.isMonthValid(12);
        assertTrue (validMonth);
    }
    
    /** Test isMonthValid method. */
    @Test
    void testIsMonthValid3 () {
        boolean invalidMonth = Date.isMonthValid(13);
        assertFalse(invalidMonth);
    }
    
    /** Test isMonthValid method. */
    @Test void testIsMonthValid4 () {
        boolean invalidMonth = Date.isMonthValid (0);
        assertFalse (invalidMonth);
    }
    
    /** Test isYearValid method. */
    @Test
    void testIsYearValid1() {
        boolean invalidYear = Date.isYearValid (1000);
        assertFalse (invalidYear);
    }
    
    /** Test isYearValid method. */
    @Test
    void testIsYearValid2 () {
        boolean invalidYear = Date.isYearValid (3000);
        assertFalse (invalidYear);
    }
    
    /** Test isYearValid method. */
    @Test
    void testIsYearValid3 () {
        boolean validYear = Date.isYearValid(1582);
        assertTrue (validYear);
    }

    /** Test isYeaValid method. */
    @Test
    void testIsYearValid4 () {
        boolean validYear = Date.isYearValid(2999);
        assertTrue (validYear);
    }
    
    /** Test isLeapYear method. */
    @Test
    void testIsLeapYear1() {
        boolean leapYear = Date.isLeapYear (1600);
        assertTrue (leapYear);
    }
    
    /** Test isLeapYear method. */
    @Test
    void testIsLeapYear2 () {
        boolean leapYear = Date.isLeapYear (1584);
        assertTrue (leapYear);
    }
    
    /** Test isLeapYear method. */
    @Test
    void testIsLeapYear3 () {
        boolean notLeapYear = Date.isLeapYear (1700);
        assertFalse (notLeapYear);
    }
    
    /** Test isLeapYear method. */
    @Test
    void testIsLeapYear4 () {
        boolean notLeapYear = Date.isLeapYear (2023);
        assertFalse (notLeapYear);
    }
    
    /** Test daysInMonth method. */
    @Test
    void testDaysInMonth1 () {
        boolean leapYear = Date.isLeapYear (1700);
        int days = Date.daysInMonth (2, leapYear);
        assertEquals (28, days);
    }
    
    /** Test daysInMonth method. */
    @Test
    void testDaysInMonth2 () {
        boolean leapYear = Date.isLeapYear (1600);
        int days = Date.daysInMonth (2, leapYear);
        assertEquals (29, days);
    }

    /** Test daysInMonth method. */
    @Test
    void testDaysInMonth3 () {
        boolean leapYear = Date.isLeapYear (1600);
        int days = Date.daysInMonth (4, leapYear);
        assertEquals (30, days);
    }
    
    /** Test daysInMonth method. */
    @Test
    void testDaysInMonth4 () {
        boolean leapYear = Date.isLeapYear (2023);
        int days = Date.daysInMonth (12, leapYear);
        assertEquals (31, days);
    }
    
    /** Test daysInMonth method. */
    @Test
    void testDaysInMonth5 () {
        boolean leapYear = Date.isLeapYear (1584);
        int days = Date.daysInMonth (13, leapYear);
        assertEquals (0, days);
    }
    
    /** Test daysInMonth method. */
    @Test 
    void testDaysInMonth () {
        
        for (int year = 1583; year <= 2999; year ++) {
            for (int month = 1; month <= 12; month++) {
                boolean leapYear = Date.isLeapYear (year);
                int days = Date.daysInMonth (month, leapYear);
                
                switch (month) {
                case 1:
                    assertEquals(31, days);
                    break;
                case 2: 
                    if (leapYear) {
                        assertEquals (29, days);
                    } else {
                        assertEquals (28, days);
                    }
                    break;
                case 3: 
                    assertEquals (31, days);
                    break;
                case 4: 
                    assertEquals (30, days);
                    break;
                case 5: 
                    assertEquals (31, days);
                    break;
                case 6: 
                    assertEquals (30, days);
                    break;
                case 7: 
                    assertEquals (31, days);
                    break;
                case 8: 
                    assertEquals (31, days);
                    break;
                case 9:
                    assertEquals (30, days);
                    break;
                case 10: 
                    assertEquals (31, days);
                    break;
                case 11:
                    assertEquals (30, days);
                    break;
                default:
                    assertEquals (31, days);
                    break;
                }
                
            }
        }

    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid1 () {
        boolean invalidDate = Date.isDateValid (23, 2, 1582);
        assertFalse(invalidDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid2 () {
        boolean invalidDate = Date.isDateValid (29, 2, 1582);
        assertFalse (invalidDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid3 () {
        boolean validDate = Date.isDateValid (24, 2, 1582);
        assertTrue (validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid4 () {
        boolean invalidDate = Date.isDateValid (0, 3, 1582);
        assertFalse (invalidDate);
    }

    /** Test isDateValid method. */
    @Test
    void testIsDateValid5 () {
        boolean invalidDate = Date.isDateValid (33, 12, 1582);
        assertFalse (invalidDate);
    }
    /** Test isDateValid method. */
    @Test
    void testIsDateValid6 () {
        boolean validDate = Date.isDateValid (15, 7, 1582);
        assertTrue (validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid7 () {
        boolean invalidDate = Date.isDateValid (10, 13, 1582);
        assertFalse (invalidDate);
    }

    /** Test isDateValid method. */
    @Test
    void testIsDateValid8 () {
        boolean invalidDate = Date.isDateValid (10, 0, 1582);
        assertFalse (invalidDate);
    }

    /** Test isDateValid method. */
    @Test
    void testIsDateValid9 () {
        boolean validDate = Date.isDateValid (31, 12, 1582);
        assertTrue (validDate);
    }
    
    /** Test isDateValid method. */
    @Test void testIsDateValid10 () {
        boolean invalidDate = Date.isDateValid (1, 1, 3000);
        assertFalse (invalidDate);
    }
    
    /** Test isDateValid method. */
    @Test 
    void testIsDateValid11 () {
        boolean invalidDate = Date.isDateValid (24, 2, 1581);
        assertFalse (invalidDate);
    }
    
    /** Test isDateValid method. */
    @Test 
    void testIsDateValid12 () {
        boolean invalidDate = Date.isDateValid (24, 0, 1583);
        assertFalse (invalidDate);
    }
    
    /** Test isDateValid method. */
    @Test 
    void testIsDateValid13 () {
        boolean invalidDate = Date.isDateValid (32, 2, 2000);
        assertFalse (invalidDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid14() {
        boolean validDate = Date.isDateValid (3, 8, 1582);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid15() {
        boolean validDate = Date.isDateValid (31, 5, 1582);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid16() {
        boolean validDate = Date.isDateValid (10, 7, 1582);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid17() {
        boolean validDate = Date.isDateValid (25, 10, 1582);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid18() {
        boolean validDate = Date.isDateValid (5, 12, 1582);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid19() {
        boolean validDate = Date.isDateValid (1, 4, 1582);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid20() {
        boolean validDate = Date.isDateValid (10, 6, 1582);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid21() {
        boolean validDate = Date.isDateValid (25, 9, 1582);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid22() {
        boolean validDate = Date.isDateValid (30, 11, 1582);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid23() {
        boolean invalidDate = Date.isDateValid (31, 11, 1582);
        assertFalse(invalidDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid24() {
        boolean invalidDate = Date.isDateValid (0, 11, 1582);
        assertFalse(invalidDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid26() {
        boolean invalidDate = Date.isDateValid (0, 1, 1583);
        assertFalse(invalidDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid27() {
        boolean invalidDate = Date.isDateValid (32, 12, 1583);
        assertFalse(invalidDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid25() {
        boolean validDate = Date.isDateValid (31, 1, 1583);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid33() {
        boolean validDate = Date.isDateValid (31, 3, 1583);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid28() {
        boolean validDate = Date.isDateValid (10, 5, 1583);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid29() {
        boolean validDate = Date.isDateValid (15, 7, 1583);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid30() {
        boolean validDate = Date.isDateValid (20, 8, 1583);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid31() {
        boolean validDate = Date.isDateValid (20, 10, 1583);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid32() {
        boolean validDate = Date.isDateValid (31, 12, 1583);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid34() {
        boolean validDate = Date.isDateValid (1, 4, 1583);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid35() {
        boolean validDate = Date.isDateValid (10, 6, 1583);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid36() {
        boolean validDate = Date.isDateValid (14, 9, 1583);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid37() {
        boolean validDate = Date.isDateValid (30, 11, 1583);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid38() {
        boolean invalidDate = Date.isDateValid (31, 11, 1583);
        assertFalse(invalidDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid39() {
        boolean invalidDate = Date.isDateValid (0, 4, 1583);
        assertFalse(invalidDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid40() {
        boolean invalidDate = Date.isDateValid (0, 2, 1583);
        assertFalse(invalidDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid41() {
        boolean invalidDate = Date.isDateValid (29, 2, 1583);
        assertFalse(invalidDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid45() {
        boolean validDate = Date.isDateValid (28, 2, 1583);
        assertTrue(validDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid42() {
        boolean validDate = Date.isDateValid (29, 2, 1600);
        assertTrue(validDate);
    }
    
//    /** Test isDateValid method. */
//    @Test
//    void testIsDateValid46() {
//        boolean validDate = Date.isDateValid (1, 2, 1600);
//        assertTrue(validDate);
//    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid47() {
        boolean invalidDate = Date.isDateValid (0, 2, 1584);
        assertFalse(invalidDate);
    }
    
    /** Test isDateValid method. */
    @Test
    void testIsDateValid48() {
        boolean invalidDate = Date.isDateValid (0, 0, 1600);
        assertFalse(invalidDate);
    }
}

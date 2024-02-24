package ca.bcit.comp1510.lab06;

import java.util.Random;

/**
 *  * Class Mathematics represents a Math class to satisfy a JUnit test.
 *  
 *  @author Linh Hoang
 *  @version 2024 2.0
 */
public class Mathematics2 {

    /** 1 foot = 0.0003048 km. */
    public static final double FOOT_TO_KILOMETRE_RATIO = 0.0003048;

    /**
    * Returns the area of the square with the specified edge length.
    *
    * @param d edgeLength of the square.
    * @return area as a double
    */
    public double getSquareArea(double d) {
        double area = d * d;
        
        return area;
    }
    
    /**
    * Returns the sum of the specified values.
    *
    * @param first first operand
    * @param second second operand
    * @return sum sum of the operands
    */
    public double add(double first, double second) {
        double sum = first + second;
        
        return sum;
    }

    /**
    * Returns the product of the specified values.
    *
    * @param first first operand
    * @param second second operand
    * @return result product of the operands
    */
    public double multiply(double first, double second) {
        double result = first * second;
        
        return result;
    }
    
    /**
    * Returns the difference of the specified values.
    *
    * @param first first operand
    * @param second second operand
    * @return result difference of the operands
    */
    public double subtract(double first, double second) {
        double result = first - second;
        
        return result;
    }

    /**
    * Returns the quotient of the specified values. If the divisor is zero,
    * returns zero instead of NaN or infinity.
    *
    * @param first first operand
    * @param second second operand
    * @return result quotient of the operands
    */
    public double divide(int first, int second) {
        double result;
        if (second == 0) {
            return 0;
        } else {
            result = first / second;
        }
        return result;
    }
    /**
    * Returns the absolute value of the specified integer.
    *
    * @param i number to test
    * @return result absolute value of number
    */

    public int absoluteValue(int i) {
        return Math.abs(i);
    }

    /**
    * Returns a random number between 10 and 20 inclusive,
    * but NOT 15.
    * @return result random number in range [10, 20] excluding 15.
    */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        
        final int ten = 10;
        final int eleven = 11;
        final int fifteen = 15;
     
        Random generator = new Random();
        
        int random = generator.nextInt(eleven) + ten;
        
        while (random == fifteen) {
            random = generator.nextInt(eleven) + ten;
        }
        return random;
    }
    
    /**
    * Converts the specified number of feet to kilometres.
    * @param ft feet to convert
    * @return result kilometres in the specified number of feet
    */
    public double convertFeetToKilometres(double ft) {
        double result = FOOT_TO_KILOMETRE_RATIO * ft;
        
        return result;
    }

    /**
    * Returns the sum of the numbers between zero and the
    * first parameter that are divisible by the second
    * number. For example, sumOfProducts(10, 3) will return
    * 3 + 6 + 9 = 18, and sumOfProducts(10, 2) will return
    * 2 + 4 + 6 + 8 + 10 = 30 and sumOfProducts(-10, 2) will
    * return -2 + -4 + -6 + -8 + -10 = -30.
    * @param bound the upper bound
    * @param divisor the divisor
    * @return sum
    */
    public int sumOfProducts(int bound, int divisor) {
        int sum = 0;
        
        int timesDivisor;
        
        if (bound > 0) {
            int count = 1;
            while (count * divisor <= bound) {
                timesDivisor = divisor * count;
                sum += timesDivisor;
                count++;
            }
        } else {
            int count = -1;
            while (count * divisor >= bound) {
                timesDivisor = divisor * count;
                sum += timesDivisor;
                count--;
            }
        }
        return sum;
    }

}

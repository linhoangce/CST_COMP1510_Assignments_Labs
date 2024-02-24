package ca.bcit.comp1510.lab05;

/**
 * Class Mathematics represents a Math class to satisfy a JUnit test.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class Mathematics {

    /** PI value. */
    public static final double PI = 3.14159265359;

    /**
    * Returns the area of the circle with the specified radius.
    *
    * @param d radius of the circle.
    * @return area as a double
    */
    public double getCircleArea(double d) {
        double area = PI * d * d;
        return area;
    }

    /**
    * Returns the sum of the positive integers between 0 and the specified
    * number inclusive. If the specified number is negative, returns zero.
    *
    * @param i number upper bound
    * @return sum as an integer
    */
    public int sumOfInts(int i) {
        if (i >= 0) {
            int count = 0;
            int sum = 0;
            while (count <= i) {
                sum = sum + count;
                count++;
            }
            return sum;
        } else {
            return 0;
        }
    }

    /**
    * Returns true if the specified value is positive, else false.
    *
    * @param i number to test
    * @return true if number is positive, else false.
    */
    public boolean isPositive(int i) {
        return i > 0;
    }
    
    /**
    * Returns true if the specified value is even, else false.
    *
    * @param i number to test
    * @return true if number is even, else false.
    */
    public boolean isEven(int i) {
        if (i == 0) {
            return true;
        } else if (Math.abs(i) > 1)  {
            return i % 2 == 0;
        } else {
            return false;
        }
    }

    /**
    * Returns sum of the even numbers between 0 and the specified value,
    * inclusive. The value can be positive, negative, or zero.
    *
    * @param i number upper bound
    * @return sum of the even numbers between 0 and number
    */
    public int sumOfEvens(int i) {
        int sum = 0;
        int count = 0;
        if (i < 0) {
            while (count >= i) {
                sum += count;
                count -= 2;
            }
        } else {
            while (count <= i) {
                sum += count;
                count += 2;
            }
        }
        return sum;
    }

}

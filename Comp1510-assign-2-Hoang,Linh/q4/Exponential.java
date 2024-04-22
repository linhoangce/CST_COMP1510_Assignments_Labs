package q4;

/**
 * Represent the exponential function, e^x.
 *
 * @author Linh Hoang
 * @version 1.0
 */
public class Exponential {
        
    /**
     * Calls the exp() method using a for loop and prints the results.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        final double begin = -10.0;
        final double end = 10.0;
        double e;
        
        System.out.println(" x \t\t\te^x");
        System.out.println("-------------------------------------");
        for (double i = begin; i <= end; i++) {
            e = exp(i);
            System.out.println(" " + i + "\t\t" + e);
        }
    }
    
    /**
     * Calculate the next terms from the previous term.
     * @param x as a double
     * @return result as double
     */
    public static double exp(double x) {
        
        final double limit = 45;
        double k = 1.0;
        double term = 1.0;
        double result = 1.0;
        double denominator = 1.0;
        
        while (k <= limit) {
            if (x > 0) {
                term *= x / k;
                result += term;
                k++;
            } else {
                term *= Math.abs(x) / k;
                denominator += term;
                result = 1 / denominator;
                k++;
            }
        }
        
        return result;
    }
}


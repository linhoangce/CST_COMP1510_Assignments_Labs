package q2;

import java.util.Scanner;

/**
 * Class Sqrt asks users to enter a double value and calculates an 
 * approximation to the square root, using Newton algorithm, and prints the 
 * first 10 estimates to standard output.
 *
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class Sqrt {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your number:");
        double a = scan.nextDouble();
        
        double s = (a + 1) / 2;
        System.out.println("The first estimate: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("The second estimate: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("The third estimate: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("The fourth estimate: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("The fifth estimate: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("The sixth estimate: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("The seventh estimate: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("The eighth estimate: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("The nineth estimate: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("The tenth estimate: " + s);
        
        scan.close();
        
    }

}

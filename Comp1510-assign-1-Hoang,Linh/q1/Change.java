package q1;

import java.util.Scanner;
/**
 * Class Change asks users to enter a double value for the amount of money
 * they have and prints out the fewest numbers of each bill and coins needed 
 * to represent that amount, starting with the highest (assuming that a ten-
 * dollar bill is the maximum size needed, and that pennies exist).
 *
 * @author Linh Hoang
 * @version 2024 1.0
 */

public class Change {
    
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        final int thousand = 1000;
        final int hundred = 100;
        final int twentyFive = 25;
        final int ten = 10;
        final int five = 5;  
        
        // This is used to offset the floating point errors 
        final double offset = 0.0001;
        
                 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the amount of money you have: ");
        double cashAmount = scan.nextDouble();
       
        // Convert to integer pennies
        int intPennies = (int) ((cashAmount + offset) * hundred);
            
        System.out.println();
        System.out.println("You entered: " + cashAmount + " dollars, "
                + "and that is comprised of: ");
                
        int numOf10Dollars = intPennies / thousand;
        System.out.println(numOf10Dollars + " ten dollar bills");
        
        // Store the remaining amount of pennies after each calculation
        intPennies  = intPennies % thousand;
        int numOf5Dollars = intPennies / (five * hundred);
        System.out.println(numOf5Dollars + " five dollar bills");
        
        intPennies = intPennies % (five * hundred);
        int numOfToonies = intPennies / (2 * hundred);
        System.out.println(numOfToonies + " toonies");
        
        intPennies = intPennies % (2 * hundred);
        int numOfLoonies = intPennies / hundred;
        System.out.println(numOfLoonies + " loonies");
        
        intPennies = intPennies % hundred;
        int numOfQuarters = intPennies / twentyFive;
        System.out.println(numOfQuarters + " quarters");
        
        intPennies =  intPennies % twentyFive;
        int numOfDimes = intPennies / ten;
        System.out.println(numOfDimes + " dimes");
        
        intPennies = intPennies % ten;
        int numOfNickels = intPennies / five;
        System.out.println(numOfNickels + " nickels");

        int numOfPennies = intPennies % five;
        System.out.println(numOfPennies + " pennies");
        
        scan.close();
        
    }

}

package ca.bcit.comp1510.lab4;

import java.util.Scanner;

/**
 * Class IntegerWrapper asks users to enter integer values and performs 
 * different functions from class Integer.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class IntegerWrapper {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter an integer number in base 10: ");
        int integer = scan.nextInt();
        
        System.out.println("Binary represention of " + integer + " is: " 
                + Integer.toBinaryString(integer));
        System.out.println("Octal representation of " + integer + " is: "
                + Integer.toOctalString(integer));
        System.out.println("Hexamdecimal representation of " + integer 
                + " is: " + Integer.toHexString(integer).toUpperCase());
        
        System.out.println();
        System.out.println("The maximum value that Java integer can have is: "
                + Integer.MAX_VALUE);
        System.out.println("The minimum value that Java integer an have is: "
                + Integer.MIN_VALUE);
        
        System.out.println();
        System.out.println("Now please enter two integer numbers, "
                + "one per line:");
        String intString = scan.next();
        int firstInt = Integer.parseInt(intString);
        int secondInt = Integer.parseInt(scan.next());
        System.out.println("The sum of the two integers is: " 
                + (firstInt + secondInt));
        
        scan.close();
    }

}

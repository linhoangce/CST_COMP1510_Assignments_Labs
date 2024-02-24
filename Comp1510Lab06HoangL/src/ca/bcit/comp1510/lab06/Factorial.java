package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * Class Factorial asks users to enter a value and checks two conditions:
 * value is a number and is positive.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class Factorial {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int factorial = 1;
        int n;
        
        System.out.println("Please enter a value for n!: ");
        
        n = readInt(scan);
        System.out.println();
        System.out.println("You entered: " + n + "\n");
        System.out.print(n + "! = ");
        
        while (n > 0) {
            factorial *= n;
            n--;
        }
        System.out.println(factorial);
        
        scan.close();
    }      
    
    static int readInt(Scanner scan) {
        int input = 0;
        boolean done = true;
        while (done) {
            while (!scan.hasNextInt()) {
                System.out.println("Wrong value! Enter a number:");
                scan.next();
            }
            input = scan.nextInt();
            if (input < 0) {
                System.out.println("Positive integer is required. "
                        + "Please enter another number: ");
            } else {
                done = false;
            }
        }
        return input;
    }

}

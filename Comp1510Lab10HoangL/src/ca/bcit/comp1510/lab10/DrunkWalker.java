package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * Represents a drunk walker that takes users' inputs, and counts the number 
 * of falls.
 * 
 * @author Linh Hoang
 * @version 2024
 */
public class DrunkWalker {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        int countFalls = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the number of steps:");
        int numSteps = scan.nextInt();
        System.out.println("Please enter the boundary:");
        int boundary = scan.nextInt();
        System.out.println("Please enter the number of drunks to run:");
        int drunks = scan.nextInt();
        
        for (int i = 0; i < drunks; i++) {
            RandomWalker drunk = new RandomWalker(numSteps, boundary);
            drunk.walk();
            if (!drunk.inBounds() && drunk.moreSteps()) {
                countFalls++;
                System.out.println("\nRound " + i);
                System.out.println("Drunk falls!\n" + drunk.toString() + "\n");
            }
        }
        
        System.out.println("The total number of tests: " + drunks);
        System.out.println("The number of falls: " + countFalls);
        
        scan.close();
    } 
}

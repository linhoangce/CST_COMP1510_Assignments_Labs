package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * Tests the RandomWalker class.
 * 
 * @author Linh Hoang
 * @version 2024
 */
public class TestWalker {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        final int ten = 10;
        final int five = 5;
        final int twoHundred = 200;
        
        RandomWalker walker = new RandomWalker(ten, five);
        
        System.out.println("Please enter the maximum steps and boundary:");
        int steps = scan.nextInt();
        int boundary = scan.nextInt();
        
        RandomWalker userWalker = new RandomWalker(steps, boundary);
        
        System.out.println("\nDefault walker: " + walker.toString());
        System.out.println("\nYour walker: " + userWalker.toString());

        for (int i = 0; i < five; i++) {
            walker.takeStep();
            userWalker.takeStep();
            
            System.out.println("\nDefault walker\n" + walker.toString());
            System.out.println("\nYour walker\n" + userWalker.toString() 
                + "\n");
        }
        
        System.out.println("Third Trial\n------------------------------------");
        RandomWalker randomWalker = new RandomWalker(twoHundred, ten);
        System.out.println("Initial state: " + randomWalker.toString());
        randomWalker.walk();
        System.out.println("Result: " + randomWalker);
        System.out.println("Max distance: " 
                + randomWalker.getMaximumDistance() + "\n");
        
        System.out.println("Fourth Trial\n----------------------------------");
        RandomWalker randomWalker1 = new RandomWalker(twoHundred, ten);
        
        while (randomWalker1.inBounds() && randomWalker1.moreSteps()) {
            randomWalker1.takeStep();
            System.out.println(randomWalker1.toString());
            System.out.println("Maximum distance: " 
                    + randomWalker1.getMaximumDistance());
        }
        
        scan.close(); 
    }

}
 

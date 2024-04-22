/**
 * 
 */
package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * The program asks user to input values for length, width, height, 
 * and the number of coat, then it calculates the area that needs to be
 * painted and the number of cans of paint needed.
 * 
 * @authot Linh Hoang
 * @version 2024 1.0
 **/
public class Paint {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        
        final int COVERAGE = 400;
        double length;
        double width;
        double height;
        double surfaceArea;     // the total area of the room 
        int coats;
        double coverageNeeded;
        double cansOfPaintNeeded;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the length of the room in feet: ");
        length = scan.nextDouble();
        System.out.println("Please enter the width of the room in feet: ");
        width = scan.nextDouble();
        System.out.println("Please eneter the height of the room in feet: ");
        height = scan.nextDouble();
        System.out.println("Please enter the number of coats you are using: ");
        coats = scan.nextInt();
        
        // Calculates the total surface area of the room.
        surfaceArea = (length*width) + (length*height)*2 + (width*height)*2;
        System.out.println("The total surface area to be painted in "
                + "square feet is " + surfaceArea);
        
        coverageNeeded = surfaceArea * coats;
        cansOfPaintNeeded = coverageNeeded / COVERAGE;
        
        System.out.println();
        System.out.println("If one 4 litre can of paint can cover 400 square "
                + "feet, then a room with a total square feet of "  
                + surfaceArea + " and " + coats + " layers of coats needs " 
                + ((int) cansOfPaintNeeded+1) + " cans.");
    }

}

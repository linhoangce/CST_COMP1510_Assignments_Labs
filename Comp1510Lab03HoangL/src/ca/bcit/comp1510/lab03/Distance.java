package ca.bcit.comp1510.lab03;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Class Distance takes user's inputs for x-coordinates and y-coordinates 
 * of two points on a plane and calculates the distance between them. 
 * DecimalFormat is used to format the result to "#.##".
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class Distance {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        
        System.out.println("Please enter values for x-coordinate and "
                + "and y-coodinate of the first point separated by "
                + "a white space:");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        
        System.out.println("Please enter values for x-coordinate and "
                + "and y-coodinate of the second point separated by "
                + "a white space:");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        
        double totalSquare = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        double distance = Math.sqrt(totalSquare);
        System.out.println("The distance between the two points is: " 
                + distance);
        
        System.out.println("The number formatted to \"#.##\" is: " 
                + formatter.format(distance));
        System.out.println();
        System.out.println("The program can also calculate distance of all"
                + " points on 4 quadrants. Check with two negative values.");
        
        scan.close();
        
    }

}

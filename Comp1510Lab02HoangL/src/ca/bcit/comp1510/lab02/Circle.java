/**
 * 
 */
package ca.bcit.comp1510.lab02;

import java.util.Scanner;
/**
 * The program asks the user to enter a value, then calculates 
 * and prints the results for the circumference and area of the circle 
 * with such radius value to standard output.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 * 
 */
public class Circle {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        
        final double PI = 3.14159;  
        double radius;
        double circumference;
        double area;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Please enter a value for the circile radius: ");
        radius = myScanner.nextDouble();
        
        circumference = 2 * PI * radius;
        
        System.out.println();
        System.out.println("The circumference of the circle with a radius of "
                + radius + " is " + circumference);
        
        area = PI * radius * radius;
        System.out.println();
        System.out.println("The area of the circle with a radius of "
                + radius + " is " + area);
        
        //-----------------------------------------------------
        // 10a. doubleRadius stores double the value stored in radius
        double doubleRadius = radius * 2;
        System.out.println();
        System.out.println("The double value of radius is " + doubleRadius);
        
        //10b. 
        double doubleCirc = 2 * doubleRadius * PI;
        System.out.println();
        System.out.println("The circumference with double radius is " 
                + doubleCirc);
        double doubleArea = PI * doubleRadius * doubleRadius;
        System.out.println("The area with double radius is " + doubleArea);
        
        //10c.
        System.out.println();
        System.out.println("When the radius is doubled from " + radius 
                + " to " + doubleRadius + ":");
        System.out.println("\t The circumference becomes " 
                + doubleCirc/circumference + " times larger;");
        System.out.println("\t And the area becomes " + doubleArea/area 
                + " times larger.");
        
        myScanner.close();
    }

} 

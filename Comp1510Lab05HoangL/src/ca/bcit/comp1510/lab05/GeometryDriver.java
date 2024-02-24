package ca.bcit.comp1510.lab05;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Class GeometryDriver creates objects from Sphere, Cube, and Cone, and 
 * drives the calculations for them.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class GeometryDriver {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.###");
        
        System.out.println("Please enter a value per line in order for "
                + "the sphere's x-coordinate, y-coodinate, z-coordinate"
                + " and radius:");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        double radius = scan.nextDouble();

        
        // Constructs the sphere object
        Sphere sphere = new Sphere(x, y, z, radius);
        System.out.println("The surface area: " 
                + fmt.format(sphere.surfaceArea()));
        System.out.println("The volume: " 
                + fmt.format(sphere.volume()));
        
        System.out.println("Please enter a value per line in order for "
                + "the cube's x-coordinate, y-coodinate, z-coordinate "
                + "and edge length:");
        x = scan.nextDouble();
        y = scan.nextDouble();
        z = scan.nextDouble();
        double length = scan.nextDouble();
        
        // Constructs the cube object
        Cube cube = new Cube(x, y, z, length);
        System.out.println("The surface area: " 
                + fmt.format(cube.surfaceArea()));
        System.out.println("The volume:" + fmt.format(cube.volume()));
        System.out.println("The face diagonal: " 
                + fmt.format(cube.faceDiagonal()));
        System.out.println("The space diagonal: " 
                + fmt.format(cube.spaceDiagonal()));
        
        System.out.println("Please enter a value per line in order for "
                + "the cone's radius and height:");
        radius = scan.nextDouble();
        double height = scan.nextDouble();
        
        // Constructs the cone object
        Cone cone = new Cone(radius, height);
        System.out.println("The volume: " + fmt.format(cone.volume()));
        System.out.println("The slant height: " 
                + fmt.format(cone.slantHeight()));
        System.out.println("The surface area: " 
                + fmt.format(cone.surfaceArea()));

        // Challenge: NumberFormat
        NumberFormat numFormat = new DecimalFormat("#.###");
        System.out.println("NumberFormat result: " 
                + numFormat.format(cone.surfaceArea()));
        
        scan.close();
    }

}

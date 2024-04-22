package q1;

/**
 * Instantiates and updates two Cylinder objects, prints 
 * their radius and height before and after modification, and prints the final
 * volume and surface area of each cylinder.
 *
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class MultiCylinder {
    /**
     * Drives the program.
     *
     * @param args command line arguments (unused) 
     */
    public static void main(String[] args) {
        
        final double radius = 5.5;
        final double height = 10.0;

        Cylinder cylinder1 = new Cylinder(1.0, 1.0);
        System.out.println("The first cylinder:");
        System.out.println(cylinder1.toString());
        System.out.println("The volume: " + cylinder1.volume());
        System.out.println("The surface area: " + cylinder1.surfaceArea());
        
        Cylinder cylinder2 = new Cylinder(radius, height);
        System.out.println();
        System.out.println("The second cylinder:");
        System.out.println(cylinder2.toString());
        System.out.println("The volume: " + cylinder2.volume());
        System.out.println("The surface area: " + cylinder2.surfaceArea());
    }

}

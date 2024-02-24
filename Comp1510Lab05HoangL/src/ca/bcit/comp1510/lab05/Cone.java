package ca.bcit.comp1510.lab05;

/**
 * Class Cone represents a cone in 3D space with two components: 
 * radius and height.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class Cone {
    
    /** The radius of the Cone. */
    private double r;
    
    /** The height of the Cone. */
    private double h;
    
    /** Constructs the Cone object by initializing its r and h.
     * @param radius as a double
     * @param height as a double
     */
    public Cone(double radius, double height) {
        r = radius;
        h = height;
    }
    
    /** Calculates the volume of the Cone and returns the result.
     * @return result as a double
     */
    public double volume() {
        final double three = 3.0;
        double result = (1 / three) * Math.PI * Math.pow(r, 2) * h;
        
        return result;
    }
    
    /** Calculates the slant h of the Cone and returns the result.
     * @return result as a double
     */
    public double slantHeight() {
        double result = Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
        
        return result;
    }
    
    
    /** Calculates the surface area of the Cone and returns the result.
     * @return result as a double
     */
    public double surfaceArea() {
        double result = Math.PI * Math.pow(r, 2) 
                + Math.PI * r * (Math.sqrt(Math.pow(r, 2)) + Math.pow(h, 2));
        
        return result;
    }
    
    /** Returns a string representation of the Cone's information.
     * @return result as a String
     */
    public String toString() {
        String result = "The radius of the cone: " + r + "\n"
                + "The height of the cone: " + h + "\n"
                + "The volume of the cone: " + volume() + "\n"
                + "The slant height of the cone: " + slantHeight() + "\n"
                + "The surface area of the cone: " + surfaceArea();
        
        return result;
    }

}

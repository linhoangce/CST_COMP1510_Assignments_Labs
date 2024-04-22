package q1;

/**
 * Class Cylinder represents a cylinder object defined by its radius 
 * and height, and calculates its volume and surface area.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class Cylinder {
    
    /** The cylinder's radius. */
    private double radius;

    /** The cylinder's height. */
    private double height;
    
    /** Constructs the Cylinder object with its radius and height. 
     * @param r as a double
     * @param h as a double
     * */
    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
    
    /** Returns the value of radius.
     * @return radius as a double
     */
    public double getRadius() {
        return radius;
    }
    
    /** Sets the radius to a specific value.
     * @param value as a double
     */
    public void setRadius(double value) {
        radius = value;
    }
    
    /** Returns the value of height.
     * @return height as a double
     */
    public double getHeight() {
        return height;
    }
    
    /** Sets the height to a specific value.
     * @param value as a double
     */
    public void setHeight(double value) {
        height = value;
    }
    
    /** Returns the volume of the Cylinder.
     * @return result as a double
     */
    public double volume() {
        double result = Math.PI * Math.pow(radius, 2) * height;
        
        return result;
    }
    
    /** Returns the surface area of the Cylinder.
     * @return result as a double
     */
    public double surfaceArea() {
        double result = 2 * Math.PI * radius * (radius + height);
        
        return result;
    }
    
    /** Returns a String representation of this Cylinder.
     * @return toString representation
     */
    public String toString() {
        return "The cylinder's radius: " + radius + "\n"
                + "The cylinder's height: " + height;
    }
}

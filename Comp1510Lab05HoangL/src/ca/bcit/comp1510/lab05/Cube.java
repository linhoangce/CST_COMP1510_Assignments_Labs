package ca.bcit.comp1510.lab05;

/**
 * Class Cube represents a cube in 3D on a Cartesian plane with
 * three coordinates generating edges paralleling to the axes.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 * 
 */
public class Cube {
    
    /** The x-coordinate of the Cube. */
    private double x;
    
    /** The y-coordinate of the Cube. */
    private double y;
    
    /** The z-coordinate of the Cube. */
    private double z;
    
    /** The edge length of the Cube. */
    private double l;
    
    /** Constructs the Cube object by initializing x, y, z, and l.
     * 
     * @param x as a double
     * @param y as a double
     * @param z as a double
     * @param l as a double
     */
    public Cube(double x, double y, double z, double l) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.l = l;
    }
    
    /** Calculates the surface area of the Cube and returns the result.
     * @return result as a double
     */
    public double surfaceArea() {
        final double six = 6;
        double result = six * Math.pow(l, 2);
        
        return result;
    }
    
    /** Calculates the volume of the Cube and returns the result.
     * @return result as a double
     */
    public double volume() {
        final double three = 3;
        double result = Math.pow(l, three);
        
        return result;
    }
    
    /** Calculates the face diagonal of the Cube and returns the result.
     * @return result as a double
     */
    public double faceDiagonal() {
        double result = Math.sqrt(2) * l;
        
        return result;
    }
    
    /** Calculates the space diagonal of the Cube and returns the result.
     * @return result as a double
     */
    public double spaceDiagonal() {
        final double three = 3;
        double result = Math.sqrt(three) * l;
        
        return result;
    }
    
    /** Sets the x-coordinate of this Cube to the specified value.
     * @param value as a double
     */
    public void setX(double value) {
        x = value;
    }
    
    /** Returns the x-coordinate of this Cube as a double.
     * @return x as a double
     */
    public double getX() {
        return x;
    }
    
    /** Sets the y-coordinate of this Cube to the specified value.
     * @param value as a double
     */
    public void setY(double value) {
        y = value;
    }
    
    /** Returns the y-coordinate of this Cube as a double.
     * @return y as a double
     */
    public double getY() {
        return y;
    }
    
    /** Sets the z-coodinate of this Cube to the specified value.
     * @param value as a double
     */
    public void setZ(double value) {
        z = value;
    }
    
    /** Returns the z-coordinate of this Cube as a double.
     * @return z as a double
     */
    public double getZ() {
        return z;
    }
    
    /** Sets the edge length of this Cube to the specified value.
     * @param value as a double
     */
    public void setL(double value) {
        l = value;
    }
    
    /** Returns the edge length of this Cube as a double.
     * @return l as a double
     */
    public double getL() {
        return l;
    }
    
    /** Returns a string representation of this Cube's information.
     * @return result as a String
     */
    public String toString() {
        String result = "The x-coodinate: " + x + "\n"
                + "The y-coordinate: " + y + "\n"
                + "The z-coordinate: " + z + "\n"
                + "The surface area of the cube: " + surfaceArea() + "\n"
                + "The volume of the cube: " + volume() + "\n"
                + "The face diagonal of the cube: " + faceDiagonal() + "\n"
                + "The space diagonal of the cube: " + spaceDiagonal();
        
        return result;
    }

}

package ca.bcit.comp1510.lab05;


/**
 * Class Sphere represents a 3D sphere with three points x, y, and z, and
 * a radius from a given point.
 * 
 * @author Linh Hoang   
 * @version 2024 1.0
 * 
 */
public class Sphere {
    
    /** The x-coordinate. */
    private double x;
    
    /** The y-coordinate. */
    private double y;
    
    /** The z-coordinate. */
    private double z;
    
    /** The radius of point to the given point. */
    private double r;
    
    /**
    * Constructor sets the initial values for instance variables x, y, z, 
    * and r.
    * 
    * @param x as a double
    * @param y as a double
    * @param z as a double
    * @param r as a double
    */
    public Sphere(double x, double y, double z, double r) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.r = r;
    }
    
    /** Calculates the surface area of the Sphere and returns the result.
     * @return result as a double
     */
    public double surfaceArea() {
        final double four = 4;
        double result = four * Math.PI * Math.pow(r, 2);
        
        return result;
    }
    
    /** Calculates the volume of the Sphere and returns the result.
     * @return result as a double
     */
    public double volume() {
        final double four = 4;
        final double three = 3;
        double result = (four / three) * Math.PI * Math.pow(r, three);
        
        return result;
    }
    
    /**
     * Sets the x-coordinate of this Sphere to the specified value.
     * @param value as a double
     */
    public void setX(double value) {
        x = value;
    }
    
    /**
     * Returns the x-coordinate of this Sphere as a double.
     * @return x as double
     */
    public double getX() {
        return x;
    }
    
    /** Sets the y-coordinate of this Sphere to the specified value.
     * @param value as a double
     */
    public void setY(double value) {
        y = value;
    }
    
    /** Returns the y-coodinate of this Sphere as a double.
     * @return y as a double
     */
    public double getY() {
        return y;
    }
    
    /** Sets the z-coordinate of this Sphere to the specified value.
     * @param value as a double
     */
    public void setZ(double value) {
        z = value;
    }
    
    /** Returns the z-coordinate of this Sphere as a double.
     * @return z as a double
     */
    public double getZ() {
        return z;
    }
    
    /** Sets the radius of the given point to the three coordinate points. 
     * @param value as a double
     */
    public void setR(double value) {
        r = value;
    }
    
    /** Returns the radius of the given point to the three coordinate points.
     * @return r as a double
     */
    public double getR() {
        return r;
    }
    
    /** Return a string representation of the Sphere's information.
     * @return result as a String
     */
    public String toString() {
        String result = "The x-coordinate: " + x + "\n" 
                + "The y-coordinate: " + y + "\n"
                + "The z-coordinate: " + z + "\n"
                + "The radius: " + r + "\n"
                + "The surface area of the Sphere: " + surfaceArea() + "\n"
                + "The volume of the sphere: " + volume();
        
        return result;
    }
    
}

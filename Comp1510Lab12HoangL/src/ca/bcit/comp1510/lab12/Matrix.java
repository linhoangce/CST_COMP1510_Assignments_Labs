package ca.bcit.comp1510.lab12;

/**
 * Represents a 2D Matrix.
 * 
 *  @author Linh Hoang
 *  @version 1.0
 */
public class Matrix {

    /** The array storing the 2D matrix. */
    private int[][] matrix;
    
    /** Constructs the object defined by two parameters.
     * @param row as an int
     * @param col as an int 
     */
    public Matrix(int row, int col) {
        matrix = new int[row][col];
    }
    
    /** 
     * Returns the number of rows in the matrix.
     * @return number of rows
     */
    public int getRows() {
        return matrix.length;
    }
    
    /**
     * Returns the number of columns in the matrix.
     * @return number of cols
     */
    public int getColumns() {
        return matrix[0].length;
    }
    
    /**
     * Returns the value of the matrix in the location specified.
     * @param r as an int
     * @param c as an int
     * @return the matrix
     */
    public int getValue(int r, int c) {
        return matrix[r][c];
    }
    
    /**
     * Sets the location specified to the specified value.
     * @param value as an int
     * @param r as an int
     * @param c as an int
     */
    public void setValue(int value, int r, int c) {
        matrix[r][c] = value;
    }
    
    /**
     * Returns a String representation of the matrix.
     * @return result as a String
     */
    public String toString() {
        String result = "";
        
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                result += matrix[row][col] + "\t";
            }
            result += "\n";
        }
        
        return result;
    }
    
}

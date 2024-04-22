package ca.bcit.comp1510.lab12;

/**
 * Tests Matrix.
 * 
 * @author Linh Hoang
 * @version 1.0
 */
public class MatrixDriver {

    /**
     * Drives the program.
     * @param args command line argument
     */
    public static void main(String[] args) {
        
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
        Matrix matrix1 = new Matrix(2, 2);
        setMatrix(matrix1, 2, three, four, five);
        
        Matrix matrix2 = new Matrix(2, 2);
        setMatrix(matrix2, 1, 2, three, four);
        
        System.out.println("Matrix 1\n\n" + matrix1.toString());
        System.out.println("Matrix 2\n\n" + matrix2.toString());
        
        Matrix addMatrix = new Matrix(2, 2);
        addMatrix = add(matrix1, matrix2);
        
        System.out.println(addMatrix.toString());
        
        Matrix matrix3 = new Matrix(2, three);
        setMatrix(matrix3, 1, 2, three, four, five, six);
        System.out.println("Matrix3\n\n" + matrix3.toString());
        
        Matrix matrix4 = new Matrix(2, three);
        setMatrix(matrix4, 1, 2, three, four, five, six);
        System.out.println("\nMatrix 4\n\n" + matrix4.toString());
        
        System.out.println("\nAdding matrices with different dimensions\n");

        try {
            add(matrix1, matrix3);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        
        System.out.println("\nMultiplication (matrix1 * matrix3)\n");
        try {
            Matrix mulMatrix = new Matrix(matrix1.getRows(), 
                    matrix2.getColumns());
            mulMatrix = multiply(matrix1, matrix3);
            System.out.println(mulMatrix.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        
        
        
        System.out.println("Multiply two inconsistent matrices");
        try {
            Matrix mulMatrix = new Matrix(matrix3.getRows(),
                    matrix4.getColumns());
            mulMatrix = multiply(matrix3, matrix4);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
    
    /**
     * Sets up the matrices.
     * @param value as variable length int
     * @param matrix as a Matrix
     * @return matrix 
     */
    public static Matrix setMatrix(Matrix matrix, int... value) {
        int count = 0;
        for (int row = 0; row < matrix.getRows(); row++) {
            for (int col = 0; col < matrix.getColumns(); col++) {
                matrix.setValue(value[count], row, col);
                count++;
            }
        }
        return matrix;
    }
    
    /**
     * Tries adding matrices with different dimensions.
     * @param matrix1 as a Matrix
     * @param matrix2 as a Matrix
     * @return addMatrix as a Matrix
     */
    public static Matrix add(Matrix matrix1, Matrix matrix2) {
        
        if (matrix1.getRows() == matrix2.getRows() 
                && matrix2.getColumns() == matrix1.getColumns()) {
            Matrix addMatrix = new Matrix(matrix1.getRows(),
                    matrix1.getColumns());

            for (int i = 0; i < matrix1.getRows(); i++) {
                for (int j = 0; j < matrix2.getRows(); j++) {
                    int sum = matrix1.getValue(i, j) + matrix2.getValue(i, j);
                    addMatrix.setValue(sum, i, j);
                }
                
            }
            return addMatrix;
        } else {
            throw new ArrayIndexOutOfBoundsException("Cannot add matrices with "
                    + "different dimensions.");
        }
    }
        
    /** Multiplies two matrices. 
     * @param matrix1 as a Matrix
     * @param matrix2 as a Matrix
     * @return mulMatrix as a Matrix
    */
    public static Matrix multiply(Matrix matrix1, Matrix matrix2) {
        if (matrix1.getColumns() == matrix2.getRows()) {
            Matrix mulMatrix = new Matrix(matrix1.getRows(), 
                    matrix2.getColumns());
            
            for (int i = 0; i < matrix1.getRows(); i++) {
                for (int j = 0; j < matrix2.getColumns(); j++) {
                    int sum = 0;
                    for (int k = 0; k < matrix1.getColumns(); k++) {
                        sum += matrix1.getValue(i, k) * matrix2.getValue(k, j);
                        mulMatrix.setValue(sum, i, j);
                    }
                }
            }
            return mulMatrix;
        } else {
            throw new IllegalArgumentException("Cannot perform multiplication "
                    + "on matrices with inconsistent dimensions.");
        }
    }

}

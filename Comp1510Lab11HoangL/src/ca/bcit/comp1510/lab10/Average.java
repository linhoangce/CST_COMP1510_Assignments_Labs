package ca.bcit.comp1510.lab10;

/**
 * Tests command line argument and calculate average.
 * 
 * @author Linh Hoang
 * @version 1.0
 */
public class Average {

    /**
     * Drives the program.
     * @param args command line argument
     */
    public static void main(String[] args) {
        double sum = 0.0;
        int validCount = 0;
        int defaultVal = 0;
        
        if (args.length == 0) {
            System.out.println("No arguments.");
        } else {
            for (int i = 0; i < args.length; i++) {
                try {
                    int value = Integer.parseInt(args[i]);
                    sum += value;
                    validCount++;
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid input [" + args[i] + "]");
                    sum += defaultVal;
                }
            }

            if (validCount > 0) {
                double average = sum / validCount;
                System.out.println("Average: " + average);
            } 
        }
    }

}

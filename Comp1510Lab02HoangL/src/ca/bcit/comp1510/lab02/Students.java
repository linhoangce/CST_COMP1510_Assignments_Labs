/**
 * 
 */
package ca.bcit.comp1510.lab02;

/**
 * The program prints the students' information and grades in
 * a formatted table given.
 * 
 * @author Linh Hoang   
 * @version 2024 1.0
 */
public class Students {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        
        // Trying two ways to print the border to the same effect
        System.out.print("///////////////////");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==\t Student Points\t\t ==");
        System.out.println("///////////////////"
                + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        
        // Trying out concatenation and addition
        System.out.println("Name        Lab     Bonus      Total");
        System.out.println("----        ---     -----      -----");
        System.out.println("Joe         43      7          " + 50);
        System.out.println("William     50      8          " + 58);
        System.out.println("Mary Sue    39      10         " + (39 + 10));
        System.out.println("Peng        87      6          " + (87 + 6));
        System.out.println("Kwon        99      0          " + (90 + 0));
        
    }

}

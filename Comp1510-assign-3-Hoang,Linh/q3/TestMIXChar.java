package q3;

import java.util.Scanner;

/**
 * Tests MIXChar.
 *
 * @author Linh Hoang
 * @version 1.0
 */
public class TestMIXChar {
    
    /**
     * Drives the program.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a sentence in uppercase: ");
        String str = scan.nextLine();
        
        Message message = new Message(str);
        MIXChar[] mixCh = MIXChar.toMIXChar(str);
        
        
        System.out.println("Input: " + str);
        System.out.println("Encoded: " + message.toLong());
        System.out.println("Decode: " + message.toString());
      
        
        System.out.println();
        System.out.println("Question three was called and ran sucessfully.");
        
        scan.close();
    }
    
}

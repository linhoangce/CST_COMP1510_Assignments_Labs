package q4;

import java.util.Scanner;

/**
 * Class Pack asks users to enter five characters in UNICODE range 'A' to 'I' 
 * (inclusive) and encodes them using MIX system, and then reverse them.
 *
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class Pack {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {

        final int base = 56;
        final int three = 3;
        final int four = 4;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter any 5 characters from A to I (inclusive):");
        String input = scan.next();
        
        char c1 = input.charAt(0);
        char c2 = input.charAt(1);
        char c3 = input.charAt(2);
        char c4 = input.charAt(three);
        char c5 = input.charAt(four);
        
        int d1 = (int) (c1 - 'A' + 1);
        int d2 = (int) (c2 - 'A' + 1);
        int d3 = (int) (c3 - 'A' + 1);
        int d4 = (int) (c4 - 'A' + 1);
        int d5 = (int) (c5 - 'A' + 1);

        d1 = (int) (d1 * Math.pow(base, four));
        d2 = (int) (d2 * Math.pow(base, three));
        d3 = (int) (d3 * Math.pow(base, 2));
        d4 = (int) (d4 * Math.pow(base, 1));
        d5 = (int) (d5 * Math.pow(base, 0));
                
        int encoded = d1 + d2 + d3 + d4 + d5;
        System.out.println();
        System.out.println("ENCODED:    " + encoded);
        
        d1 = encoded % base;
        c1 = (char) (d1 - 1 + 'A');
        encoded = encoded / base;
        
        d2 = encoded % base;
        c2 = (char) (d2 - 1 + 'A');
        encoded = encoded / base;
        
        d3 = encoded % base;
        c3 = (char) (d3 - 1 + 'A');
        encoded = encoded / base;
        
        d4 = encoded % base;
        c4 = (char) (d4 - 1 + 'A');
        encoded = encoded / base;
        
        d5 = encoded % base;
        c5 = (char) (d5 - 1 + 'A');
       
        System.out.println("DECODED:    " + c5 + c4 + c3 + c2 + c1);
        
        scan.close();
    }

}

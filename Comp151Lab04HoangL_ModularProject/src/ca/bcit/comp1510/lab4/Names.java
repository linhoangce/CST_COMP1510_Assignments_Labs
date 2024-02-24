package ca.bcit.comp1510.lab4;

import java.util.Scanner;

/**
 * Class Names asks users to enter first name, middle name, and last name,
 * uses the setters method to capitalize the first letter of each name, 
 *  and prints out the full name to standard output.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class Names {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your first name:");
        String first = scan.nextLine();
        System.out.println("Please enter your mid name:");
        String mid = scan.nextLine();
        System.out.println("Please enter your last name:");
        String last = scan.nextLine();

        Name full = new Name(first, mid, last);
        
        // Get the first character of each name and capitalize it.
        String cap1st = full.getFirstName().substring(0, 1);
        full.setFirstName(first.replaceFirst(cap1st, cap1st.toUpperCase()));
        
        cap1st = full.getMidName().substring(0, 1);
        full.setMidName(mid.replaceFirst(cap1st, cap1st.toUpperCase()));
        
        cap1st = full.getLastName().substring(0, 1);
        full.setLastName(last.replaceFirst(cap1st, cap1st.toUpperCase()));
        
        System.out.println("Your full name is: " + full.toString());
        
        scan.close();

    }

}

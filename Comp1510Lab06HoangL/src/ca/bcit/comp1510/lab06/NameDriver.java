package ca.bcit.comp1510.lab06;

/**
 * The driver for Class Name.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class NameDriver {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        final int twenty = 20;
        
        Name fullName = new Name("", "", "");
        System.out.println("Empty strings return default names: " + fullName);
        
        fullName = new Name("linh", "che", "hoang");
        System.out.println();
        System.out.println("Full name: " + fullName);
        
        System.out.println();
        System.out.println(new Name("", "che", ""));
        
        System.out.println();
        System.out.println("Out of bound:" + fullName.nthChar(twenty));
        System.out.println("In bound: " + fullName.nthChar(1));
        
        
        fullName.setFirstName("");
        System.out.println();
        System.out.println("Nothing is done when it is empty: " + fullName);
        
        fullName.setFirstName("justin");
        System.out.println("Change first name: " + fullName);
        
        fullName.setMidName("");
        System.out.println();
        System.out.println("Nothing is done when it is "
                + "an empty string argument: " + fullName);
        
        fullName.setMidName("Mark");
        System.out.println("Change middle name also: " + fullName);
        
        fullName.setLastName("");
        System.out.println();
        System.out.println("Nothing is done when it is an "
                + "empty string argument: " + fullName);
        
        fullName.setLastName("dewolf");
        System.out.println("Finally, change last name: " + fullName);

    }

}

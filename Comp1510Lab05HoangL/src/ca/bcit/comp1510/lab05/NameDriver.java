package ca.bcit.comp1510.lab05;

/**
 * Class NameDrivers drives all new methods added to class Name from 
 * lab 4.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 * 
 */
public class NameDriver {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {

        Name name = new Name("linh", "che", "hoang");
        
        System.out.println(name.length());
        System.out.println(name.capInitials());
        System.out.println(name.nthChar(2));
        System.out.println(name.nameFormat());
        System.out.println(name.compareString("lin"));
        System.out.println(name.compareString("linh"));
        System.out.println(name.compareObj(new Name("linh", "Che", "hoang")));
        System.out.println(name.compareObj(new Name("linh", "che", "hoang")));
        
        // It worked for all names.
    }

}

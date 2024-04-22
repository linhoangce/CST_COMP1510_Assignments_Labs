package ca.bcit.comp1510.lab10;

import java.util.ArrayList;
import java.util.List;

/**
 * Drives the Name class.
 * 
 * @author Linh Hoang
 * @version 2024
 */
public class NameDriver {

    /**
     * Drives the programs.
     * @param args unused
     */
    public static void main(String[] args) {

        List<Name> list = new ArrayList<>();
        
        Name name1 = new Name("Linh", "Che", "Hoang");
        Name name2 = new Name("Linh", "", "Hoang");
        Name name3 = new Name("Justin", "Mark", "Dewolf");
        Name name4 = new Name("Justin", "Dewolf");
        
        list.add(name1);
        list.add(name2);
        list.add(name3);
        list.add(name4);
        
        list.sort(null);
        System.out.println(list.toString());
    }

}

package ca.bcit.comp1510.lab09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Represents a cat hotel.
 * 
 *  @author Linh Hoang
 *  @version 2024 1.0
 */
public class CatHotel {

    /** The guest list. */
    private List<Cat> guestList;
    
    /** The name of the hotel. */
    private String hotelName;
    
    /** 
     * Constructs the object. 
     * @param name as a String
     * */
    public CatHotel(String name) {
        hotelName = name;
        guestList = new ArrayList<>();
    }
    
    /** 
     * Adds a Cat to the guestList.
     * @param cat as a Cat
     */
    public void addCat(Cat cat) {
        guestList.add(cat);
    }
    
    /** Removes all the guest from the hotel. */
    public void removeAllGuests() {
        guestList.clear();
    }
    
    /** 
     * Returns the current number of guest in the hotel. 
     * @return the number of guest
     */
    public int guestCount() {
        return guestList.size();
    }
    
    /** Removes a guest whose age is older than a specified value.
     * @param value as an int
     * @return the number of removed guests
     */
    public int removeOldGuest(int value) {
        int count = 0;
        Iterator<Cat> catIterator = guestList.iterator();
        
        while (catIterator.hasNext()) {
            Cat temp = catIterator.next();
            if (temp.getAge() > value) {
                catIterator.remove();
                count++;
            }
        }
        
        return count;
    }
    
    /** Prints the name of the hotel and cats in the hotel. */
    public void printGuestList() {
       
        System.out.println("Hotel name is " + hotelName);
        if (guestList.size() == 0) {
            System.out.println("There is no guest in the hotel.");
        } else {
            System.out.println("Current guests list");
            System.out.println("Name\t\tAge");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            for (Cat cat: guestList) {
                System.out.println(cat);
            }
        }
        System.out.println();
    }
}

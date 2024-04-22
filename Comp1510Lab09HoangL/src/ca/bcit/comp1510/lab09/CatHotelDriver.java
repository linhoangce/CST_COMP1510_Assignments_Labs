package ca.bcit.comp1510.lab09;

import java.util.Random;

/**
 * Constructs the CatHotel and Cat objects, add Cat to CatHotel, and 
 * performs all functions defined in the constructor classes.
 * 
 * @author Linh Hoang
 * @version ageLimit24 1.0
 */
public class CatHotelDriver {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        final int ageLimit = 20;
        final int ageRemoved = 15;
        Random generator = new Random();

        CatHotel catHotel = new CatHotel("Meowmeow Hotel");
        
        Cat cat1 = new Cat("", generator.nextInt(ageLimit) + 1);
        Cat cat2 = new Cat("Mia", generator.nextInt(ageLimit) + 1);
        Cat cat3 = new Cat("Mya", generator.nextInt(ageLimit) + 1);
        Cat cat4 = new Cat("Mimi", generator.nextInt(ageLimit) + 1);
        Cat cat5 = new Cat("Maui", -1);
        Cat cat6 = new Cat("May", generator.nextInt(ageLimit) + 1);
        Cat cat7 = new Cat("Mark", generator.nextInt(ageLimit) + 1);
        Cat cat8 = new Cat("Momo", generator.nextInt(ageLimit) + 1);
        Cat cat9 = new Cat("Meo", generator.nextInt(ageLimit) + 1);
        Cat cat10 = new Cat("Leo", generator.nextInt(ageLimit) + 1);
        
        catHotel.addCat(cat1);
        catHotel.addCat(cat2);
        catHotel.addCat(cat3);
        catHotel.addCat(cat4);
        catHotel.addCat(cat5);
        catHotel.addCat(cat6);
        catHotel.addCat(cat7);
        catHotel.addCat(cat8);
        catHotel.addCat(cat9);
        catHotel.addCat(cat10);
        
        catHotel.printGuestList();
        catHotel.removeOldGuest(ageRemoved);
        System.out.println("Update After Eviction\n");
        catHotel.printGuestList();
        catHotel.removeAllGuests();
        catHotel.printGuestList();
    }

}

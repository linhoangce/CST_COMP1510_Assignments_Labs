package ca.bcit.comp1510.lab10;

/**
 * Represents an item.
 * 
 * @author Linh Hoang
 * @version 1.0
 */
public class Item {
    
    /** The name of the item. */
    private final String item;
    
    /** The price of the item. */
    private final double price;
    
    /** The quantity purchased. */
    private final int quantity;
    
    /** 
     * Constructs the object with parameters. 
     * @param name as a String
     * @param price as a double
     * @param num as an int
     */
    public Item(String name, double price, int num) {
        item = name;
        this.price = price;
        quantity = num;
    }
    
    /**
     * Constructs the object with set quantity of 1. 
     * @param name as a String
     * @param price as a doublt
     */
    public Item(String name, double price) {
        item = name;
        this.price = price;
        quantity = 1;
    }
    
    /** 
     * Returns the item name.
     * @return item as a String
     */
    public String getItem() {
        return item;
    }
    
    /**
     * Returns the price. 
     * @return price as a double
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Returns the quantity.
     * @return quantity as an int
     */
    public int getQuantity() {
        return quantity;
    }
 
    /** 
     * Returns a String representation of Item.
     * @return a string
     */
    public String toString() {
        return "Item: " + item 
                + "\nPrice: " + price
                + "\nQuantity: " + quantity;
    }
}

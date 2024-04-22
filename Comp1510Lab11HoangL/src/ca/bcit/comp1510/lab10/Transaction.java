package ca.bcit.comp1510.lab10;

/**
 * Represents a transaction involving Item.
 * 
 * @author Linh Hoang
 * @version 1.0
 */
public class Transaction {

    /** The cart that store items. */
    private Item[] cart;
    
    /** The total price of the current cart. */
    private double totalPrice;
    
    /** The number of the items in cart. */
    private int itemCount;
    
    
    /** 
     * Constructs the object with one parameter. 
     * @param length as an int
     */
    public Transaction(int length) {
        cart = new Item[length];
        totalPrice = 0.0;
        itemCount = 0;
    }
    
    /**
     * Adds an item to cart.
     * @param itemName as a String
     * @param price as a double
     * @param quantity as an int
     */
    public void addToCart(String itemName, double price, int quantity) {
        Item item = new Item(itemName, price, quantity);
        addToCart(item);
        
    }
    
    /**
     * Adds an item to cart.
     * @param item as an Item
     */
    public void addToCart(Item item) {
        increaseSize();
        
        cart[itemCount] = item;
        totalPrice += item.getPrice() * item.getQuantity();
        itemCount++;
        
        
         
    }
    
    /** 
     * Increases the size of the cart when needed.
     */
    public void increaseSize() {
        final int three = 3;
        if (itemCount == cart.length) {
            Item[] newCart = new Item[cart.length + three];
            for (int i = 0; i < cart.length; i++) {
                newCart[i] = cart[i];
            }
            cart = newCart;
        }
        
    }
    
    /** 
     * Returns the total price. 
     * @return totalPrice as a double
     */
    public double getTotalPrice() {
        return totalPrice;
    }
    
    /**
     * Returns the total number of all the items in the cart.
     * @return count as an int
     */
    public int getCount() {
        int count = 0;
        for (Item item: cart) {
            count += item.getQuantity();
        }
        
        return count;
    }
    
    /**
     * Returns the number of items in cart.
     * @return itemCount as an int
     */
    public int getItemCount() {
        return itemCount;
    }
    
    /** 
     * Returns a String representation of the cart and total price.
     * @return result as a String
     */
    public String toString() {
        String result = "";
        
        for (int i = 0; i < itemCount; i++) {
            result += "\nItem:\t\t" + cart[i].getItem()
                + "\nPrice:\t\t" + cart[i].getPrice()
                + "\nQuantity:\t" + cart[i].getQuantity() + "\n";
        }
        result += "\nTotal price:\t" + totalPrice; 
        
        return result;
    }
}

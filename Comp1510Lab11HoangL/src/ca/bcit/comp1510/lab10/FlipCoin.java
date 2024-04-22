package ca.bcit.comp1510.lab10;

/**
 * Tests the Coin object with Lockable interface behaviors.
 * @author Linh Hoang
 * @version 1.0
 */
public class FlipCoin {

    /**
     * Drives the program.
     * @param args command line argument
     */
    public static void main(String[] args) {
        
        Coin coin = new Coin();

        final int key = 123;
        coin.setKey(key);
        coin.lock(key);

        try {
            coin.flip(); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        
        coin.unlock(key);
        coin.flip(); 
        System.out.println(coin.toString());
        
        coin.lock(key);
        coin.unlock(1);
        try {
            coin.flip(); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
    }

}

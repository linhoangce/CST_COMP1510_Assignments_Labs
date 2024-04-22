package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * Represents a shopping event to test the Item and Transaction class.
 * 
 * @author Linh Hoang
 * @version 1.0
 */
public class Shopping {

    /**
     * Drives the program. 
     * @param args command line argument
     */
    public static void main(String[] args) {
        
        final int extra = 3;
        final int cartSize = 10;
        Transaction cart = new Transaction(cartSize);
        
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < cartSize; i++) {
            System.out.println("What item do you want to buy");
            String item = scan.nextLine();
            System.out.println("What is its price?");
            double price = scan.nextDouble();
            scan.nextLine();
            System.out.println("How many do you want?");
            int quantity = scan.nextInt();
            scan.nextLine();
            cart.addToCart(item, price, quantity);
        }
        
        System.out.println("Your current cart has\n" + cart.toString() + "\n");
        System.out.println("The number of item in cart: " 
                + cart.getItemCount());
        System.out.println("The total quantity: " + cart.getCount());

        System.out.println("\nAdd three more items");
        for (int i = 0; i < extra; i++) {
            System.out.println("What item do you want to buy");
            scan.nextLine();
            String item = scan.nextLine();
            System.out.println("What is its price?");
            double price = scan.nextDouble();
            System.out.println("How many do you want?");
            int quantity = scan.nextInt();
            Item cartItem = new Item(item, price, quantity);
            cart.addToCart(cartItem);
        }

        System.out.println("Your current cart:\n" + cart.toString() + "\n");
        System.out.println("The number of items in cart: " 
                + cart.getItemCount()
                + "\nThe total quantity: " + cart.getCount());

        
        scan.close();
        
        

    }

}

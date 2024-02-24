package ca.bcit.comp1510.lab03;

import java.util.Scanner;

/**
 * Class FunWithStrings tests out different methods of the String class.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class FunWithStrings {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        
        String userInput;
        String convertToUpperCs;
        String trimmedUserInput;
        int lastChar;
        
        System.out.println("Please enter the title of your favorite book: ");
        Scanner scan = new Scanner(System.in);

        userInput = scan.nextLine();
        
        System.out.println("The title of your favorite book is: " 
               +  userInput);
        
        System.out.println("The length of your favorite book's title is: "
                + userInput.length());
        
        System.out.println("Check if the book title starts with \"The\": " 
                + userInput.startsWith("The"));
        
        System.out.println("Invoking toUpperCase() on user's input will not "
                + "permanently change the string: " + userInput.toUpperCase());
        System.out.println("Check to see if this is still true: " + userInput);
        
        convertToUpperCs = userInput.toUpperCase();
        System.out.println("The new string with toUpperCase() method invoked: "
                + convertToUpperCs);
        System.out.println("The title of the book in lower case is: "
                + userInput.toLowerCase());
        
        trimmedUserInput = userInput.trim();
        System.out.println("The length of your book's title after being trimmed"
                + " is: " + trimmedUserInput.length());
        System.out.println("The trimmed title is: " + trimmedUserInput);
        
        System.out.print("The title which is fully trimmed, in lower case, "
                + "with the first and last letter capitalized is: ");
        
        lastChar = trimmedUserInput.length() - 1;
        System.out.println(trimmedUserInput.substring(0, 1).toUpperCase()
                + trimmedUserInput.substring(1, lastChar).toLowerCase()
                + trimmedUserInput.substring(lastChar).toUpperCase());
        
        scan.close();
        
    }

}

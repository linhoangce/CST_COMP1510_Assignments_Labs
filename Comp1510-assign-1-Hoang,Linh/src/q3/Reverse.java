package q3;

import java.util.Scanner;
import java.util.Stack;

/**
 * Class Reverse asks users to enter a string of 10 words and read these 
 * as tokens. These are added to a stack using push()from the Stack class, 
 * and using pop() to print out the 10 words in reverse order.
 *
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class Reverse {

    /**
     * This is the main method that runs the code.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Stack<String> myStack = new Stack<String>();
        
        System.out.println("Enter your 10 words seperated by a white space:");
        String strToken = scan.next();
        myStack.push(strToken);
        myStack.push(scan.next());
        myStack.push(scan.next());
        myStack.push(scan.next());
        myStack.push(scan.next());
        myStack.push(scan.next());
        myStack.push(scan.next());
        myStack.push(scan.next());
        myStack.push(scan.next());
        myStack.push(scan.next());

        System.out.println();
        System.out.println("Your 10 words in reverse order are:");
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        
        scan.close();
    }

}

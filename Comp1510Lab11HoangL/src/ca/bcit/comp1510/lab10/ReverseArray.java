package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * Asks users to input the length and the value for an array, and reverses it.
 * 
 * @author Linh Hoang
 * @version 1.0
 */
public class ReverseArray {

    /**
     * Drives the program.
     * @param args command-line argument
     */
    public static void main(String[] args) {

        int inputLength;
        int[] inputValue;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of values: ");
        inputLength = scan.nextInt();
        
        inputValue = new int[inputLength];
        for (int i = 0; i < inputLength; i++) {
            System.out.println("Enter values: ");
            inputValue[i] = scan.nextInt(); 
        }
        
        System.out.println("Your input:");
        for (int value: inputValue) {
            System.out.print("\t" + value);
        }
        
        swap(inputValue);
        System.out.println("\n\nReversing:");
        for (int value: inputValue) {
            System.out.print("\t" + value);
        }
        
        scan.close();
    }

    /**
     * Reverses the order of the elements in the array.
     * @param value as a variable length
     */
    public static void swap(int... value) {
        int start = 0;
        int end = value.length - 1;
        while (start < end) {
            int temp = value[start];
            value[start] = value[end];
            value[end] = temp;
            
            start++;
            end--;
        }
        
    }
}

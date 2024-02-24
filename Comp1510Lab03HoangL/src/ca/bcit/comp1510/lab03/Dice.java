package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * The class Dice simulates the six dice used in Dungeons and Dragons,
 * which have 4, 6, 8, 10, 12, and 20 sides. It uses class Random to roll
 * each die and print out the total value of the six dice after each roll.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class Dice {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        
        int die1;
        int die2;
        int die3;
        int die4;
        int die5; 
        int die6;
        
        final int four = 4;
        final int six = 6;
        final int eight = 8;
        final int ten = 10;
        final int twelve = 12;
        final int twenty = 20;
        
        Random generator = new Random();
        
        die1 = generator.nextInt(four) + 1;
        System.out.println("The 4-sided die value is: " + die1);
        
        die2 = generator.nextInt(six) + 1;
        System.out.println("The 6-sided die value is: " + die2);
        
        die3 = generator.nextInt(eight) + 1;
        System.out.println("The 8-sided die value is: " + die3);
        
        die4 = generator.nextInt(ten) + 1;
        System.out.println("The 10-sided die value is: " + die4);
        
        die5 = generator.nextInt(twelve) + 1;
        System.out.println("The 12-sided die value is: " + die5);
        
        die6 = generator.nextInt(twenty) + 1;
        System.out.println("The 20-sided die value is: " + die6);
        
        System.out.print("The total value of the 6 dice rolled is: ");
        System.out.println(die1 + die2 + die3 + die4 + die5 + die6);
        

    }

}

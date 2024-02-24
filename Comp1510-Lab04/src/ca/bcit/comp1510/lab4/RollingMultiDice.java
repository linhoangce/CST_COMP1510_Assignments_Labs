package ca.bcit.comp1510.lab4;

/**
 * Demonstrates the creation and use of a user-defined class.
 * The original class RollingDice is modified to roll two dice, change 
 * the face value of one die, and calculate the sum of the two dice.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @author Linh Hoang
 * 
 * @version 2017
 * @version 2024 1.0
 */
public class RollingMultiDice {
    /**
     * Driver program creates two Die objects and rolls them.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        final int newFace = 5;
        final int numSides = 7;
        MultiDie die1;
        MultiDie die2;
        int sum;
        
        System.out.println("Number of sides on the two dice is: ");

        die1 = new MultiDie(numSides);
        die2 = new MultiDie(numSides);
        
        System.out.println(die1.max);
        System.out.println(die2.max);
        
        die1.roll();
        die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        die1.roll();
        die2.setFaceValue(newFace);
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println("Sum: " + sum);

        sum = die1.roll() + die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);
        System.out.println("New sum: " + sum);

        // 1. We do not need getters and setters for max, and we should not
        // have them because it is unnecessary.
        
        // 2. We can have getters, but not setters for max because it is 
        // declared as final.
        // 
        // 3. (To answer question 2) It makes sense in this case to have max be 
        // final because it has the visible modifier public which would give 
        // access to other classes outside class MultiDie and could change 
        // change its value.
        
        // 4. Instead of being private, declaring max as (public) final makes 
        // it inaccessible to other classes, meaning that the value of max 
        // cannot be changed directly by any other outside classes.
        // This is encapsulation. The encapsulated variable max interacts 
        // with other parts of the program through the object's formal 
        // parameter; its value is set by the actual parameter.
        
        // 5. Yes, because of the encapsulated nature of max, it is an instance
        // variable.
    }
}


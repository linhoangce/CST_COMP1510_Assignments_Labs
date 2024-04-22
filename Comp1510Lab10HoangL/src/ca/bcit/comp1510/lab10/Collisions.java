package ca.bcit.comp1510.lab10;

/**
 * Represents collisions between two particles in space.
 * 
 * @author Linh Hoang
 * @version 2024
 */
public class Collisions {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        final int boundary = 2000000;
        final int steps = 100000;
        final int x1 = -3;
        final int x2 = 3;

        RandomWalker particle1 = new RandomWalker(steps, boundary, x1, 0);
        RandomWalker particle2 = new RandomWalker(steps, boundary, x2, 0);
        
        System.out.println("Particle 1's initial state" 
                + particle1.toString());
        System.out.println("Particle 2's initial state:" 
                + particle2.toString());
        System.out.println();

        for (int i = 0; i < steps; i++) {
            if (!samePosition(particle1, particle2)) {
                particle1.takeStep();
                particle2.takeStep();
            }

        }
        
        if (particle1.getCurrentStep() < steps) {
            System.out.println("Collision happens at " + particle1.toString());
        } else {
            System.out.println("\nNo colision in space and time moves on!");
        }
  
    }
   
    /**
     * Compares two particles' positions.
     * @param one as a RandomWalker
     * @param two as a RandomWallker
     * @return true if both are at the same position
     */
    public static boolean samePosition(RandomWalker one, RandomWalker two) {
        return one.getX() == two.getX() && one.getY() == two.getY();
    }

}

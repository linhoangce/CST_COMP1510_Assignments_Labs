package ca.bcit.comp1510.lab12;

import java.util.Scanner;

/**
 * Compares the player objects.
 * @author Linh Hoang
 * @version 1.0
 */
public class ComparePlayer {

    /**
     * Drives the program.
     * @param args command line argument
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Player[] list = new Player[2];
        
        try {
            Player player1 = new Player(null, "Team2", 1);
            Player player2 = new Player("", "Team2", 2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Player player3 = new Player("John", "", 1);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        
        try {
            Player player4 = new Player("Mark", "Team Tex", -1);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        
        for (int i = 0; i < list.length; i++) {
            
            System.out.println("Enter the the name for the player and the team "
                + " per line: ");
            Player player = new Player(scan.nextLine(), scan.nextLine(), i + 1);
           
            list[i] = player;
        }
        
        System.out.println(list[0].equals(list[1]));
        System.out.println(list[0].compareTo(list[1]));
        
        scan.close();
    }
    

}

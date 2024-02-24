package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * Class CardGame simulates the a standard card set of 52 cards that 
 * generates a card with random values between Ace, 2, 3, ..., 10,
 * Jack, Queen, King and a random suits Hearts, Diamonds, Clubs, Spades.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class CardGame {
    
    enum Rank { 
        /** cards Ace.*/
        ace,
        /** cards with value 2.*/
        two,
        /** cards with value 3.*/
        three,
        /** cards with value 4.*/
        four, 
        /** cards with value 5.*/
        five,
        /** cards with value 6.*/
        six,
        /** cards with value 7.*/
        seven,
        /** cards with value 8.*/
        eight,
        /** cards with value 9.*/
        nine,
        /** cards with value 10.*/
        ten,
        /** cards Jack.*/
        jack,
        /** cards Queen.*/
        queen,
        /** cards King.*/
        king
    }
    
    enum Suit { 
        /** cards in suit Hearts.*/
        hearts,
        /** cards in suit Diamonds.*/
        diamonds,
        /** cards in suit Clubs.*/
        clubs,
        /** cards in suit Spades.*/
        spades
    }

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        
        Random random = new Random();
        
        // Generates a random index for card values in Rank
        int randomRankChoice = random.nextInt(Rank.values().length);
        Rank randomRank = Rank.values()[randomRankChoice];
        System.out.println("The random card value is: " + randomRank);
        
        // Generates a random index for card suits in Suit
        int randomSuitChoice = random.nextInt(Suit.values().length);
        Suit randomSuit = Suit.values()[randomSuitChoice];
        System.out.println("The random card suit is: " + randomSuit);

    }

}

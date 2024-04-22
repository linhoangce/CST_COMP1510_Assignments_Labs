package ca.bcit.comp1510.lab08;

import java.util.Random;
import java.util.Scanner;

/**
 * Class Games represents a game defined by user score and two games
 * that users can choose.
 * 
 * @author Linh Hoang   
 * @version 2024 1.0
 */
public class Games {

    /** The user's score. */
    private int userScore;
    
    /** The Scanner object that gets input from user. */
    private Scanner userInput;
    
    /** The Random object that generates a random number. */
    private Random generator;
    
    /**
     * Constructs the Games object.
     */
    public Games() {
        userScore = 0;
        userInput = new Scanner(System.in);
        generator = new Random();
    }
    
    /**
     * Represents a play action by asking the user to select their choice 
     * continuously.
     */
    public void play() {
        
        final int three = 3;
        final int four = 4;
        boolean play = true;
        
        do {
            System.out.println("Welcome to the Games program!");
            System.out.print("Make your choice(enter a number): \n"
                + "1. See your score \n"
                + "2. Guess a number \n"
                + "3. Play Rock, Paper, Scissors \n"
                + "4. Quit \n"
                + "> ");
            
        
            int input = userInput.nextInt();
            System.out.println();
            
            switch (input) {
                case 1: 
                    System.out.println("Your score is " + userScore);
                    break;
                case 2:
                    guessANumber();
                    break;
                case three:
                    rockPaperScissors();
                    break;
                case four:
                    System.out.println("Thanks for playing. Goodbye.");
                    return;
                default: 
                    System.out.println("Invalid. Please make another choice.");
                    
            }
        } while (play);
    }
    
    /**
     * Asks users to guess a number.
     */
    public void guessANumber() {
        final int range = 101;
        final int five = 5;
        System.out.println("I've picked a random number between 0 and 100 \n"
                + "Can you guess it? \n"
                + "Guess the number!");
        int randomNum = generator.nextInt(range);
        int guess = userInput.nextInt();
        int count = 0;
        while (guess != randomNum) {
            if (guess > randomNum) {
                System.out.println("Too high, guess again! \n"
                        + "Guess the number!");
                guess = userInput.nextInt();
            } else {
                System.out.println("Too low, guess again! \n"
                        + "Guess the number!");
                guess = userInput.nextInt();
            }
            count++;
        }
        
        System.out.println("RIGHT!");
        
        if (count <= five) {
            userScore += five;
            System.out.println("Five points!");
        }
        
    }
    
    /**
     * Asks users to play rock, paper, scissors game.
     */
    public void rockPaperScissors() {
        final int three = 3;
        final int five = 5;
        
        int randomChoice = generator.nextInt(three);
        
        System.out.println("I've picked one of ROCK, PAPER, and SCISSORS \n"
                + "\"Which one do you choose?\"");
        
        // Consume new line character;
        userInput.nextLine(); 
        String guess = userInput.nextLine();
        System.out.println(guess);
        
        while (!(guess.equals("Rock") || guess.equals("Paper") 
                || guess.equals("Scissors"))) {
            System.out.println("That is not a valid choice! Try again!");
            System.out.println("Choose Rock, Paper, or Scissors");
            guess = userInput.nextLine();
        }
        
        switch (guess) {
        
            case "Rock": 
                switch (randomChoice) {
                    case 0: 
                        System.out.println("It's a tie!");
                        break;
                    case 1:
                        System.out.println("Nope, I picked Paper.");
                        userScore -= three;
                        break;
                    default:
                        System.out.println("Yes! Rock smashes scissors.");
                        userScore += five;
                        break;
                }
                break;
                
            case "Paper":
                switch (randomChoice) {
                    case 0: 
                        System.out.println("Yes! Paper wraps rock.");
                        userScore += five;
                        break;
                    case 1: 
                        System.out.println("It's a tie.");
                        break;
                    default: 
                        System.out.println("Nope, I picked Scissors.");
                        userScore -= three;
                        break;
                }
                break;
                
            default:
                switch (randomChoice) {
                    case 0: 
                        System.out.println("Nope, I picked Rock.");
                        userScore -= three;
                        break;
                    case 1:
                        System.out.println("Yes! Scissors cut paper.");
                        userScore += five;
                        break;
                    default:
                        System.out.println("It's a tie.");
                        break;
                }
                break;
        }
    }
    
}

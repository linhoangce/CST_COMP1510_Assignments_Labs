package q3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents a list of prime numbers.
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Primes {
    
    /** The list of primes. */
    private ArrayList<Boolean> primes;
    
    /** Constructs an object that set the maximum index for primeList. 
     * @param n as an int
     * */
    public Primes(int n) {
        primes = new ArrayList<Boolean>(n);
        calculatePrimes(n);
    }
    
    private void calculatePrimes(int n) {
       
        for (int i = 0; i < n; i++) {
            primes.add(true);
        }
        
        primes.set(0, false);
        primes.set(1, false);
        
        for (int i = 2; i * i < n; i++) {
            if (primes.get(i)) {
                for (int j = i * i; j < n; j += i) { 
                    primes.set(j, false);
                }
            }
        }
    }
    
    /** Prints the prime numbers. */
    public void printPrimes() {
        for (int i = 2; i < primes.size(); i++) {
            if (primes.get(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    /** Counts the numbers of primes. 
     * @return count as an int
     * */
    public int countPrimes() {
        int count = 0;
        for (int i = 2; i < primes.size(); i++) {
            if (primes.get(i)) {
                count++;
            }
        }
        
        return count;
    }

    /**
     * Drives the program.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        int input;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This program uses the sieve of Erastosthenes "
                + "to determine which numbers are prime.");
        
        System.out.println();
        System.out.println("Enter an upper bound: ");
        
        do {
            input = scan.nextInt();
        } while (input <= 1);
        
        Primes primes = new Primes(input); 

        System.out.println();
        System.out.println("There are " + primes.countPrimes() + " primes:");
        System.out.println();
        System.out.println("The prime numbers between 0 and " + input 
                + " are:");
        
        primes.printPrimes();
              
        scan.close();
    }

}

package ca.bcit.comp1510.lab06;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
/**
 * Reads baseball data in from a comma delimited file. Each line 
 * of the file contains a name followed by a line of symbols
 * indicating the result of each at bat: h for hit, o for out,
 * w for walk, s for sacrifice. Statistics are computed and
 * 
 * printed for each player.
 * @author blink
 * @version 2024 1.0
 *
 */

public class BaseballStats {
    
    /**
     * Reads baseball stats from a file and counts
     *  total hits, outs, walks, and sacrifice flies
     * for each player.
     * @param args unused
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner fileScan;
        Scanner lineScan;
        String fileName;
        String playerStats = "";
        String player = "";
       
        NumberFormat fmt = NumberFormat.getPercentInstance();
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the name of the input file: ");
        fileName = scan.nextLine();
        fileScan = new Scanner(new File(fileName));
        
        while (fileScan.hasNext()) {
            
            String line = fileScan.nextLine();
            
            lineScan = new Scanner(line);
            lineScan.useDelimiter(",");
                    
            
            int countHits = 0;
            int countOuts = 0;
            int countWalks = 0;
            int countSacrifices = 0;
            
            while (lineScan.hasNext()) {
             
                playerStats = lineScan.next();
                
                if (playerStats.equals("o")) {
                    countOuts++;
                } else if (playerStats.equals("h")) {
                    countHits++;
                } else if (playerStats.equals("w")) {
                    countWalks++;
                } else if (playerStats.equals("s")) {
                    countSacrifices++;
                } else {
                    player = playerStats;
                }
                
            }
            System.out.println();
            System.out.println("Player: " + player + "\n"
                + "    h:  " + countHits + "\n"
                + "    o:  " + countOuts + "\n"
                + "    w:  " + countWalks + "\n"
                + "    s:  " + countSacrifices + "\n"
                + "    Batting average: " 
                    + fmt.format((double) countHits / (countHits + countOuts)));
            
        }
        scan.close();
    }   
    
} 
    


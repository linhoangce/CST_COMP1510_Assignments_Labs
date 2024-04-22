package ca.bcit.comp1510.lab09;

import java.util.ArrayList;
import java.util.List;

/**
 * Flips Coins 100 times and counts the longest run of heads.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class CoinRunner {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {

        final int flips = 100;

        List<Coin> coinList = new ArrayList<Coin>();
        int countHeads = 0;
        int longestRun = 0;

        for (int i = 0; i < flips; i++) {
            Coin coin = new Coin();
            coin.flip();
            coinList.add(coin);
            System.out.println(coin.toString());
        }

        for (Coin face : coinList) {
            if (face.isHeads()) {
                countHeads++;
                if (longestRun < countHeads) {
                    longestRun = countHeads;
                }
            } else {
                countHeads = 0;
            }
        }

        System.out.println();
        System.out.println("The longest run of heads is " + longestRun);

    }

}

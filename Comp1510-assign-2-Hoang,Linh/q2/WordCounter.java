package q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Represents a word list that counts the total number of unique words from 
 * the file bible.txt and their occurrences.
 *
 * @author Linh Hoang
 * @version 1.0
 */
public class WordCounter {
    
    /** List of words. */
    private List<Word> wordList; 
    
    /** Constructs the object. */
    public WordCounter() {
        wordList = new ArrayList<Word>();
    }
    
    /** Scans a file and returns the total number of unique Words in the file.
     * @param file as a String
     * @return result as an int
     * @throws FileNotFoundException if the file is not found
     */
    public int parseBook(String file) throws FileNotFoundException {
        Scanner fileScan;
        Scanner lineScan;
        String line;
        
        fileScan = new Scanner(new File(file));
        
        while (fileScan.hasNext()) {
            
            line = fileScan.nextLine();
            lineScan = new Scanner(line);
            lineScan.useDelimiter("[\\W]+");
            
            while (lineScan.hasNext()) {
                
                String currentWord = lineScan.next();
                currentWord = currentWord.toLowerCase();
                Word word = new Word(currentWord);

                if (!checkDuplicates(word, wordList)) {                  
                    wordList.add(word);
                }
            }
        }
        
        return wordList.size();
    }
    
    /**
     * Check for duplicates in the wordList, and increments frequency.
     * @param w as a Word
     * @param l as a List
     * @return true if w exists in l
     */
    public boolean checkDuplicates(Word w, List<Word> l) {
        for (Word word: l) {
            if (word.compareWord(w)) {
                word.increment();
                return true;
            }
        }
        
        return false;
        
    }
    
    /**
     * Prints the top number of words in the list.    
     * @param n as an int
     */
    public void printTopWords(int n) {
        wordList.sort(null);
            
        for (int i = 0; i < n; i++) {
            System.out.println(wordList.get(i));
        }
    }
    
    /**
     * Drives the program.
     * @param args unused
     * @throws FileNotFoundException  if file is not found
     */
    public static void main(String[] args) throws FileNotFoundException {
        final int top = 10;
        WordCounter word = new WordCounter();
        System.out.println("The number of unique words: " 
                + word.parseBook("bible.txt"));
        word.printTopWords(top);
    }
}

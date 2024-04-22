package q2;

/**
 * Class Word represents a word in a list and defines its occurrence.
 * 
 * @author Linh Hoang
 * @version 2024 1.0
 */
public class Word implements Comparable<Word> {

    /** The String representation of a word. */
    private final String word;
    
    /** The frequency of a word. */
    private int frequency;
    
    /** 
     * Constructs the Word object defined by a String in the argument 
     * default frequency by one.
     * @param w as a String
     */
    public Word(String w) {
        word = w;
        frequency = 1;
    }
    
    /** 
     * Returns the String value of the word. 
     * @return word as a String
     */
    public String getWord() {
        return word;
    }
    
    /**
     *  Returns the value of the frequency.
     * @return frequency as an int
     */
    public int getFrequency() {
        return frequency;
    }
    
    /** Increments frequency by 1. */
    public void increment() {
        frequency++;
    }
    
    /** 
     * Returns a String representation of the word and its frequency.
     * @return toString representation
     */
    public String toString() {
        return word + ":\t" + frequency;
    }

    /** 
     * Compares the content of two Word objects.
     * @param obj as a Word object
     * @return true if strings are equal
     */
    public boolean compareWord(Word obj) {
        return this.word.equals(obj.word);
    }
    
    /** 
     * Returns an int representing the result of comparing to this Word.
     * @param another as a Word object
     * @return -1 before, 1 after, and 0 equal 
     */
    public int compareTo(Word another) {
        return Integer.compare(another.frequency, this.frequency);
    }
}

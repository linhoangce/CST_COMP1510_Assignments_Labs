package q3;

/**
 * Represents a single MIXChar character.
 * 
 * @author Linh Hoang
 * @version 1.0
 */
public class MIXChar {
    
    /** Delta unicode. */
    private static final char DELTA = '\u0394';
    
    /** Sigma unicode. */
    private static final char SIGMA = '\u03A3';
    
    /** PI unicode. */
    private static final char PI = '\u03A0';
    
    /** The MIX characters array. */
    private static final char[] MIXCHAR = 
        {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
        'I', DELTA, 'J', 'K', 'L', 'M', 'N', 'O', 
        'P', 'Q', 'R', SIGMA, PI, 'S', 'T', 
        'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', 
        '3', '4', '5', '6', '7', '8', '9', '.', ',', 
        '(', ')', '+', '-', '*', '/', '=', '$', '<', 
        '>', '@', ';', ':', '\''};
    
    
    /** The ordinal value of the MIXChar object. */
    private int value;
    
    /** The MIXChar character. */
    private char mixChar;
    
    /** Constructs the object.
     * @param value as an int 
     * */
    public MIXChar(int value) {
        this.value = value;
        mixChar = MIXCHAR[value];
    }
    
    /** 
     * Constructs the object converting the parameter to a MIX character.
     * @param c as char
     * @throw IllegalArgumentException if conversion not possible
     */ 
    public MIXChar(char c) {
        int i = 0;
        while (isMIXChar(c) && i < MIXCHAR.length) {
            if (c == MIXCHAR[i]) {
                mixChar = c;
            }
            i++;
        }
        if (!isMIXChar(c)) {
            throw new IllegalArgumentException("Not a MIX Character.");
        }
    }
    
    /**
     * Converts this MIX Character to corresponding Java char.
     * @return javaChar as a char
     */
    public char toChar() {
        return MIXCHAR[value];
        
    }
   
    /** 
     * Returns true if a char corresponds to a MIX character.
     * @param c as a char
     * @return true if matching one MIX character
     */
    public static boolean isMIXChar(char c) {
        
        for (char ch: MIXCHAR) {
            if (c == ch) {
                return true;
            }
        }
        return false;
    }
    
  
    /**
     * Returns an array of MIXChar characters corresponding to the chars in s.
     * @param s as a String
     * @return result as a MIXChar[]
     * @throw IllegalArgumentException if any of the string's char does not 
     *                  correspond to MIXChar characters
     */
    public static MIXChar[] toMIXChar(String s) {
        MIXChar[] result = new MIXChar[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            if (isMIXChar(s.charAt(i))) {
                MIXChar ch = new MIXChar(s.charAt(i));
                result[i] = ch;
            } else {
                throw new IllegalArgumentException("The string contains"
                        + " non-MIXChar characters.");
            }
        }
        
        return result;
    }
    
    /**
     * Returns numerical value of this MIXChar.
     * @return result as an int
     */
    public int ordinal() {
        return value;
    }
     
    /**
     * Returns a String representation of this MIXChar.
     * @return the String
     */
    public String toString() {
        return Character.toString(mixChar);
        
    }

    /**
     * Drives the program.
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        
    }
    

}

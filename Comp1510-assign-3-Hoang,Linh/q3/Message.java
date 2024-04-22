package q3;

/**
 * Represents an encoded message that can decoded.
 * 
 * @author Linh Hoang
 * @version 1.0
 */
public class Message {
    
    /** Base 56. */
    public static final int BASE = 56;
    
    /** The maximum number of char that can be packed in one long. */
    public static final int PACKING_MAX_NUM = 11;
    
    /** The array that stores the encode message as longs. */
    private long[] message;
    
    /** Counts the number of characters in the message. */
    private int count;
    
    /** 
     * Constructs the object with a MIXChar parameter.
     * @param m as a MIXChar[]
     */
    public Message(MIXChar[] m) {
        count = m.length;
        
        long eachPack = 0;
        int index = 0;
        int length = (int) Math.ceil((double) m.length / PACKING_MAX_NUM);
        long[] tempMessage = new long[length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < PACKING_MAX_NUM; j++) {
                if (index < m.length && m[index] != null) {
                    MIXChar mixChar = m[index++];
                    long placeVal = (long) mixChar.ordinal();
                    eachPack += placeVal * (long) Math.pow(BASE, j);
                }
            }
            tempMessage[i] = eachPack;
            eachPack = 0;
        }

        message = tempMessage;
    }

    /**
    * Construct the object.
    * @param message as a long
    * @param count as an int
    */
    public Message(long[]message, int count) {
        this.message = message;
        this.count = count;
    }
    
    /** Constructs the object with a String parameter.
     * @param s as String
     */
    public Message(String s) {
        MIXChar[] mixChar = MIXChar.toMIXChar(s);
        long eachPack = 0;
        int index = 0;

        long[] tempMessage = new long[s.length() / PACKING_MAX_NUM + 1];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; i < PACKING_MAX_NUM; j++) {
                if (index < s.length() && mixChar[index] != null) {
                    MIXChar mixCh = new MIXChar(s.charAt(index++));
                    long placeVal = mixCh.ordinal();
                    eachPack += placeVal * (long) Math.pow(BASE, j);
                }
            }
            tempMessage[i] = eachPack;
            eachPack = 0;
        }
        
        message = tempMessage;
       
    }
    
    /**
     * Returns a String representation of the char in the message.
     * @return result as a String
     */
    public String toString() {
        String result = "";
        long quotient = 0;
        int remainder = 0;
        
        for (int i = 0; i < message.length; i++) {
            quotient = message[i];
            
            for (int j = 0; i < PACKING_MAX_NUM; j++) {
                remainder = (int) Long.remainderUnsigned(quotient, BASE);
                MIXChar mixChar = new MIXChar(remainder);
                result += mixChar.toString();
                
                if (quotient != 0) {
                    quotient = Long.divideUnsigned(quotient, BASE);
                }
            }
        }
        
        return result;
    }
    
    /** 
     * Returns a String representation formatted as unsigned integers.
     * @return result as a String
     */
    public String toLong() {
        String result = "";
        
        for (int i = 0; i < message.length; i++) {
            long eachPack = message[i];
            result += Long.toUnsignedString(eachPack) + " ";
        }
        
        return result;
    }
 
}

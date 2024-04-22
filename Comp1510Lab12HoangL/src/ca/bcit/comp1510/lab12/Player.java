package ca.bcit.comp1510.lab12;

/**
 * Represents a player in a team.
 * 
 * @author Linh Hoang
 * @version 1.0
 */
public class Player implements Comparable<Player> {

    /** The name of the player. */
    private final String player;
    
    /** The name of the team. */
    private final String team;
    
    /** The player's jersey name. */
    private final int jerseyNum;
    
    /** Constructs the object defined by three parameter. 
     * @param player as a String
     * @param team as a String
     * @param jerseyNum as an int
     * @throw IllegalArgumentException if the player's name is null or empty
     * @throw IllegalArgumentException if the team's name is null or empty
     * @throw IllegalArgumentException if the player's jersey number is 0
     *              or negative
     */
    public Player(String player, String team, int jerseyNum) {
        if (player == null || player.isEmpty()) {
            throw new IllegalArgumentException("The player's must not "
                    + "be empty.");
        } else {
            this.player = player;
        }
        
        if (team == null || team.isEmpty()) {
            throw new IllegalArgumentException("The team's name must not "
                    + "be empty.");
        } else {
            this.team = team;
        }
        
        if (jerseyNum <= 0) {
            throw new IllegalArgumentException("The player's jersey number "
                    + "must be above 0.");
        } else {
            this.jerseyNum = jerseyNum;
        }
    }
    
    /** Compares the players' jersey number and sort in asccending order.
     * @param player as a Player
     * @return an int
     */
    public int compareTo(Player player) {
        return Integer.compare(this.jerseyNum, player.jerseyNum);
    }
    
    /** Returns a string representation of this Player.
     * @return a String
     */
    public String toString() {
        return "Player: " + player
                + "\nTeam: " + team
                + "\nJersey number: " + jerseyNum;
    }
    
    /**
     * Compares the Object with Player.
     * @param other as Object
     * @return true if they are the same
     */
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        } 
        
        if (this == other) {
            return true;
        }
        
        if (!getClass().equals(other.getClass())) {
            return false;
        }
        
        return ((Player) other).player.equals(this.player) 
            && ((Player) other).team.equals(this.team)
            && ((Player) other).jerseyNum == this.jerseyNum;
           
    }
    
    
}

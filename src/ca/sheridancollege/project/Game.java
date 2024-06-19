/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author Bushra Shaukat, 18-06-2024
 * @author Muhammad Haris, 18-06-2024
 * @author Zawar Sami, 18-06-2024
 */

public abstract class Game {
    private final String gameName; // the title of the game
    
    ArrayList<goPlayer> players; // the players of the game
    
    public Game(String givenName) {
        gameName = givenName;
        players = new ArrayList<goPlayer>(); 
    }

    /**
     * @return the gameName
     */
    public String getGameName() {
        return gameName;
    }
    
    /**
     * @return the players of this game
     * @modifier, Bushra Shaukat, 18-06-2024
     */
    public ArrayList<goPlayer> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     * @modifier, Bushra Shaukat, 18-06-2024
     */
    public void setPlayers(ArrayList<goPlayer> players) {
        this.players = players;
    }
    
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public abstract void play();
    
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();
}//end class
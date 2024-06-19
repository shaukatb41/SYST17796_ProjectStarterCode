/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author Bushra Shaukat, 18-06-2024
 * @author Muhammad Haris, 18-06-2024
 * @author Zawar Sami, 18-06-2024
 */

public class GroupOfCards
{

    //The group of cards, stored in an ArrayList
    //@modifier Bushra Shaukat, 18-06-2024
    //private ArrayList <Card> cards; 
    private ArrayList<goCard> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }

    /**
     * @param givenSize
     * @param newCards this is a reference type variable it get 52 cars
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public GroupOfCards(int givenSize, goDeck newCards)
    {
        size = givenSize;

        Collections.shuffle(newCards.getAllCards());

        cards = new ArrayList<goCard>();

        for (int i = 0; i < givenSize; i++)
        {
            cards.add(newCards.getNewCard());
        }

        shuffle();

        for (goCard num : cards)
        {
            System.out.print(num.toString() + ", ");
        }

    }

    /**
     * @return cards
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public ArrayList<goCard> showCards()
    {
        return cards;
    }

    /**
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public int getSize()
    {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public void setSize(int givenSize)
    {
        size = givenSize;
    }

}//end class
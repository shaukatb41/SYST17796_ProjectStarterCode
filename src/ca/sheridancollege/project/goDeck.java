package ca.sheridancollege.project;

/**
 * @author Bushra Shaukat, 18-06-2024
 * @author Muhammad Haris, 18-06-2024
 * @author Zawar Sami, 18-06-2024
 */

import java.util.ArrayList;
import java.util.Collections;

public class goDeck
{

    private ArrayList<goCard> allCards;

    /**
     *
     * @return allCards
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public ArrayList<goCard> getAllCards()
    {
        return allCards;
    }

    /**
     *
     * @param allCards
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public void setAllCards(ArrayList<goCard> allCards)
    {
        this.allCards = allCards;
    }

    /**
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public goDeck()
    {
        allCards = new ArrayList<goCard>();
        String[] symbols =
        {
            "H", "C", "S", "D"
        };
        String[] asymbols =
        {
            "J", "Q", "K"
        };
        String value;

        int id = 0;

        for (int y = 0; y < 4; y++)
        {
            for (Integer i = 1; i < 14; i++)
            {
                id++;
                switch (i)
                {
                    case 1:
                        value = "A";
                        break;
                    case 11:
                        value = asymbols[0];
                        break;
                    case 12:
                        value = asymbols[1];
                        break;
                    case 13:
                        value = asymbols[2];
                        break;
                    default:
                        value = i.toString();
                        break;
                }

                goCard theCard = new goCard(value, symbols[y]);

                allCards.add(theCard);
            }

            Collections.shuffle(allCards);
        }
    }

    /**
     * @return allCards.size()
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public int size()
    {
        return allCards.size();
    }

    /**
     *
     * @return cardList
     * @modifier Bushra Shaukat, 18-06-2024
     */
    @Override
    public String toString()
    {
        StringBuilder cardList = new StringBuilder();

        for (goCard i : getAllCards())
        {
            cardList.append(i.toString());
            cardList.append(", ");
        }

        return cardList.toString();
        //@modifier Bushra Shaukat, 18-06-2024
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return NextCard();
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public goCard getNewCard()
    {
        goCard nextCard = allCards.get(0);
        // System.out.println(nextCard.toString() + " removed from deck");        
        allCards.remove(0);
        return nextCard;
    }

}
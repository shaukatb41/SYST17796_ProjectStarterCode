package ca.sheridancollege.project;

/**
 * @author Bushra Shaukat, 18-06-2024
 * @author Muhammad Haris, 18-06-2024
 * @author Zawar Sami, 18-06-2024
 */

import java.util.ArrayList;

public final class goPlayer extends Player implements Comparable<goPlayer>
{

    protected String name;
    protected ArrayList<goCard> playCards;
    protected int score;
    protected boolean Right;

    /**
     *
     * @return Right
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public boolean hasRight()
    {
        return Right;
    }

    /**
     *
     * @param playerRight
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public void setRight(boolean playerRight)
    {
        this.Right = playerRight;
    }

    /**
     *
     * @return score
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public int getScore()
    {
        return score;
    }

    /**
     *
     * @param score
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public void setScore(int score)
    {
        this.score += score;
    }

    /**
     * @param name
     * @param pCards
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public goPlayer(String name, ArrayList<goCard> pCards)
    {
        super(name);
        setPlayCards(pCards);
        setRight(true);
    }

    /**
     *
     * @return playCards.size()
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public int getCardSize()
    {
        return playCards.size();
    }

    /**
     * @return playCards
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public ArrayList<goCard> getPlayCards()
    {
        return playCards;
    }

    public void setPlayCards(ArrayList<goCard> playCards)
    {
        this.playCards = playCards;
    }

    /**
     * @return card list
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public StringBuilder getCardsList()
    {
        StringBuilder list = new StringBuilder("");
        Integer i = 0;

        playCards.forEach((Card item) ->
        {
            list.append(item.toString());
        });

        return list;
    }

    /**
     * @modifier Bushra Shaukat, 18-06-2024
     */
    public void checkSerial()
    {
        ArrayList<Card> serial = new ArrayList<>();
        for (goCard PlayerCard : getPlayCards())
        {
            serial.clear();
            for (goCard nextCard : getPlayCards())
            {
                if (PlayerCard.getValue().equals(nextCard.getValue()))
                {

                    if ((serial.indexOf(nextCard) == -1))
                    {
                        serial.add(nextCard);
                    }
                }
            }
        }

        if ((serial.size() > 0) && (serial.size() % 4 == 0))
        {
            System.out.println("\n" + getPlayerID()
                    + " completed the serial.");
            for (Card i : serial)
            {
                System.out.print(i.toString() + ", ");
            }

            float mscor = (serial.size() / 4);

            setScore((int) mscor);

            System.out.println("removed from " + getPlayerID() + "'s deck");
            System.out.println(getPlayerID() + " earned " + (int) mscor + " point");
            System.out.println(getPlayerID() + "'s card count is: " + getCardSize());
            System.out.println(getPlayerID() + "'s new score is: " + getScore());

            getPlayCards().removeAll(serial);

        }

    }

    /**
     * @modifier Bushra Shaukat, 18-06-2024
     */
    @Override
    public void play()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @param o
     * @return difference
     * @modifier Bushra Shaukat, 18-06-2024
     *
     */
    @Override
    public int compareTo(goPlayer o)
    {
        return o.getScore() - this.getScore();
    }

    /**
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj)
    {
        return this == obj;
    }

}
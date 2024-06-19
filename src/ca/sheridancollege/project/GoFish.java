package ca.sheridancollege.project;

/**
 * @author Bushra Shaukat, 18-06-2024
 * @author Muhammad Haris, 18-06-2024
 * @author Zawar Sami, 18-06-2024
 */
public class GoFish
{
 /**
  * @param args 
  * @modifier, Bushra Shaukat, 18-06-2024
  * @modifier, Muhammad Haris, 18-06-2024
  * @modifier, Zawar Sami, 18-06-2024
  * 
  */
    public static void main(String[] args)
    {
        goGame game = new goGame("GoFish");
        game.play();
        try
        {
            game.declareWinner();
        } catch (Exception e)
        {

        }

    }
}
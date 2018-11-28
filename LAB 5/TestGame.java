//Catherine Giannetti and Zoe Lavoie
import java.util.*;
public class TestGame
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String s = "P";
    while (true)
    {
      System.out.println("Enter P: Poker, B: Blackjack, or C, Craps or another letter to exit");
      s = input.next();
      if ((s.equals("P")) || (s.equals("B")) || (s.equals("C")))
      {
        System.out.println("Enter bet");
        int x = input.nextInt();
        PlayGame3 game = null;
        switch (s)
        {
          case "P": game = new Poker(x); break;
          case "B": game = new Blackjack(x); break;
          case "C": game = new Craps(x); break;
          default: break;
        }
        game.play();
      }
      else
      {
        break;
      }
    }
  }
}
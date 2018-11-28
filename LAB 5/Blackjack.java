import java.util.*;
public class Blackjack implements PlayGame3
{
  private int bet;
  public Blackjack()
  {
    bet = 0;
  }
  public Blackjack(int x)
  {
    bet = x;
  }
  public int getBet()
  {
    return bet;
  }
  public void play()
  {
    System.out.println("Playing Blackjack");
    Random r = new Random();
    int x = r.nextInt(2);
    if (x == 0)
    {
      System.out.println("You won $" + bet);
    }
    if (x == 1)
    {
      System.out.println("You lost $" + bet);
    }
  }
}
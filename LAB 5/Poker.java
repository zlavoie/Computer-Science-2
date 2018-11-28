import java.util.*;
public class Poker implements PlayGame3
{
  private int bet;
  
  public Poker()
  {
    bet = 0;
  }
  public Poker(int x)
  {
    bet = x;
  }
  public int getBet()
  {
    return bet;
  }
  public void play()
  {
    System.out.println("Playing Poker");
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
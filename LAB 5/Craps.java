import java.util.*;
public class Craps implements PlayGame3
{
  private int bet;
  public Craps()
  {
    bet = 0;
  }
  public Craps(int x)
  {
    bet = x;
  }
  public int getBet()
  {
    return bet;
  }
  public void play()
  {
    System.out.println("Playing Craps");
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
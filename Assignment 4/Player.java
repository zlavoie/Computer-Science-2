//Zoe Lavoie
import java.util.*;
public class Player
{
  private SlotMachine m;
  public Player()
  {
     m=new SlotMachine();
  }
  public void betOne()
  {
      m.BetOne();
  }
  public void betMax()
  {
      m.BetMax();
  }
  public void coinsOut()
  {
    int coin = m.CoinOut();
    System.out.println("Returning $"+coin);
  }
  public void spin()
  {
    m.Spin();
  }
  public void insert()
  {
    Scanner input=new Scanner(System.in);
    System.out.print("Number of coins: ");
    int n=input.nextInt();
    m.InsertCoin(n);
  }
  public void exitGame()
  {
    System.exit(0);
  }
}

    
    
    
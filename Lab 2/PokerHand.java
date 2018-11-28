public class PokerHand
{
  private Card[] hand;
  private int[] ranks; //0-13 0 is not used
  private int [] suits;
  
  public PokerHand ()
  {
  hand = new Card [5];
  ranks= new int [14];
  suits = new int [4];
  
  Deck d = new Deck();
  for(int x=0;x<5;x++)
  {
  hand [x] = d.dealCard();
  int r = hand[x].getRank();
  ranks[r] = ranks[r]+1;
  int y = hand[x].getSuit();
  suits[y]= suits[y]+1;
  }
  }
  
  public void printHand()
  {
    for (int x=0;x<5;x++)
    {
      System.out.println(hand[x].getName());
    }
  }
  
  public boolean fourOfAKind()
  {
    for(int x = 0;x<13;x++)
    {
      if(ranks[x]==4)
      {
        return true;
      }
    }
    return false;
  }
  
  public boolean fullHouse()
  {
    for(int x=0; x<13; x++)
    {
      if(ranks[x] == 2)
      {
        for(int y = 0; y < 13; y++)
        {
          if(ranks[x] ==3)
          {
            return true;
          }     
        }
      }
      }
    return false;
    }
  
  public boolean flush()
  {
    for (int x = 0; x < 4; x++)
    {
      if (suits[x] == 4)
      {
        return true;
      }
    }
    return false;
  }
  
  }
  
 
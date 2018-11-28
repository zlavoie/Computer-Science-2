//Zoe Lavoie
public class Hand
{
  private Card[] hand;
  private int[] ranks; //0-13 0 is not used
  private int [] suits;
  private int totalscore;
  
  public Hand (int die1, int sum)
  {
   hand = new Card [sum];
  ranks= new int [14];
  suits = new int [4];
  totalscore = 0;
  
  Deck d = new Deck();
  for(int x=0;x<die1;x++)
  {
   hand [x] = d.dealCard();
  int r = hand[x].getRank();
  ranks[r] = ranks[r]+1;
  int y = hand[x].getSuit();
  suits[y]= suits[y]+1;
  }
}
  
   public int getScore(int die1, int sum)
  {
     int aces=0;
     //totalscore=0;
   
     for (int x=0;x<die1;x++)
    {
       System.out.println();
        System.out.print(hand[x].getName()+": ");
      if(hand[x].getRank()==1)
      {
        aces=aces+1;
        if(aces==2)
        {
          return 9999; 
      }
      }
      
      if(hand[x].getRank()==1)
      {
         if ((hand[x].getSuit()==1)||(hand[x].getSuit()== 0)) // if red
         { 
           System.out.print("      -1");
        totalscore = (totalscore)-1;
         }
        if ((hand[x].getSuit()==2)||(hand[x].getSuit()==3))
         {
         System.out.print("       1");
         totalscore = totalscore +1; // if black
         }
      }
      
      if((hand[x].getRank()==11)||(hand[x].getRank()==12)||(hand[x].getRank()==13))
      {
      if ((hand[x].getSuit()==1)||(hand[x].getSuit()== 0))
         { 
        System.out.print("     -10");
        totalscore = (totalscore) -10;
      }
     if ((hand[x].getSuit()==2)||(hand[x].getSuit()== 3))
     {
      System.out.print("      10");
         totalscore = (totalscore) +10;
       }
      }
      
      if((hand[x].getRank() <11)&&(hand[x].getRank() != 1))
      {
      if ((hand[x].getSuit()==1)||(hand[x].getSuit()== 0))
         {
        System.out.print("       -"+hand[x].getRank());
         //System.out.println("numtotal to subtract from "+totalscore);
           totalscore = (totalscore-(hand[x].getRank()));
       }
      if ((hand[x].getSuit()==2)||(hand[x].getSuit()== 3))
      {
         totalscore = totalscore+(hand[x].getRank());
         System.out.print("       "+hand[x].getRank());
      //System.out.println("currentscore: "+totalscore);
      }
      }
    }
    System.out.println(); 
    System.out.println("Your Score is: " + totalscore);
     return totalscore;
  }
   
}

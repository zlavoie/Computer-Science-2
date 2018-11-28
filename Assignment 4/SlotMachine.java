//Zoe Lavoie

import java.util.*;
public class SlotMachine
{
  private boolean play=false;
  private int coins;
  private int currentBet; //(cannot bet more than you have and cannot bet 3)
 
  public SlotMachine()
  {
   coins = 0;
   currentBet = 0;
  }
  
  public void BetOne()
  {
    play = true;
    if(this.coins>0)
    {
    currentBet = currentBet+1;
   this.coins = this.coins-1; 
   System.out.println("You bet " + currentBet + " coin(s)");
    }
    else
    {
      System.out.println("There are no coins in the machine to make a bet.");
    }
  }
  
public void BetMax()//Bet 3 coins
{
  play=true;
  if(coins >2)
  {
    currentBet=currentBet+3;
    coins=coins-3;
    System.out.println("You bet three coins");
  }
  else 
  {
    System.out.println("Sorry! You do not have enough coins to bet this amount!");
  }
}

public void Spin() //Must Spin before player makes bet
{
   System.out.println("S L O T M A C H I N E");
   int y = 0;
  int payout = 0;
  int oldcoin=coins;
  System.out.println();
  if ((play==true)&&(currentBet>0))
  {
  int sevens3 = 0;
  int seven1 = 0;
  int Dollar3 = 0;
  int Dollar2 = 0;
  int Dollar1 = 0;
  int Cherry = 0;
 
 for(int x=0;x<3;x++)
 {
 y=(int)(Math.random()*(17));
 if(y == 0)
 {
  sevens3 = sevens3+1;
   System.out.print("777 ");
 }
 if((y == 1)||(y==2))
 {
   System.out.print("7 ");
   seven1=seven1+1;
 }
  if((y == 3)||(y==4)||(y==5))
  {
    System.out.print("$$$ ");
    Dollar3 = Dollar3+1;
  }
   if((y == 6)||(y==7)||(y==8)||(y==9))
  {
    System.out.print("$$ ");
    Dollar2 = Dollar2+1;
  }
  if((y == 10)||(y==11)||(y==12)||(y==13)||(y==14))
  {
    System.out.print("$ ");
    Dollar1 = Dollar1+1;
  }
  if((y == 15)||(y==16)||(y==17))
  {
    System.out.print("@ "); //cherry
    Cherry = Cherry+1;
  }
 }
 if(sevens3 == 3)
 {
   System.out.println();
   System.out.println("JACKPOT!");
  payout = (currentBet*200);
 }
 if(seven1==3)
 {
  payout = (currentBet*50);
 }
  else if(Dollar3==3)
 {
  payout= (currentBet*30);
 }
 else if(Dollar2==3)
  {
    payout= (currentBet*20);
  }
 else  if(Dollar1==3)
 {
  payout= (currentBet*15);
 }
  else if(Cherry == 1)
   {
     payout=(currentBet*2);
   }
   else  if(Cherry == 2)
   {
     payout=(currentBet*8);
   }
     else  if(Cherry == 3)
   {
     payout=(currentBet*10);
   }
    System.out.println();
    System.out.println("Bet: "+currentBet);
    System.out.println("Payout: "+ payout);
    System.out.println("Cash Remaining In Machine: "+ (coins+payout));
    
    coins=coins+payout;
                     }
 else
 {
   System.out.println("You did not make a bet before playing");
 }
}

public int CoinOut()
{
  return coins;
}

public void InsertCoin(int num) //insert coins
  {
    this.coins = this.coins + num;
    System.out.println("You have "+coins+" Coins.");
  }

}
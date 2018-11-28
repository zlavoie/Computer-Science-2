//Zoe Lavoie
public class DICE
{
  private int dice1;
  private int dice2;
  private int total = 0;
  
  public DICE()
  {
    dice1 = 0;
    dice2 = 0;
  }
  
  
  public int roll()
  {
    
   dice1 = (int)((Math.random()*6)+1);
   dice2 = (int)((Math.random()*6)+1);
  
   total = dice1 + dice2;
   
   return total;
   
  }
 }

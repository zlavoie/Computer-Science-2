//Zoe Lavoie
public class CandyCard implements Move
{
  protected int card;
  protected String color = "";
  
  public CandyCard()
  {
    int x=(int)(5*Math.random()+1);
   
    if (x == 1)
    {
      card = 1;
      color = " Blue ";
      
    }
    else if (x == 2)
    {
      card = 2;
      color = " Green ";
      
    }
    else if (x == 3)
    {
      card = 3;
      color = " Yellow ";
    }
    else if (x == 4)
    {
      card = 4;
      color = " Brown ";
    }
    else if(x == 5)
    {
      card = 5;
      color = "Pink ";
      
    }
  }
  
  public int GetValue()
  {
    System.out.print(color);
    
    return card;
  }
  
  public void display()
  {
    System.out.print("Candy Card  ");
  }
}
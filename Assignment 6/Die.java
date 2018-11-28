//Zoe Lavoie

public class Die implements Move
{
  protected int y;
  protected int dice;
  
  public Die(int choose)
  {
    y =choose;
    int a=(int)(y*Math.random()+1);
    dice=a;
  }
  public int GetValue()
  {
    int a=(int)(y*Math.random()+1);
   return a;
  }
  public void display()
  {
    System.out.print("The die rolled was a  ");
  }
    
}
    
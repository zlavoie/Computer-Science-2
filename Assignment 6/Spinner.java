//Zoe Lavoie
public class Spinner implements Move
{
  protected int y;
  protected int spin;
  
  public Spinner(int choose)
  {
    y=choose;
    int a=(int)(y*Math.random()+1);
    spin=a;
  }
  
  public int GetValue()
  {
    int a=(int)(y*Math.random()+1);
   return a;
  }
  
  public void display()
  {
    System.out.print("Number spun: ");
  }
}
    
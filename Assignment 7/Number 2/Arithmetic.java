//Zoe Lavoie
public class Arithmetic extends Exception
{
  public static int add(int z, int y) throws OverflowException, UnderflowException
  {
    if(z>0 && y>0 && (z+y)<0)
    {
      OverflowException e = new OverflowException();
      throw e;   
    }
    
    else if(z<0 && y<0 && (z+y)>0)
    {
      UnderflowException e = new UnderflowException();
      throw e;
    }
     
    else
    {
    return z+ y;
    }
  }
}
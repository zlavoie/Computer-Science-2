  //Zoe Lavoie
public class Box implements Comparable
{
  protected int Length;
  protected int Width;
  protected int Height;
  
  public Box()
  {
    Width=0;
    Height=0;
    Length=0;
  }
  public Box(int Width, int Height, int Length)
  {
    this.Width = Width;
    this.Height = Height;
    this.Length=Length;
  }
 
  public double getWidth()
  {
    return Width;
  }
  public void setWidth(int Width)
  {
    this.Width=Width;
  }
  
  public double getHeight()
  {
    return Height;
  }
  
  public void setHeight(int Height)
  {
    this.Height=Height;
  }
  
   public double getLength()
  {
    return Length;
  }
  public void setLength(int Length)
  {
    this.Length=Length;
  }
  
  public int Volume()
  {
    int volume = Height*Width*Length;
    return volume;
  }
  
public int compareTo(Object o)
  {
    if (this.Volume() > ((Box)o).Volume())
    {
         return 1;
    }
    if (this.Volume() < ((Box)o).Volume())
    {
         return -1;
    }
         return 0;
     }
  
  public String toString()
  {
    String s = "";
    s =("Box: Length ="+getLength()+" Width: "+getWidth()+" Height: "+getHeight()+" Volume: "+Volume());
    return s;
  }
}
public class Box extends Container
{
  protected double Width;
  protected double Depth;
  protected double Cost;
  protected double Size;
  
  public Box()
  {
    super();
    Width=0;
    Depth=0;
  }
 
  public Box(double length, double Width, double Depth)
  {
    super(length);
    this.Width = Width;
    this.Depth = Depth;
  }
  
  public double getWidth()
  {
    return Width;
  }
 
  public void setWidth(double Width)
  {
    this.Width=Width;
  }
 
  public double getDepth()
  {
    return Depth;
  }
 
  public void setDepth(double Depth)
  {
    this.Depth=Depth;
  }
 
  public double getSize()
  {
    Size = length+Width+Depth;
    return Size;
  }
 
  public double getCost()
  {
   Cost = ((0.35)*(getSize()));
   Cost = (Math.round(100*Cost)/100.00);
   return Cost;
  }
  
  public String toString()
  {
    return ("Shape: Box" + "  |Cost: "+ getCost() + " |Size: "+ getSize() + "inches   |Length: " + length+ "inches |Width: "+Width+"inches |Depth: "+Depth+" inches");
}
}
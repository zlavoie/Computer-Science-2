//Zoe Lavoie and Catherine Giannetti
public class Tube extends Container
{
  protected double Radius; 
  protected final double pi = 3.1415;
  protected double Cost;
  protected double Size;
  
  public Tube()
  {
    super();
    Radius = 0; 
  }
  
  public Tube (double Radius, double length)
  {
    super(length);
    this.Radius = Radius;
  }
  
    public void setRadius(double Radius)
  {
    this.Radius = Radius;
  }
    
  public double getRadius()
  {
    return Radius;
  }
  
  public double getSize()
  {
    Size = (2*pi*Radius) + length;
    Size = (Math.round(100*Size)/100.00);
    return Size;
  }
  
  public double getCost()
  {
    Cost = getSize()*(0.25); 
    Cost = (Math.round(100*Cost)/100.00);
    return Cost;
  }
                    
  public String toString()
  {
     return "Shape: Tube" + "  |Cost: "+ getCost() + "   |Size: " + getSize() + "inches  |Length: " + length + "inches   |Radius: " + Radius;
  }
}
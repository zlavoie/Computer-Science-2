public abstract class Container implements Comparable
  //Zoe Lavoie
{
  protected double length; //example in notes says this was protected
  
  public Container()
  {
    length = 0;
  }
  
  public Container (double length)
  {
    this.length = length;
  }
  
  public abstract double getSize();
  
  public abstract double getCost();
  
  public double getLength()
  {
    return length;
  }
  
  public void setLength(double length)
  {
    this.length = length;
  }
  
  public int compareTo(Object o)
  {
    if (this.getCost() > ((Container)o).getCost())
         return 1;
    if (this.getCost() < ((Container)o).getCost())
         return -1;
     return 0;
     }
     
}
  
  
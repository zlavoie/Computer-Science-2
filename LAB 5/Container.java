  //Zoe Lavoie and Catherine Giannetti

public abstract class Container implements Comparable
{
  protected double length; 
  
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
  
  public int compareTo(Object o)
  {
    if (this.getCost() > ((Container)o).getCost())
         return 1;
    if (this.getCost() < ((Container)o).getCost())
         return -1;
        return 0;
     }
     
}
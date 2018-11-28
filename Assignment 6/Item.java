//Zoe Lavoie
public abstract class Item 
{
  protected int ID;
  protected double Price;
  protected boolean current; 
  protected String Name;
  protected String Title;
  
  public Item()
  { 
    Price = 0.0;
    ID = 000;
    Title = "";
    Name = "";
    current = true;
  }
  
  public Item(int ID, String Title, double Price, boolean current, String Name)
  {
    this.ID = ID;
    this.Title = Title;
    this.Price = Price;
    this.current = current;
    this.Name = Name;
  }
  
    public void setTitle(String Title)
  {
    this.Title=Title;
  }
  
  public String getTitle()
  {
    return Title;
  }
  
  public void setId(int ID)
  {
    this.ID=ID;
  }
  
  public int getId()
  {
    return ID;
  }
  
  public void setCost(double Price)
  {
    this.Price=Price;
  }
  
  public double getCost()
  {
    return Price;
  }
  
  public void setStatus(boolean current)
  {
    this.current=current;
  }
  
  public boolean getStatus()
  {
    return current;
  }
  
  public void setName(String Name)
  {
    this.Name=Name;
  }
  
  public String getName()
  {
    return Name;
  }
  
  public void display()
  {
    System.out.println("Doesn't Work!");
  }
}
    
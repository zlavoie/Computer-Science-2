//Zoe Lavoie
public class VideoGame extends Item
{
  protected int MinAge;
  
  public VideoGame()
  {
    super();
    MinAge = 0;
  }
  
  public VideoGame(int ID, String Title, double Price, boolean current, String Name, int MinAge)
  {
    super(ID, Title, Price, current, Name);
    this.MinAge = MinAge;
  }
  
   public int getMinAge()
  {
    return MinAge;
  }
   
  public void setMinAge(int MinAge)
  {
    this.MinAge=MinAge;
  }
  
 
  
  public void display()
  {
   System.out.println( ID + " " + Title + " " + Price + " " + current + " " + Name + " " + MinAge);
  }
} 
//Zoe Lavoie
public class Movie extends Item
{
  protected String review;
  protected String genre;
  protected int runTime;
  
  public Movie()
  { 
    super();
    review="G";
     genre= "V";
    runTime=0;
  }
  public Movie(int ID, String Title, double Price, boolean current, String Name, int runTime, String review, String genre)
  {
    super(ID, Title, Price, current, Name);
    this.runTime=runTime;
    this.review=review;
    this.genre=genre;
  }
  
  public int getRunTime()
  {
    return runTime;
  }
  
  public void setRunTime(int runTime)
  {
    this.runTime = runTime;
  }
  
    public String getRating()
  {
    return review;
  }
    
  public void setRating(String review)
  {
    this.review = review;
  }
  
 public String getType()
  {
    return genre;
  }
 
  public void setType(String genre)
  {
    this.genre = genre;
  }
 
  
  public void display()
  {
    System.out.println(ID + " " + Title + " " + Price + " " + current + " " + Name + " " + runTime + " " + review + " " + genre);
  }
}
  


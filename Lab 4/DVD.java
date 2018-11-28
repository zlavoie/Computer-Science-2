//Zoe Lavoie and Catherine Giannetti
public class DVD extends Media
{
  protected int runtime;

  public DVD(String title, int runtime)
  {
    super(title);
    this.runtime=runtime;
  }
  
  public int getRuntime()
  {
   return runtime; 
  }
  
  public String getTitle()
  {
   return title;  
  }
  
  
  
}
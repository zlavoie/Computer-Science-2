public class Book extends Publication
{
  protected String Author;
  
  public Book ()
  {
    super();
    Author = "";
  }
  
  public Book (String Publisher, int PagesNum, double Price, String Title, String Author)
  {
    super (Publisher, PagesNum, Price, Title);
    this.Author=Author;
   }
  
  public String toString()
  {
    return super.toString() + "  Author:  " + Author;
  }
}
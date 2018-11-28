//Zoe Lavoie and Catherine Giannetti
public class Book extends Media
{
  protected String author;
  
  public Book(String title, String author)
  {
    super(title);
    this.author = author;
  }
  public String getAuthor()
  {
   return author; 
  }
  
  public String getTitle()
  {
    return title;
  }
}
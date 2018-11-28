public class Magazine extends Publication
{
  protected String publicationInfo;
  
  public Magazine()
  {
    super();
    publicationInfo = "";
  }
  
  public Magazine (String Publisher, int PagesNum, double Expense, String Title, String publicationInfo)
  {
    super(Publisher, PagesNum, Expense, Title);
    this.publicationInfo = publicationInfo;
  }
    
  
  public String toString()
  {
      return super.toString() + "  publication Info:  " + publicationInfo;
  }
}
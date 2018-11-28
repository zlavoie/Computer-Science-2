public class KidsMagazine extends Magazine
{
  protected int min;
  protected int max;
  
  public KidsMagazine()
  {
    super();
    min = 0;
    max = 0;
  }
  
  public KidsMagazine (String Publisher, int PageNum, double Expense, String Title, String publicationInfo, int min, int max)
  {
    super(Publisher, PageNum, Expense, Title, publicationInfo);
    this.min = min;
    this.max = max;
  }
    
  public String toString()
  {
      return super.toString() + "   min end of age range: " + min + "     max end of age range: " + max;
  }
}
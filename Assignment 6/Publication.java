public abstract class Publication implements Comparable
{
  protected double Expense;
  protected String Title;
  protected String Publisher;
  protected int PageNum;
  
  public Publication ()
  {
    Publisher = "";
    PageNum = 0;
    Expense = 0.0;
    Title = "";
  }
  
  public Publication (String Publisher, int PageNum, double Expense, String Title)
  {
    this.Publisher = Publisher;
    this.PageNum = PageNum;
    this.Expense = Expense;
    this.Title = Title;
  }
  
  public int compareTo(Object o)
  {
    return Title.compareTo(((Publication)o).Title);
  }
  
  public String toString()
  {
    return "Publisher:  " + Publisher+ "  number of Pages:  " + PageNum + "   Expense:  " + Expense + "   Title:  " + Title;
  }
}
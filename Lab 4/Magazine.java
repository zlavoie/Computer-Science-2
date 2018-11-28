//Zoe Lavoie and Catherine Giannetti
class Magazine extends Media
{
  protected int issue;
  
  public Magazine(String title, int issue)
  {
    super(title);
    this.issue=issue;
  }
  public int getIssue()
  {
    return issue;
  }
  
  public String getTitle()
  {
    return title; 
  }
}
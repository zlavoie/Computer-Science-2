//Zoe Lavoie and Catherine Giannetti
abstract class Media
{
 protected String title;

 public Media()
 {
 title = "";
 }

 public Media (String Title)
 {
  title = Title;
 }
  
 public abstract String getTitle();
}
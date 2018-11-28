//Zoe Lavoie and Catherine Giannetti
import java.util.*;
public class Library
{
  protected Media [] media;
  
  public Library()
  {
        media = new Media[5]; 
        media[0] = new DVD("The Martian",124);
        media[1] = new Book("The Hobbit ", "Tolkein");
        media[2] = new Magazine( "Time ", 8654);
        media[3] = new Book( "Carrie ", "King");
        media[4] = new DVD( "Star Wars ", 137);
  }
  
 public void information(Media m)
    {
   if(m instanceof DVD)
   {
     System.out.println(((DVD)m).getTitle()+((DVD)m).getRuntime());
   }
   if(m instanceof Book)
   {
     System.out.println(((Book)m).getTitle()+((Book)m).getAuthor());
   }
   if(m instanceof Magazine)
   {
     System.out.println(((Magazine)m).getTitle()+((Magazine)m).getIssue());
   } 
   else
   {
     System.out.println("Error");
   }
    }
 
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       Library l = new Library();
       
       System.out.println("Please type in the index of the array (0-4) what you would like to access: ");
      int index = scan.nextInt();
    

         while(index < 998)
         {
               l.information(l.media[index]);      // pass the  Media object to information (what Media object?????)
               System.out.println( "Please type in the index of the array (0-4) what you would like to access: ");         // prompt for another array index
               index = scan.nextInt(); 

           }             
    }
}
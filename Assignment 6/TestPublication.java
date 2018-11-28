import java.util.*;
import java.io.*;
public class TestPublication
{
  public static void main (String[] args) throws IOException
  {
    String a;
    String Publisher;
    int PagesNum;
    double Price;
    String Title;
    String publicationInfo;
    
    Publication [] pub = new Publication [10];
   
    File myFile = new File ("publications.txt");
    
    if (! myFile.exists())
    {
      System.out.println("File does not exist");
      System.exit(0);
    }
    
    Scanner input = new Scanner (myFile);
    Publication publish;
    int num = 0;
    while (input.hasNext())
    {
      a = input.next();
      
      if (a.equals("1"))
      {
        String pubUnit;
        
        Publisher = input.next();
        PagesNum = input.nextInt();
        Price = input.nextDouble();      
        Title = input.next();
        publicationInfo = input.next();

        publish = new Magazine(Publisher, PagesNum, Price, Title, publicationInfo);
      }
      
      else if (a.equals("2"))
      {
        String Author;
        
        Publisher = input.next();
        PagesNum = input.nextInt();
        Price = input.nextDouble();
        Title = input.next();
        Author = input.next();
        
        publish = new Book (Publisher, PagesNum, Price, Title, Author);
      }
        
      else 
      {
        int low;
        int high;
        
        Publisher = input.next();
        PagesNum = input.nextInt();
        Price = input.nextDouble();
        Title = input.next();
        publicationInfo = input.next();
        low = input.nextInt();
        high = input.nextInt();
        
        publish = new KidsMagazine(Publisher, PagesNum, Price, Title, publicationInfo, low, high);
      }
    
      pub[num] = publish;
      num++;
    }
    
    SelectionSort.selectionsort((Comparable[]) pub, pub.length);
    
    for (int i = 0; i < 10; i++)
    {
     
      System.out.println((i+1) + "  " + pub[i].toString());
    }
    input.close();
  }
}
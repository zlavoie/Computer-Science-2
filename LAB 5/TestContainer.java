import java.util.*;
//Zoe Lavoie and Catherine Giannetti

public class TestContainer 
{
  public static void main (String[] args)
  {
        int answer ;
    Scanner scan = new Scanner(System.in);
    Container boxes;
    Container array [] = new Container [10];
    
    for (int i = 0; i < 10; i++) // For ten container objects
    {
    
     do
     {
      System.out.println("Do you want to make a box or a tube? Enter 0 for box and 1 for tube.");
       answer = scan.nextInt();
     }while ((!(answer ==0)) && (!(answer == 1))); 
    
      
    if (answer == 0)//box
    {
      
      System.out.println("Enter the Length");
      double l = scan.nextInt();
      System.out.println("Enter the Width");
      double w = scan.nextInt();
      System.out.println("Enter the Depth");
      double d = scan.nextInt();
      array[i] = new Box(l,w,d); // stores 10 box objects in this array
    }
    
    else if(answer==1) //tube
    {
      
      System.out.println("Enter the Radius");
      double radius = scan.nextInt();
      System.out.println("Enter the Length");
      double length = scan.nextInt();
      array[i] = new Tube(radius, length); // stores 10 tube objects in this array
    }
  }
  SelectionSort.sort(array, 10);
  for (int i = 0; i < 10; i++)
  {
    System.out.println(array[i]);
  }
  }
}
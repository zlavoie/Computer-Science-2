//Zoe Lavoie
import java.util.*;
public class Counter
{
  public int counter;
  
  public Counter()
  {
    counter = 0; 
  }
  
  public Counter(int num)
  {
    Scanner scan = new Scanner(System.in);
    if(num>0)
    {
    counter = num;
    }
    else
    {
      while(num < 0 )
      {
      System.out.println("Counter needs to be set to a non-negative number");
      num = scan.nextInt();
      }
    }
  }
  
  public void AddOne()
  {
    counter = counter+1;
  }
  
  public void SetZero ()
  {
    counter = 0;
  }

  public int GetCount()
  {
    return counter;
  }
  
 public static void main(String[] args) //To implement counter class
  {
   int answer = 3;
   Scanner input = new Scanner(System.in);
Counter c = new Counter();
System.out.println("Please input an integer followed by enter. Once a zero is entered the sequence will end");

while (answer!=0)
{
  answer = input.nextInt();
  if(answer != 0)
  {
  c.AddOne();
  }
}
   System.out.println("The number of non-zero positive integers: "+c.GetCount());
 }
}
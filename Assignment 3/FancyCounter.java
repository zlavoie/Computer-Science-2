//Zoe Lavoie
import java.util.*;
public class FancyCounter extends Counter
{
  public FancyCounter()
  {
    super();
  }
  
    public FancyCounter(int num)
  {
    super(num);
  }
  
 public void Decrement()
 {
   counter = counter-1;
 }
 
  public static void main(String[] args)
  {
   int answer = 3;
   Scanner input = new Scanner(System.in);
FancyCounter d = new FancyCounter();
//To implement Fancy Counter Class
System.out.println("Please input a positive or negative integer and press enter. Once a zero is entered the sequence will end");

while (answer!=0)
{
  answer = input.nextInt();
  if(answer != 0)
  {
  d.AddOne();
  }
  if (answer<0)
  {
    d.Decrement();
  }
}
   System.out.println("The number of positive integers entered: "+d.GetCount());
 }
  
}
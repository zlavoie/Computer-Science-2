//Zoe Lavoie
import java.util.*;
public class BalancedString
{
  public String str;
  public FancyCounter counter;
  
  public BalancedString()
  {
    counter = new FancyCounter();
    str = "";
 counter.SetZero();
  }
  
   public BalancedString(String s)
  {
     counter = new FancyCounter();
    str = s;
    counter.SetZero();
  }
   
   public boolean balanced()
   {
    for(int x=0; x<str.length();x++)
    {
    char h = str.charAt(x);
    if(h == ')')
    {
      counter.Decrement();
         }
    else if (h=='(')
    {
      counter.AddOne();
    }
}
    if (counter.GetCount() == 0)
    {
     return true;
    }
    if (counter.GetCount() <0)
    {
    return false;
    }
    return false;
}
   
   public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   String stringy;
   System.out.println("Please input a string with parenthesis to see if it is balanced: ");
   stringy=input.next();
BalancedString s = new BalancedString(stringy);
//To implement Fancy Counter Class
System.out.println();
   System.out.print("The string entered is ");
   if(s.balanced()== true)
   {
     System.out.print("balanced");
     System.out.println();
   }
   else
   {
     System.out.print("unbalanced");
     System.out.println();
 }
}
}
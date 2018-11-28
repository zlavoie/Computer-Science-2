//Zoe Lavoie and Catherine Gianetti
import java.util.*;
  
  public class Brackets
{
  public static char match(char s)
  {
    if (s == '}' )
    {
      return '{';
    }
    else if (s == ']' )
    {
      return '[';
    }
    else 
    {
      return '(';
    }
  }
  
  public static boolean isBalanced(String s)
  {
    Stack<Character> a = new Stack<Character>(100);
    int n = s.length();
    boolean error = false;   
    
    for (int i = 0; i < n; i++)
    {
        char ch = s.charAt(i); 
       if (ch == '{' || ch == '(' || ch == '[' )
       {
         a.push(ch);  
       }  
       else if (ch == '}' || ch == ')' || ch == ']')
       { 
         if (a.empty() || a.peek() != match(ch))
         {
         error = true;
         break;
         }
           a.pop();
       }
       }
       
    
    if (!error && a.empty())
    {
      return true;
    }
    else
    {
      return false;
    }
    }

public static void main(String[] args)
    { 
         Scanner input = new Scanner(System.in);
         System.out.print("Enter an experssion (xxx to exit): ");
         String s = input.nextLine();
         while(!s.equals("xxx"))
         {
                 if (isBalanced(s))
                 {
                   System.out.println("Balanced");
                 }
                 else
                 {
                     System.out.println(" Not Balanced");
                 System.out.print("Enter an experssion: ");
                 s = input.nextLine();
                 }
        }
  }
}

       
       
       
       
       
       
//Zoe Lavoie
import java.util.*;

public class Reverse3
{
  public static String reverse(String s)
  {
    String a;
    String here= "";
    
    try
    {
     int num = 0;
      
      for(int r=0;r<s.length();r++)
       {
           if(!Character.isDigit(s.charAt(r)) && !Character.isLetter(s.charAt(r)) && !Character.isWhitespace(s.charAt(r)))
        { 
         throw (new IllegalCharacterException("Illegal character in string at spot "+r));
        }
       
       }
      for(int r = s.length() - 1;r >= 0;r--)
        here = here+ s.charAt(r);
      }
    
      catch(IllegalCharacterException e) 
      {
        System.out.println(e.getMessage()); 
      }
    return here;
    
  } 
  
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String a = input.nextLine();
    System.out.println(reverse(a));
      
   }
 }
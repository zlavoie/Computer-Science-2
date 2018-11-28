//Zoe Lavoie
import java.util.*;

public class Reverse2
{
  public static String reverse(String s)
  {
    String a;
    String here = "";
    
    for(int i = s.length() - 1; i >= 0; i--)
    {
      a = ""+s.charAt(i); 
      here = here + a;
    }
    
   return here; 
  }
  
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String l = input.nextLine();
    
    try
    {
      
     for(int r= 0;r < l.length(); r++)
     {
      if(!Character.isDigit(l.charAt(r)) && !Character.isLetter(l.charAt(r)) && !Character.isWhitespace(l.charAt(r)))
      {
        throw (new IllegalCharacterException("Illegal character in string at spot "+r));
      }
     }
     System.out.println(reverse(l));
    }
    
      catch(IllegalCharacterException e)  //catches exception
      {
        System.out.println(e.getMessage()); 
        
      }
      
  }
}
//Zoe Lavoie
import java.util.*; 

public class TheJumble
{
public static void main(String[] args)
{
     Scanner input = new Scanner(System.in);
     System.out.print("Enter a word use XXX to end the program: ");
     String word = input.nextLine();
     while (!word.equals("XXX"))
     {
          System.out.println("The jumbled word is "+jumble(word));
          System.out.print("Enter a word use XXX to end the program: ");
          word = input.nextLine();
      }
}

public static String jumble(String word)
{
 StringBuilder a = new StringBuilder(word);
    
    for( int i=0 ; i<9 ; i++ )
    {
int random = (int)(Math.random()*a.length());
char temp = a.charAt(0);
 a.setCharAt(0, a.charAt(random));
 a.setCharAt(random, temp);
    }       
String jumbled = a.toString();
 return jumbled;
}

}
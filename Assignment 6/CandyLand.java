// Zoe Lavoie
import java.util.*;
public class CandyLand 
{
  public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Welcome to the game!");
      int Done = 0;
     
      do
      {
        System.out.println("Enter 1 to roll the die, ");
        System.out.println("Enter 2 to spin the spinner, ");
        System.out.println("Enter 3 to draw the Candy Card.");
        
        int Choice = 9;
        
        while((Choice < 1) || (Choice > 3))
        {
          Choice = input.nextInt();
        }
        Move m;
        
        if (Choice == 1)
        {
          System.out.println("Choose a 6, 8, 12, or 20 sided dice and the program will roll it!");
          while((Choice != 6) && (Choice != 8) && (Choice != 12) && (Choice != 20))
          {
            System.out.println("Sides:");
            Choice=input.nextInt();
          }
          m = new Die(Choice);
        }
        else if (Choice == 2)
        {
        System.out.println("Pick a spinner with 4, 7,or 9 slots to spin.");
          while((Choice != 4) && (Choice != 7) && (Choice != 9))
          {
            System.out.println("Slot Choice:");
            Choice=input.nextInt();
          }
          m = new Spinner(Choice);
        }
        else
        {
          m = new CandyCard();
        }
        
        int num = m.GetValue();
        m.display();
        System.out.print(num+".");
        System.out.println(" To finish the game press 1, or enter any other number to continue.");
        
        Done=input.nextInt();
      }while(Done!=1);
      System.out.println("Thanks for playing! Hope you had fun!");
    }
}
          
          
        
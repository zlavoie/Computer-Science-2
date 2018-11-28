//Zoe Lavoie
import java.util.*;
public class PlayNim
{
  private String player1 = "";
  private String player2 = "";
  private int turn;
  private int numPiles;
  private int chosenPile;
  private  int chosenSticks;
  private Nim nim;
  private int[] piles;
  
  
  private Scanner input = new Scanner(System.in);
  
  public PlayNim() //default constructor
  {
    System.out.println("Player 1 Name: ");
    player1 = input.next();
    
    System.out.println("Player 2 Name: ");
    player2 = input.next();

    turn = 1; 
    
    System.out.println("How many piles in the game?: ");
     numPiles = input.nextInt();
    
    piles = new int [numPiles];
    
    for (int i = 0; i<numPiles; i++)
    {
      System.out.println("How many sticks per pile?: ");
      piles [i] = input.nextInt(); 
    }
    
    nim = new Nim (numPiles, piles); 
  }
  
   public void play() 
   {
      
   
     
       for (int i = 0; i< 2; i++)
       {
         nim.printPiles();
         if (nim.gameOver() == true)
         {
           if (i == 0)
           {
             System.out.println();
             System.out.println(player1 + " wins the game!");
           }
           else
           {
             System.out.println();
             System.out.println(player2 + " wins the game!");
           }
           i = 100;
         }
         else if (i == 0 && !nim.gameOver())
         {
           System.out.println(player1 + "'s turn!");
       
           System.out.println("Pile: ");
           chosenPile = input.nextInt();
       
           System.out.println("Sticks: ");
           chosenSticks = input.nextInt();
       
           nim.remove(chosenPile, chosenSticks);
         }
         
         else if (i == 1 && !nim.gameOver())
         {
           System.out.println(player2 + "'s turn!");
       
           System.out.println("Pile: ");
           chosenPile = input.nextInt();
       
           System.out.println("Sticks: ");
           chosenSticks = input.nextInt();
       
           nim.remove(chosenPile, chosenSticks);
         }
       }
     
   }
}
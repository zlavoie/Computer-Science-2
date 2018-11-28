// Zoe Lavoie
import java.util.*;

public class PlayGame
{
  private String player1;
  private String player2;
  private int turn;
  private Game game;
  private Scanner input = new Scanner (System.in);
  
  public PlayGame() //Default Constructor
  {
    System.out.println();
    System.out.println("Player1 Name: ");
     player1 = input.next();
    System.out.println("Player2 Name: ");
     player2 = input.next();
      
   System.out.println("How many piles do you want in the game?: ");
   int newpiles = input.nextInt();
   int numpiles [] = new int[newpiles];
   
   System.out.println("How many sticks per pile do you want?: ");
   for (int x =0; x<newpiles; x++)
    {
     System.out.println("Pile " +x+": ");
     numpiles[x] = input.nextInt();
    } 
  game = new Game (newpiles, numpiles);
  }
  
  public void play()
  { 
    int turn =1;
    while(game.gameOver() == false)
    {
   if(turn==1)
   {
     System.out.println();
     System.out.println(player1+"'s turn!:");
   }
   if(turn==2)
   {
     System.out.println();
     System.out.println(player2+"'s turn:");
   }
    game.printPiles();
    System.out.println("What Pile?: ");
    int pile = input.nextInt();
    System.out.println("Number of Sticks to Remove: ");
    int stick = input.nextInt();
    game.remove(pile, stick);
   
    if(game.gameOver()==true){
     System.out.println();
     if(turn==1)
     {
      System.out.println(player1+" Won!"); 
         System.out.println();
     }
     if (turn==2)
     {
      System.out.println(player2+" Won!"); 
     }
    System.out.println();
    }
    if(turn == 1) {
      turn = 2; }
    else if (turn==2){
      turn = 1;}
    }
  }
  
public static void main (String [] args)
{
  boolean play = true;
  Scanner scan = new Scanner(System.in);
   int answer=3;
  while (answer!=0)
  {
    PlayGame game = new PlayGame();
    game.play();
    System.out.println("Would you like to play again? (1 = yes, 0 = no)");
    answer = scan.nextInt();
}
}

}
  
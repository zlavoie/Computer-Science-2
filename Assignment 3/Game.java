//Zoe Lavoie
import java.util.*;
public class Game
{
  private Game game;
  private int numWon=0;
  private int numLost=0;
  private  int numGames=numWon+numLost;
  
public Game()
{
  System.out.println("Welcome to Dice 'em and Deal ' em!");

}
  
public void play() 
  { 
  Scanner scan = new Scanner(System.in);
  Dice die = new Dice();
  int sum = die.getTotal();
  int die1 = die.getDice1();
    System.out.println("Press any key and enter to roll the dice: ");
    scan.hasNext();
    System.out.println("You rolled a "+die1);
    Scanner input = new Scanner(System.in);
    System.out.println("Press any key and enter to deal "+die1+" cards: ");
    input.hasNext();
    System.out.println("Your cards and scores are: ");
/* System.out.println("die1:" +die1);
 System.out.println("sums: "+sum);
 System.out.println(); */
 
  Hand h = new Hand(die1, sum);

 int total = h.getScore(die1, sum);
  
numGames = numGames+1;
if(total == 9999)
{
  System.out.println("Automatic Win!");
  numWon=numWon+1;
}
if ((total >0)&&(total<9999))
{
  System.out.println();
  System.out.println("Congratulations! You Won!");
 numWon=numWon+1;
}
else if ((total<0)&&(total<9999))
{
  System.out.println();
  System.out.println("Sorry! You lost!");
  numLost=numLost+1;
}
  }

    public void result()
  { 
 System.out.println("Game Summary:");
System.out.println("Number of Games Won: "+numWon);
System.out.println("Number of Games Lost: "+numLost);
System.out.println("Total Number of Games: "+numGames);
System.out.println();
  }
    
public static void main (String [] args)
{
  Scanner scan = new Scanner(System.in);
   int answer=3;
  Game game = new Game(); 
  do
  {
    System.out.println();
    game.play();
    System.out.println("Would you like to play again? (1 = yes, 0 = no)");
    answer = scan.nextInt();
}
while (answer!=0);
  game.result();
}
}
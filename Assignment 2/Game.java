//Zoe Lavoie
import java.util.*;

public class Game
{
  private int numPiles; //Number of piles
  private int [] piles = new int[100000]; //An array holding the number of sticks in each pile
  
  public Game() //Default Constructor
  {
    numPiles=3;
    
    for (int x=0;x<numPiles;x++)
    {
      piles [x]=10;
    }
  }
  
  public Game(int numberPiles, int [] stickpiles)
  {
   
    numPiles = numberPiles;
    for ( int x = 0; x<numberPiles;x++)
    {
      piles [x] = stickpiles [x];
    }
  }
  
  public void remove (int pile, int numSticks) // pile is pile number, numSticks is how many to remove
  {
    if((numSticks<1)||(numSticks>(piles[pile])))
    {
      System.out.println("Invalid input, must remove at least 1 stick, and no more than what is in the pile");
    Scanner input = new Scanner (System.in);
      numSticks = input.nextInt();
    }
    piles [pile] = (piles [pile])- numSticks;
  }
  
  public boolean gameOver()
  {
    int counterPile = numPiles;
    for(int x = 0; x<numPiles; x++)
    {
      if (piles[x]==0)
      {
        counterPile = counterPile-1;
        if (counterPile==0)
        {
          return true;
        }
      }
    }
    return false;
  }
  
  public void printPiles()// prints the pile number and the numver of sticks currently in a pile
  {
    for(int x=0;x<numPiles;x++)
    {
      System.out.println("Pile "+x+": "+piles[x]+" sticks");
    }
  }
}
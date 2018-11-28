//Zoe Lavoie
import java.util.*;
public class Nim
{
  private int numPiles;
  private int [] piles;
  
  Scanner input = new Scanner (System.in);
  public Nim() 
  {
    numPiles = 3;
    
    for (int i = 0; i < numPiles; i++)  
       piles[i] = 10;
  }
  
  public Nim( int num, int[] sticks) 
  {
   numPiles = num;
   piles =  sticks;
  }
 
  public void remove(int pile, int numSticks)
  {
    
    int stop = 0;
    do 
    {
      if(piles[pile] >= numSticks)
      {
        piles[pile] = piles[pile] - numSticks;
        stop = 1;
      }
      else
      {
        System.out.println("Invalid. Please Try again");
        System.out.println("Pile : ");
        pile = input.nextInt();
        System.out.println("Sticks: ");
        numSticks = input.nextInt();
      }
    }while (stop == 0);
  }


  
  public boolean gameOver()
  {
    boolean done = true;
    for (int i = 0; i < piles.length; i++)
    {
      if (piles[i] > 0)
      {
        done = false;
    }
    }
    System.out.println("STATUS: ");
    System.out.println(done);
    return done;
  }
  
  
  public void printPiles()
  {
    for (int i = 0; i < piles.length; i++)
      {
        if (piles [i] != 0)
       {
            System.out.println("Pile " + i + ": " + piles[i]);
          }
       }
  }
}


public class TestPokerHand
{
  public static void main(String[] args) 
   {
         int numFlush = 0;
         int numFullHouse= 0;
         int  numFour= 0;

         for (int k = 0; k <3000; k++)  // deal 3000 hands each from a new deck
        { 
            PokerHand pk = new PokerHand();
             if(pk.fourOfAKind())
            { 
                System.out.println("--------Four of a Kind-----------");
                 pk.printHand();  
                System.out.println();
                numFour++;
            }
           else if(pk.fullHouse()) 
          {
                System.out.println("--------Full House-----------");
                pk.printHand();  
                System.out.println(); 
                numFullHouse++;
            }
          else if(pk.flush())
          {
                System.out.println("--------Flush-----------");
                 pk.printHand();  
                 System.out.println();
                numFlush++;
            }
      }
        System.out.println("For 3000 hands:");
        System.out.println("Number of four of a kind: "+ numFour);
        System.out.println("Number of full house: "+ numFullHouse);
        System.out.println("Number of flush: "+ numFlush);
   }
 }
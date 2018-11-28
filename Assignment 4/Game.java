import java.util.*;
public class Game
{
  private Player p; 
  
  public Game()
  {
    p = new Player();
  }
  public void play()
  {
    Scanner scan = new Scanner(System.in);
    int choice = 0;
    do{
    System.out.println("Choose One of the Following: ");
    System.out.println("1: Push BetOne");
    System.out.println("2: Push BetMax");
    System.out.println("3: Push Spin");
    System.out.println("4: Insert Coins");
    System.out.println("5: Push CoinOut");
    System.out.println("6: Exit");
    System.out.println("Your Choice: " );
    choice = scan.nextInt();
    switch(choice)
    {
      case 1: 
        p.betOne();
        break;
        
      case 2:
        p.betMax();
        break;
        
      case 3:
        p.spin();
        break;
        
      case 4:
        p.insert();
        break;
        
      case 5:
       p.coinsOut();
        break;
        
      case 6:
        break;
    }
    }while(choice!=6);
    
    System.out.println("Play again soon!");
  }
  
  
  
}
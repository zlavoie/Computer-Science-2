import java.util.*;
public class TestStock
{
  public static void main(String[] args)
  {
    Stock[] stocks = new Stock [4];
    
    stocks[0] =new Stock("DIS", "Disney");
   stocks[1]=new Stock("AXP","American Express");
    stocks[2]=new Stock("AAPL","Apple Computer");
    stocks[3]=new Stock("VZ","Verizon");
    
    String answer="";
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a stock symbol (Type XXX to stop): ");
while(!answer.equals("XXX"))
      {
    answer = input.next();
 
    for (int x=0; x<4;x++)
    {
      if(answer.equals(stocks[x].getSymbol()))
      {
        System.out.println("Symbol: "+stocks[x].getSymbol()+" Company: "+stocks[x].getName()+"| Closing: "+stocks[x].getCurrentPrice()+"| Previous: "+stocks[x].getPreviousClosingPrice());
      }
    }
}
  }
  
}

    
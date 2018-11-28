//Zoe Lavoie and Catherine Giannetti
//Lab 2-2
public class Stock
{
  private String symbol;
  private String name;
  private double previousClosingPrice;
  private double currentPrice;
  
 public Stock(String symbol, String name)
 {
 this.symbol = symbol;
 this.name=name;
 }
 
 public Stock()
 {
   symbol = "";
   name = "";
 }
 
 public String getSymbol()
 {
   return symbol;
 }
 public String getName()
 {
   return name;
 }
 
 public double getPreviousClosingPrice()
 {
      if(symbol.equals("DIS"))
   {
     previousClosingPrice = 20.23;
   }
        else if(symbol.equals("AXP"))
   {
     previousClosingPrice = 20.04;
   }
          else if(symbol.equals("AAPL"))
   {
     previousClosingPrice = 89.36;
   }
            else if(symbol.equals("VZ"))
   {
     previousClosingPrice = 31.43;
   }
   return previousClosingPrice;
 }
 public double getCurrentPrice()
 {
    if(symbol.equals("DIS"))
   {
     currentPrice = 21.93;
   }
        else if(symbol.equals("AXP"))
   {
     currentPrice = 21.87;
   }
          else if(symbol.equals("AAPL"))
   {
    currentPrice = 95.90;
   }
            else if(symbol.equals("VZ"))
   {
     currentPrice = 31.19;
   }
          
   return currentPrice;
 }
 

 public void setPreviousClosingPrice(double previousClosingPrice)
 {
   this.previousClosingPrice=previousClosingPrice;
 }
 public void setCurrentPrice(double currentPrice)
 {
   this.currentPrice=currentPrice;
 }
}
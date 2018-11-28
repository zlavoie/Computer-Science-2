//Zoe Lavoie and Catherine Giannetti
public class Customer extends Person
{
protected double previousBalance;
protected double purchases;
  
public Customer()
{
  previousBalance = 0.0;
  purchases = 0.0;
}

public Customer(String n, String a, String t, double prevB, double p)
{
  super(n,a,t);
  this.previousBalance = prevB;
  this.purchases = p;
}
 
public void setPreviousBalance(double prevB)
{
  previousBalance = prevB;
}
public void setPurchases(double p)
{
  purchases = p;
}

public double getPreviousBalance()
{
  return previousBalance;
}

public double getPurchases()
{
  return purchases;
}

public double currentBalance()
{
  double Balance = (getPreviousBalance()+getPurchases());
  return Balance;
}

public String display()
{
 String s="";
 return s = ((super.display())+" Previous Balance: "+getPreviousBalance()+" Purchases: "+getPurchases()+" Total Balance: "+currentBalance());
}
}
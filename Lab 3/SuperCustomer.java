//Zoe Lavoie and Catherine Giannetti

public class SuperCustomer extends Customer
{
  protected double discount;
 
  public SuperCustomer()
  {
    super();
    discount = 0.0;
  }
  
  public SuperCustomer(String name, String address, String teleNum, double previousBalance, double purchases)
  {
     super(name,address,teleNum,previousBalance,purchases);
     setDiscount();
     this.discount = getDiscount();
  }
  
  public void setDiscount()
  {
  double p =  super.getPurchases();
  if((p>=100)&&(p<500))
  {
   discount = 5.0;
  }
  if ((p>=500)&&(p<1000))
  {
    discount = 10.0;
  }
  else if((p>=1000))
  {
    discount = 20.0;
  }
  }
  
  public double getDiscount()
  {
  return discount;  
  }
  
  public double currentBalance() //need to override currentBalance
  {
    double CurrentBalance = ((super.getPreviousBalance()+ super.getPurchases()) - (super.getPurchases()*(discount/100)));
 return CurrentBalance;
  }
  
  public String display()
  {
   String s="";
      System.out.println(getPreviousBalance()+"+"+getPurchases());
   return s = (super.display()+" Discount: "+getDiscount()+" Balance with Discount: "+currentBalance());
  }
  
}
//Zoe Lavoie and Catherine Giannetti 
public class TestCustomer 
  {
    public static void main(String[] args) 
  {
      Customer c = new Customer("Sheldon", "666 Cooper St", "345-6789 ", 400.00, 200); 
      System.out.println(c.display());
      System.out.println("Current Balance " + c.currentBalance()); 

      SuperCustomer sc = new SuperCustomer("Amy", "345 Oak St.", "678-5678" ,100.00, 1000);
      System.out.println(sc.display()); 
       System.out.println("Current Balance " + sc.currentBalance());
       sc.setPurchases(100);
       System.out.println("Current Balance " + sc.currentBalance());
        sc.setPurchases(10);
       System.out.println("Current Balance " + sc.currentBalance());
  }
}
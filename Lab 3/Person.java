//Zoe Lavoie and Catherine Giannetti
public class Person
{
  protected String name;
  protected String address;
  protected String teleNum;
  
  public Person()
  {
    name = "";
    address="";
    teleNum="000-000-0000";
  }
    public Person(String name, String address, String teleNum)
  {
    this.name = name;
    this.address=address;
    this.teleNum=teleNum;
  }
    
    public void setName(String n)
    {
      name=n;
    }
        public void setAddress(String a)
    {
      address=a;
    }  
    public void setTeleNum(String t)
    {
      teleNum=t;
    }
    
    public String getName()
    {
      return name;
    }
       public String getAddress()
    {
      return address;
    }
          public String getTeleNum()
    {
      return teleNum;
          }
          
    public String display()
    {
      String b;
     return  b = ("Name: "+getName()+" Address: "+getAddress()+" Phone: "+getTeleNum());
    }
    
}
          
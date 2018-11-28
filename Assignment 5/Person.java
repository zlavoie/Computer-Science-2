//Zoe Lavoie
public abstract class Person
{
    String lastName;
    String firstName;
    String SSNumber;
    
    public Person()
    {
        lastName = "";
        firstName = "";
        SSNumber = "";
    }
    public Person(String lastName, String firstName, String SSNumber)
    {
        this.lastName=lastName;
        this.firstName=firstName;
        this.SSNumber=SSNumber;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getSSN()
    {
        return SSNumber;
    }
    
    public void setLastName(String last)
    {
        lastName = last;
    }
    
    public void setFirstName(String first)
    {
        firstName = first;
    }
    
    public void setSSN(String Social)
    {
        SSNumber = Social;
    }
    
    public boolean equals(Object x)
    {
     String here = this.lastName+this.firstName;
       String people = ((Person)x).lastName+ ((Person)x).firstName; 
        
        return here.equals(people);
    }
}

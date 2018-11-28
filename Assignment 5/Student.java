//Zoe Lavoie
public class Student extends Person implements Comparable
{
    double GPA;
    String address;
    
    
    public Student()
    {
        super();
        GPA = 0;
        address = "";
    }
    
    public Student(String lastName, String firstName, String SSNumber, double GPA, String address)
    {
        super(lastName, firstName, SSNumber);
        this.GPA = GPA;
        this.address = address;
    }
    
    public String toString()
    {
        return ("Name: " + super.getFirstName() + " " + super.getLastName() + ", SSN: " + super.getSSN() + ", GPA: " + GPA + ", Address: " + address);
    }
    
    public int compareTo(Object x)
    {
        String here =this.lastName+this.firstName;
        String people = ((Person)x).lastName+ ((Person)x).firstName;
        return here.compareTo(people);
    }
}
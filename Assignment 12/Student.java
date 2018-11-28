//Zoe Lavoie
import java.util.*;

public class Student implements Comparable
{
String name;
ArrayList<Integer> grades;  // holds an arbitrary number of grades for the student
  
  public Student()
{
  name="";
    ArrayList grades=new ArrayList();
}
  public Student(String n, ArrayList<Integer> g)
  {
    name=n;
   grades=g;
  }
  
  public String getName()
  {
    return name;
  }
  
   public int compareTo(Object o)    // compares name
   {  
     return (getName().compareTo(((Student)o).getName()));
       
   }
   
public ArrayList<Integer> getGrades()
{
return grades;
}

public int getAverage()    // returns the average grade for a student  (use integer division) 
{
  int total =0;
  int num=0;
  //System.out.println("GRADE SIZE: "+grades.size());
for(int b=0;b<grades.size();b++)
{
total = total+(grades.get(b));
num++;
}
int average=total/num;
return average;
}

}
//Zoe Lavoie
import java.util.*;

public class GradeBook extends Student
{
ArrayList<Student> students;
int numStudents=0;

public GradeBook()
{
    Scanner scan = new Scanner(System.in);
  
    System.out.println("How many students in the class?: ");
    numStudents = scan.nextInt();
    students=new ArrayList<Student>(numStudents); 
    for(int k=0;k<numStudents;k++)
    {
      System.out.println("----Student "+(k+1)+"----");
      System.out.println("Please enter the student name: ");
        String name=scan.next();
      System.out.println("Please enter the number of grades for this student: ");
      int totalgrade = scan.nextInt();
      
      ArrayList<Integer> temp = new ArrayList<Integer>(totalgrade);
      for(int j=0;j<totalgrade;j++)
      {
       System.out.println("Please enter grade number "+(j+1)+": ");
       int grade = scan.nextInt();
       temp.add(grade);
           }
  Student s = new Student(name,temp);    
  students.add(s);
    }
}

public void printRoster() // prints name and grade for each student
{
  System.out.println(numStudents);
 System.out.println("Roster: ");
 
  for(int g=0;g<numStudents;g++)
  {
 Student name = students.get(g);
 
 ArrayList<Integer> grades = name.getGrades();
    System.out.println(name.getName()+":            ");
    for(int h=0;h<grades.size();h++)
    {
      System.out.println(grades.get(h)+" ");
    }
    //System.out.println();
  }//End outter For Loop
 
}// End method

public void printAverage()   // prints name and average for each student
{
  for(int i =0; i<students.size(); i++){
    Student student = students.get(i);
     System.out.println(student.getName() + " " + student.getAverage());
  }
}
  public void printStudent() // prompts for the name of a student and prints
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the name of the Student: ");
    String studentName = input.next();
    
    for(int i =0; i<students.size(); i++)
    {
     
    Student student = students.get(i);
    if(student.getName().equals(studentName))
    {
       System.out.println(student.getName() + ": " + student.getAverage());
    }
    }
  }
                                            // the name and average or “Student not found  
public static void main(String[] args)
{
            GradeBook gb = new GradeBook();
            gb.printRoster();
            System.out.println();
            gb.printAverage();
            System.out.println();
            gb.printStudent();
    }
}
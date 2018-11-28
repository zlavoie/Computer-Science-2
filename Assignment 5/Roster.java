//Zoe Lavoie

import java.io.*;
import java.util.*;
public class Roster 
{
   static  Student student[];
   static int numStudents;
    
    public Roster()
    {
        student = new Student[35];
        numStudents = 35;
    }
    
    public Roster(String inFile) throws IOException
    {
      student = new Student[35];
      numStudents = 0;
        
        File myFile = new File("Students.txt");
        
        if(!myFile.exists())
        {
            System.out.println("File does not exist.");
            System.exit(0);
        }
        Scanner input = new Scanner(myFile);
        
        while(input.hasNext())
        {
            String lastName = input.next();
            String firstName = input.next();
            String SSNumber = input.next();
            double GPA = input.nextDouble();
            String address = input.next();
            student[numStudents] = new Student(lastName, firstName, SSNumber, GPA, address);
            numStudents++;
        }
        input.close();
    }
    
    public int addStudent(Student s)
    {
        student[numStudents] = s;
        
        numStudents++;
          return numStudents;
    }
    public static void sort(Comparable[] x, int size)

     {
          Comparable max;             
          int maxIndex;
          for (int i= size-1; i>=1; i--)
          {
                                 
               max = x[0];        
               maxIndex = 0;         

               for (int j= 1; j<= i; j++)  
               {
                    if (max.compareTo(x[j]) < 0)     
                    {
                         max = x[j];  
                         maxIndex = j;
                    }
               }
               if (maxIndex != i)    
               {
                    x[maxIndex] = x[i];
                    x[i] = max;
               }
          }
     }
    
        
    public void printClass()
    {
      sort(student, numStudents);
      for(int i = 0; i < numStudents; i++)
          System.out.println(student[i].toString());
    }
    
    public String menu()
    {
      Scanner input = new Scanner(System.in);
 System.out.println("Please enter \"S\" to search, \"A\" to add, \"P\" to print roster, \"E\" to exit");
       String choice = input.next();
       return choice;
    }
    public static int search(String lastName, String firstName)
 {
            Comparable key = new Student(lastName, firstName, "", 0, "");
            sort(student, numStudents);
            return BinarySearch.binarySearch(student, numStudents, key);
 }
    
    
    public void performAction(String choice)
    {
      Scanner input = new Scanner(System.in);
      if (choice.equals("A"))
      {
        System.out.println("Enter the last name");
        String lastName = input.next();
        
        System.out.println("Enter the first name");
        String firstName = input.next();
        
        System.out.println("Enter the SSN");
        String SSNumber = input.next();
        
        System.out.println("Enter the GPA");
        double GPA = input.nextDouble();
        
        System.out.println("Enter the campus adress");
        String address = input.next();
        
        Student x = new Student(lastName, firstName, SSNumber, GPA, address);
        addStudent(x); 
      }
      
      else if (choice.equals("S"))
      {
        System.out.println("Enter the last name");
        String lastName = input.next();
        
        System.out.println("Enter the first name");
        String firstName = input.next();
        
        int fullName=search(lastName, firstName);
        if(fullName == -1)
         {
             System.out.println(lastName + ", " + firstName + " is not in this class.");
         }
         else
         {
             System.out.println(lastName + ", " + firstName  + " is in this class.");
             System.out.println(firstName+"'s Information "+student[fullName]);
         }
      }   

      else if (choice.equals("P"))
      {
        for(int i=0;i<numStudents;i++)
          System.out.println(student[i]); 
      }
      }
    public static void  main(String [] args) throws IOException
    {
        Roster roster = new Roster("Students.txt");
        String choice;
        do
        {
            System.out.println("The number of student of Students is: " + numStudents);
            
            choice = roster.menu();
            sort(student, numStudents);
            roster.performAction(choice);  
            System.out.println();
            } while (!choice.equals("E"));
    }
      }

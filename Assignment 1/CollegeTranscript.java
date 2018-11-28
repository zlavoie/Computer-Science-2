//Zoe Lavoie
import java.util.*; 
import java.io.*;

public class CollegeTranscript
{
public static void main(String[] args) throws IOException
{
File inData = new File("courses.txt");
if (!inData.exists())
{
  System.out.println("File does not exist");
  System.exit(0);
}
Scanner input = new Scanner(inData);
 double numgrade=0.0;
  double average=0;  
  double totalGrade = 0;
  int AmountofGrades=0;
  
while(input.hasNext())
{
  String courses = input.next();
  String grade = input.next();
  
  if(grade.equals("A"))
       {
    numgrade = 4.0;
  }
     else if(grade.equals("B"))
               {
       numgrade=3.0;
     }
             else if(grade.equals("C"))
             {
               numgrade=2.0;
             }
             else if (grade.equals("D"))
             {
               numgrade=1.0;
             }
             else if (grade.equals("F"))
             { 
               numgrade=0.0;
             }
  
  totalGrade=totalGrade+numgrade;
  AmountofGrades=AmountofGrades+1;
  average = totalGrade/AmountofGrades;
}
double round = Math.round(average*100.0)/100.0;
System.out.println("GPA: "+round);
   input.close();
}
}


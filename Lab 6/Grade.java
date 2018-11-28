//Zoe Lavoie and Catherine Giannetti
import java.util.*;

public class Grade
{
  
  public static String Grades(String num)
  {
     String numGrade="";
        Scanner scan = new Scanner(System.in);
        //System.out.println(Integer.parseInt(num));
    try
    {
if((Integer.parseInt(num) > 100)||(Integer.parseInt(num) < 0))
   {
   throw (new NumberFormatException("The value entered is out of range"));
   }
for(int i = num.length() - 1; i >= 0; i--)
    {
 if(!Character.isDigit(num.charAt(i)))
        { 
         throw (new NumberFormatException("Number entered is not valid."));
        }
}
 if((Integer.parseInt(num)>89)&&(Integer.parseInt(num)<101))
  {
   numGrade = "A";
   return numGrade;
  }
  else if((Integer.parseInt(num)>79)&&(Integer.parseInt(num)<90))
  {
   numGrade = "B";
   return numGrade;
  }
  else if((Integer.parseInt(num)>69)&&(Integer.parseInt(num)<80))
  {
   numGrade = "C";
   return numGrade;
  }
    else if((Integer.parseInt(num)>59)&&(Integer.parseInt(num)<70))
  {
   numGrade = "D";
   return numGrade;
  }
    numGrade="F";
   }
    
   catch (NumberFormatException e)
   {
     System.out.println(e.getMessage());
   }
   return numGrade;
  }
  
  
  
   public static void main(String [] args)
{
Scanner input = new Scanner(System.in);
System.out.print("What is your test score?");
String num = input.next();  // number of values
Grade a = new Grade();
String theGrade = a.Grades(num);
System.out.println("The grade letter you recieved is a(n) "+theGrade);
}
}
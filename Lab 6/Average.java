//Zoe Lavoie and Catherine Giannetti
import java.util.*;
public class Average
{
public double average(int n)
{
  boolean loops=true;
  String num = "";
  int numCheck =0;
  double total = 0;

    for(int z=1;z<=n;z++)
  {
      while(loops)
            {
  try
{ 
    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println("Number "+z+": ");
     num = input.next();
     numCheck=Integer.parseInt(num) ;
     
if((numCheck > 100)||(numCheck < 0)) //Checks range and throws an exception if false
{
 loops=true; //True to run through loop again
 Exception e = new Exception();
 throw e;
}
loops=false; //Exits while loop, should increase for loop by 1 in next run through
    }
  
  catch (NumberFormatException em) //Catch Block 1
   {
    loops=true;
     System.out.println("Number entered is not valid. Please enter another number: ");
   }//End of Catch Block 1
      catch (Exception e) // Catch Block 2
   {
        loops=true;
     System.out.println("The value entered is out of range");
      }//End of Catch Block 2
  }//End of While loop
      total=total+numCheck;
      loops=true;
  }//End of For Loop
  
return (total/n);
}

public static void main(String [] args)
{
Scanner scan = new Scanner(System.in);
System.out.print("How many values?");
int num = scan.nextInt();  // number of values
Average av = new Average();
double theAverage = av.average(num);
System.out.println("The average is "+theAverage);
}
}
   
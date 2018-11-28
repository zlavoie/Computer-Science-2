//Zoe Lavoie
import java.util.*;

public class DateMachine 
{
 public static void main(String [] args)
 {
  Scanner scan = new Scanner(System.in);
  int date = 1;
  int month = 1;
  
  while(date != 0 && month != 0)
  {
    String MONTH = " ";
   System.out.print("Enter your date inquiry using the format of month and day. Enter 0 0 to quit: ");
    month = scan.nextInt();
   date = scan.nextInt();
   
   try //Try Statement
   {
     if(date==0 && month==0)
   {
    done();
    break;
   }
     if((date<1)||(date>31)||(month>12)||(month<1)) //Throw
    {
     throw(new DException());
    }
    
    switch(month)
    {
    case 1:
     MONTH = "January";
     break;
     
    case 2:
     MONTH = "February";
     break;
     
    case 3:
     MONTH = "March";
     break;
    case 4:
     MONTH = "April";
     break;
     
    case 5:
     MONTH = "May";
     break;
     
    case 6:
     MONTH = "June";
     break;
    case 7:
     MONTH = "July";
     break;
     
    case 8:
     MONTH = "August";
     break;
     
    case 9:
     MONTH = "September";
     break;
     
    case 10:
     MONTH = "October";
     break;
     
    case 11:
     MONTH = "November";
     break;
     
    case 12:
     MONTH = "December";
     break;
     
    default:
     break;
    }
    
    System.out.println(MONTH + " " + date);
   }
   catch(DException e) //Catch statement
   {
    System.out.println(e.getMessage()); //Prints out little message when there is a date exception
   }
  }
  scan.close();
 }
 
 public static void done()
 {
 System.out.println("Thank you for using our system. Have a nice day!");  
 }
}
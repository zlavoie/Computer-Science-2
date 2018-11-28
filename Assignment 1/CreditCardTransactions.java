//Zoe Lavoie
import java.util.*; 
import java.io.*;

public class CreditCardTransactions
{
public static void main(String[] args) throws IOException
{
     Scanner input = new Scanner(System.in);
     System.out.print("File Name: ");
    String fileName = input.next();
     readData(fileName);
}

public static void readData(String fileName) throws IOException
{
  File file = new File (fileName);
  if (!file.exists())
  {
    System.out.println("File does not exist");
    System.exit(0); //end program because file does not exist
  }
  Scanner scan = new Scanner(file);

double HighestExpense = 0.0;
double CurrentExpense;
String Type;

  while(scan.hasNext()) 
  {
    Type = scan.next();
   CurrentExpense=scan.nextDouble();
  if(CurrentExpense>HighestExpense)
    {
     HighestExpense = CurrentExpense;
    }
  }
 System.out.println("The highest expense was: "+"$"+HighestExpense); 
scan.close();
}
}
//Zoe Lavoie
import java.util.*;
public class TestAdd
{
    public static void main(String[] args)
    {
        try
        {
            Scanner input = new Scanner(System.in);
            String num1= ""; 
            String num2= ""; 
            int a, b;
            // read in the numbers as Strings
           //If the uses enters "max" the number is INTEGER.MAX_VALUE i.e. 2,147,483,647
           //If the user enters "min" the numbe is Integer.MIN_VALUE i.e -2,147,483,648

           System.out.println("Enter two integers (max designates MAX_INT and min designates   MIN_INT):" );
            num1 = input.next();
            if (num1.equals("max"))
                a = Integer.MAX_VALUE;
            else if (num1.equals("min")) 
                a = Integer.MIN_VALUE;
            else a = Integer.parseInt(num1);

            num2 = input.next();
            if (num2.equals("max"))
                b= Integer.MAX_VALUE;
            else if (num2.equals("min"))
                b = Integer.MIN_VALUE;
            else 
                b = Integer.parseInt(num2);

            int sum = Arithmetic.add(a,b);
            System.out.println("Sum = "+ sum);
        }
        catch(OverflowException e)
        {
             System.out.println( e.getMessage());
        }
        catch(UnderflowException e)
        {
              System.out.println( e.getMessage());
        }
    }
}
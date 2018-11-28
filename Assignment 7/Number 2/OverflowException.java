//Zoe Lavoie
public class OverflowException extends Exception
{
  
 public OverflowException()
 {
   super("This is an overflow, you added two positive numbers together and got a negative!"); 
 }
 
 public OverflowException(String s)
 {
  super(s); 
 }
}
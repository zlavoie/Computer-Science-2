//Zoe Lavoie
public class UnderflowException extends Exception
{
  
 public UnderflowException()
 {
   super("This is an underflow, you added two negative numbers together and got a positive!"); 
 }
 
 public UnderflowException(String s)
 {
  super(s); 
 }
}
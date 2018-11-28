//Zoe Lavoie
public class IllegalCharacterException extends Exception
{
  public IllegalCharacterException()
  {
   super("Illegal Character in String"); 
  }
  public IllegalCharacterException(String s)
  {
    super(s);
  }
}
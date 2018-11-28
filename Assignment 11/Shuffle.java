//Zoe Lavoie
import javax.swing.*;
import java.util.*;

public class Shuffle
{
  public static void shuffle(JButton[] x)
  {
    Random rand = new Random ();
    for (int i = 0; i <26 ; i++)
    {
     int r = rand.nextInt(26);

     JButton temp = x[i];
     x[i] = x[r];
     x[r] = temp;
    }
  }
}
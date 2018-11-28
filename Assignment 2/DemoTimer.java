//Zoe Lavoie

import java.util.*;
public class DemoTimer
{
  public static void main (String [] args)
  {
    Scanner input = new Scanner (System.in);
    Clock clck = new Clock();
    clck.SetTime(23,54);
    System.out.println("The current time is: "+clck.toWords());
    clck.incrementTimer();
    System.out.println("The current time is: "+clck.toWords());
    clck.incrementTimer(190);
    System.out.println("The current time is: "+clck.toWords());
    System.out.println("Enter hour: ");
    int hour= input.nextInt();
    System.out.println("Enter minute: ");
    int minute= input.nextInt();
   clck.SetTime(hour, minute);
   System.out.println("The current time is: "+clck.toWords());
  }
}

    
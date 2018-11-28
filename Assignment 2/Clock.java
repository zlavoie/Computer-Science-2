//Zoe Lavoie

public class Clock
{
  private int hour; 
  private int minute;
  
  public Clock() //initializes
  {
    hour=0;
    minute=0;
  }
  
  public  Clock (int hours) 
  {
    hour = hours;
    minute = 0;
  }
  
  public Clock (int hours, int minutes) //new hour
  {
    hour = hours;
    minute = minutes;
  }
  public int getHour() //get hours
  {
    return hour;
  }
  public int getMinute() //get minutes
  {
    return minute;
  }
  
  public String toWords() //converts to string of real time
  {
    if ((hour>=12)&&(hour<=24)) 
    {
      hour = hour - 12;
      if(minute/10==0)
      {
        return (hour+" : "+ minute+"0"+" PM ");
      }
      return (hour+" : "+ minute+" PM ");
    }
    
    if(hour<13)
    {
      if(minute%10==0)
      {
        return (hour+" : "+ minute+"0"+" PM ");
      }
        return (hour+" : "+ minute+" PM ");
    }
    
      return (hour+" : "+ minute+"AM");
  }
  
  public void incrementTimer() //if minutes are more than 60 add hours and substract
  {
    minute=minute+1;
    if (minute>=60)
    {
      hour=hour+1;
      minute=minute-60;
    }
  }
  public void incrementTimer(int incrementer)
  {
    minute=minute+incrementer;
    while(minute>=60)
    {
      hour=hour+1;
      minute=minute-60;
    }
  }
  
  public void SetTime(int hours, int minutes)
  {
    if (minutes>60)
    {
      System.out.println("Invalid input");
    }
    else if (hours>24)
    {
      System.out.println("Invalid input");
    }
    hour = hours;
    minute = minutes;
    
    
    toWords();
  }
}

  
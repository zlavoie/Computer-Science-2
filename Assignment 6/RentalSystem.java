//Zoe Lavoie
import java.io.*;
import java.util.*;
public class RentalSystem
{
  public static void main(String[] args) throws IOException
  {
   Item[] array = new Item[30];
   File myFile = new File("items.txt");
   boolean active = true;
   
   Scanner input = new Scanner(System.in);
   Scanner file = new Scanner(myFile);
   System.out.println("Welcome to the Video Store");
   int currentIdNum = 100;
   
    for (int i = 0; i < 30; i++)
    {
      if (file.hasNext())
      { 
       String format = file.next();
       int id = file.nextInt();
       String title = file.next();
       double cost = file.nextDouble();
       
       if (format.equals("G"))
       {
         int minAge = file.nextInt();
         int s = file.nextInt();
         String name = file.next();
         boolean status;
         
         if(s == 0)
         {
           status = false;
         }
         else
         {
           status = true;
         }
         array[i] = new VideoGame(id, title, cost, status, name, minAge); 
       }
       
       if (format.equals("M"))
       {
         int runTime = file.nextInt();
         String rating = file.next();
         String t = file.next();
         int s = file.nextInt();
         boolean status;
         
         if(s == 0)
         {
           status = false;
         }
         else
         {
           status = true;
         }
         
         String name = file.next();
         array[i] = new Movie(id, title, cost, status, name, runTime, rating, t);
       }
      }
    }
    
    while (active)
    {
      System.out.println("Press 1 if you want to check out an item.");
      System.out.println("Press 2 if you want to to check in an item.");
      System.out.println("Press 3 if you want to search for an item by ID number to check if in stock.");
      System.out.println("Press 4 if you want to search for an item by its title.");
      System.out.println("Press 5 if you want to display entire inventory.");
      System.out.println("Press 6 if you want to add an item to  the inventory.");
      System.out.println("Press 7 if you want to delete an item from inventory.");
      System.out.println("Press 8 if you want to exit the video store.");
      int answer=input.nextInt();
      if(answer == 1)
      {
        System.out.println("Enter the ID number");
        int cO = input.nextInt();
        int count = 0;
        for (int i = 0; i < 30;i++)
        {
          if ( (array[i]).getId() == cO && (array[i]).getStatus() == true)
          {
            boolean set = true;
            (array[i]).setStatus(set);
            System.out.println("Checked out: " + array[i].getTitle());
          }
          else 
          {
            count++;
          }
          
          if(count >= 29)
          {
            System.out.println("Unfortunaltey, the item is currently unavailable");
          }
        }
      }
      else if (answer == 2)
      {
        System.out.println("Enter the id number of the item you want to check in");
        int cI = input.nextInt();
        int count = 0;
        for (int i = 0; i < 30;i++)
        {
          if ( (array[i]).getId()==cI && (array[i]).getStatus() == false)
          {
            boolean set = false;
            (array[i]).setStatus(set);
            System.out.println("Checked in: " + array[i].getTitle());
          }
          else 
          {
            count++;
          }
          
          if (count>=29)
          {
            System.out.println("This item is not in stock");
          }
        }
      }
      
      else if (answer == 3)
      {
        System.out.println("If you want to check the availibilty of an item, enter the desired items id number.");
        int idnumbersearch = input.nextInt();
        int count = 0;
        for (int i = 0; i < 30;i++)
        {
          if ( (array[i]).getId()==idnumbersearch )
          {
            (array[i]).display();
          }
          else 
          {
            count++;
          }
          if(count >= 29)
          {
            System.out.println("Item is not currently available");
          }
        }
      }
      
      else if (answer == 4)
      {
        System.out.println("Enter the title of an item to search.");
        int count = 0;
        String namesearch=input.next();
        for (int i = 0; i < 30; i++)
        {
          
          if( ((array[i]).getTitle()).equals(namesearch) )
          {
            (array[i]).display();
          }
          else count++;
          if (count >= 29) System.out.println("Item is not available");
        }
      }
      
      else if (answer == 5)
      {
        System.out.println("This is our entire inventory of items: ");
        System.out.println("");
        
        for (int i=0; i <30; i++)
        {
          (array[i]).display();
        }
      }
      
      else if (answer == 6)
      {
        System.out.println(" 1 for video game, 2 for movie.");
        int x = input.nextInt();
        if (x == 1)
        {
        System.out.println("Enter the name of the video game: ");
        String title1=input.next();
        System.out.println("Enter the price of the video game");
        double price1=input.nextDouble();
        System.out.println("Enternter the minimum age for the game ");
        int minAge=input.nextInt();
        System.out.println("Enter the current renter of the game : ");
        String name1=input.next();
        System.out.println("Thank you. You are all set");
        System.out.println();
        boolean status1=true;
        array[29]=new VideoGame(currentIdNum, title1, price1, status1, name1, minAge);
        }
        
        else if (x == 2)
        {
          System.out.println("PEnter the name of the movie :");
          String title2 = input.next();
          System.out.println("Enter the price ");
          double price2 = input.nextDouble();
          System.out.println("Enter the length:");
          int runTime2 = input.nextInt();
          System.out.println("Enter the rating");
          String rating2 = input.next();
          System.out.println("Enter 1 for vhs or 2 for dvd");
          System.out.println();
          int m = input.nextInt();
          String type2;
          
          if(m==1)
          {
            type2="V";
          }
          else 
          {
            type2="D";
          }
          
          System.out.println("Enter the name of the last or current renter");
          String name2= input.next();
          boolean status2=true;
          array[29]=new Movie(currentIdNum, title2, price2, status2, name2, runTime2, rating2, type2);
        }
      }
      else if (answer == 7)
      {
        System.out.println("If you want to delete an item, enter the id number ");
        int y=input.nextInt();
        for (int i = 0; i < 30; i++)
        {
          int count=0;
          if ((array[i]).getId()==y)
          {
            System.out.println("Item deleted.");
          }
          count++;
          if (count >= 29)
          {
            System.out.println("Not a valid ID number");
          }
        }
      }
      
        else if (answer == 8)
        {
          active = false;
          System.exit(0);
        }
        else System.out.println("This is an invalid entry.");
    }
    file.close();
    input.close();
  }
}
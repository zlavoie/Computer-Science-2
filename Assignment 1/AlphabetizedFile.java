import java.util.*;
import java.io.*;

public class AlphabetizedFile {

public static void main(String[] args) throws IOException
   {
File inData = new File("names.txt");
File outData = new File("sortednames.txt");
PrintWriter pw = new PrintWriter(outData);
if (!inData.exists())
{
  System.out.println("File does not exist");
  System.exit(0);
}

Scanner input = new Scanner(inData);
int x=0;
String name []= new String [10];
//String extra []= new String [30];

while(input.hasNext())
{
name [x]=input.nextLine();       
  x++;  
}

      String temp;
        for(int a=0; a<name.length; a++) 
        {
            for(int b=0; b<name.length-1-a; b++) 
            {
            if(name[b].compareTo(name[b+1])>0) 
            {
                temp = name[b];
                name[b] = name[b+1];
                name[b+1] = temp;
            }
      }
        }
        
        for(int z=0; z<x; z++)
        {
        pw.println  (name[z]);
        }
        pw.close();
       input.close();
    }
}


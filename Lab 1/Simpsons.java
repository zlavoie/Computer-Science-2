import java.util.*;
import java.io.*;

public class Simpsons
{
public static void main(String[] args) throws IOException
   {
File inData = new File("SimpsonsName.txt");
File outData = new File("Simpsons1.txt");
PrintWriter pw = new PrintWriter(outData);

if (!inData.exists())
{
  System.out.println("File does not exist");
  System.exit(0);
}

Scanner input = new Scanner(inData);
int x=0;
String firstname []= new String [7];
String lastname []= new String [7];


while(input.hasNext())
{   
firstname[x]=input.next();
lastname [x]=input.next();
       
  x++;  
}

      String temp2;
      String temp;
        for(int a=0; a<lastname.length; a++) 
        {
            for(int b=0; b<lastname.length-1-a; b++) 
            {
            if(lastname[b].compareTo(lastname[b+1])>0) 
            {
                temp = lastname[b];
                lastname[b] = lastname[b+1];
                lastname[b+1] = temp;
                
                 temp2 = firstname[b];
                  firstname[b] = firstname[b+1];
                  firstname[b+1]=temp2;
            }
            else if(lastname[b].compareTo(lastname[b+1])==0)
            {
              if(firstname[b].compareTo(firstname[b+1])>0)  
              {
                temp2 = firstname[b];
                firstname[b] = firstname[b+1];
                firstname[b+1]=temp2;
              }
            }
            
      }
        }
       for(int z=0; z<lastname.length; z++)
        {
        pw.println(lastname[z]+", "+firstname[z]);
        }
        pw.close();
       input.close();
    }
}
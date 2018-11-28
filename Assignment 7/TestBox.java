//Zoe Lavoie
public class TestBox
{
   public static void main(String[] args)
   {
     System.out.println("The integers are: ");
   int largest = 0;
   int[] integers = new int[10];       
  
    for(int i = 0; i < 10; i++) {
            integers[i] = (int)(Math.random()*100 );
      if(i==0)
      {
      largest=integers[i];
      }
      else if(largest<integers[i])
      {
        largest=integers[i];
      }
    }
    double largestDouble = 0;
    double[] doubles = new double[10];
  for(int z = 0; z < 10; z++) {
    doubles[z] = (double)(Math.random()*1.0);
    if(z==0)
    {
      largestDouble = doubles[z];
    }
    else if(largestDouble<doubles[z]);
       {
         largestDouble=doubles[z];
       }
    }//end for loop
  
  for(int y=0; y<10;y++)
  {
   System.out.print(integers[y]+" ");
  }
  System.out.println();
  System.out.println("The Largest is "+largest);
  System.out.println();
  System.out.println("The doubles are: ");
  System.out.println();
   for(int k=0; k<10;k++)
  {
   System.out.print(doubles[k]+" ");
  }
   System.out.println();
   System.out.println("The Largest is "+largestDouble);
  System.out.println();
   System.out.println("The Boxes are: ");
  Box myBox;
   Box list [] = new Box [5]; 
  for(int x =0;x<5;x++)
  {
  
   int Length= (int)(Math.random()*30+1);
 int Width = (int)(Math.random()*30+1);
 int Height = (int)(Math.random()*30+1);
  list[x]=new Box(Width,Height,Length);
  }
//  System.out.println();
    for(int f =0;f<5;f++)
  {
  System.out.println(list[f]);
  }
   int spot =0;
   int greatest=0;
    for(int c =0;c<5;c++)
  {
      if(c==0)
           {
        greatest=(list[c]).Volume();
      }
 if( ((list[c]).Volume())>greatest);
  {
    greatest = ((list[c]).Volume());
    spot=c;
  }
  }
   System.out.println("The Largest Box is "+list[spot]);
    System.out.println();                                               
  String [] names = new String[5];
  names[0]="Jerry";
  names[1]="George";
  names[2]="Elaine";
  names[3]="Newman";
  names[4]="Kramer";
  
  for(int p=0;p<5;p++)
  {
    if(p==4)
    {
     System.out.print(names[p]+" ") ;
    }
    else
    {
   System.out.print(names[p]+", "); 
  }
  }
  System.out.println();
  System.out.println("The largest is Newman");
  }
}
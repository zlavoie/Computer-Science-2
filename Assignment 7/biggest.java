//Zoe Lavoie  
public class biggest
{
  public static Object max(Comparable[] x, int size) {
         
        Comparable max = x[0];
            for(int i=0;i<x.length;i++)
            {
              if(x[i].compareTo(max)>0)
                max=x[i];
            }
            Object maxObj = max;
            return maxObj;
  }
}
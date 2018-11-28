// Zoe Lavoie
public class SelectionSort
{
public static void selectionsort(Comparable[] x, int size)

     {
          Comparable max;             // max belongs to a class that implements Comparable
          int maxIndex;
          for (int i= size-1; i>=1; i--)
          {
                                  // Find the maximum in the x[0..i]
               max = x[0];         // the "current"  maximum is x[i]
               maxIndex = 0;          // the index of the "current" maximum

               for (int j= 1; j<= i; j++)  // compare other values to "current" maximum
               {
                    if (max.compareTo(x[j]) < 0)     // if max is "less than" x[i]
                    {
                         max = x[j];   // a "new" maximum
                         maxIndex = j;
                    }
               }
               if (maxIndex != i)    // place the maximum in its proper position
               {
                    x[maxIndex] = x[i];
                    x[i] = max;
               }
          }
     }
}
//Zoe Lavoie
public class BinarySearch 
{
private static int binarySearch( Comparable [ ] x, int lo, int hi, Comparable key)

   {
   // pre condition: x must be sorted
   // returns index of key or -1, if not found

         if( lo > hi )
             return -1 ; // not found

         int mid = ( lo + hi ) / 2;

         if( key.compareTo(x[mid]) < 0 )
             return binarySearch( x,  lo, mid - 1, key );
         else if( key.compareTo( x[mid] ) > 0 )
             return binarySearch( x, mid + 1, hi, key );
         else
             return mid;
    }
 
public static int binarySearch( Comparable [ ] x, int size, Comparable key )
 {
         return binarySearch( x, 0, size-1, key );
 }
}
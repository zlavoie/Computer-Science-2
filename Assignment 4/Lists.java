//Zoe Lavoie
abstract class Lists
{
 protected int [] data;
 protected int size;

 public Lists()
 {
   data = new int [100];
   size = 0;
 }
  
  public abstract int remove();

 public abstract void insert (int x);
  
 public abstract int getSize ();
  
}
//Zoe Lavoie
public class LIFO extends Lists
{
  private int size=0;
public int remove()
  {
  if(size==0)
  {
    System.out.println("Empty List, Will Print negative:");
    return -9999;
  }
int x = data[size-1];
  size--;
    return x;
  }

public void insert (int x)
 {
  data[size]=x;
  size++;
 }
  
  public int getSize ()
  {
   return size;  
  }
  /*public static void main(String[] args) // THIS WORKS
    { 
        LIFO s = new LIFO(); 
        System.out.println("LIFO: "); 
        s.insert(2); 
        s.insert(12); 
        s.insert(71); 
        s.insert(50); 
        System.out.println(s.remove()); 
        System.out.println(s.remove()); 
        s.insert(3); 
        s.insert(13); 
        System.out.println(s.remove()); 
        System.out.println(s.remove()); 
        s.insert(11); 
        System.out.println(s.remove()); 
        System.out.println(s.remove());  
        System.out.println(s.remove()); 
        System.out.println(s.remove());   
  }*/
  
}
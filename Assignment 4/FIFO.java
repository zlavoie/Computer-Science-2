//Zoe Lavoie
public class FIFO extends Lists
{
  private int size = 0;
public int remove()
  {
  if(size==0)
  {
    System.out.println("Empty List, Will Print negative:");
    return -9999;
  }

  int x = data[0];
for(int i = 1; i<data.length; i++) 
{
      data[i-1] = data[i];
    }
size--;

    return x;
  }

 public void insert (int x)
 {
    data[size+1] = x;
    size++;
 }
  
  public int getSize ()
  {
   return size;  
  }
 /* public static void main(String[] args) //THIS WORKS
    { 
       FIFO q = new FIFO(); 
        System.out.println("FIFO: "); 
        q.insert(2); 
        q.insert(12); 
        q.insert(71); 
        q.insert(50); 
        System.out.println(q.remove()); 
        System.out.println(q.remove()); 
        q.insert(3); 
        q.insert(13); 
        System.out.println(q.remove()); 
        System.out.println(q.remove()); 
        q.insert(11); 
        System.out.println(q.remove()); 
        System.out.println(q.remove());  
        System.out.println(q.remove()); 
        System.out.println(q.remove());
  }*/
  
}
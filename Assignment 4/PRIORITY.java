//Zoe Lavoie
public class PRIORITY extends Lists
{
  private int size = 0;
   
  public void insert (int x)
 {
    
    data[size]=x;
  size++;
 
 }
   
   public int remove()
  {
     int number=0;
     int maxNumber = 0;
int maxIndex = 0;
    for (int i = 1; i < data.length; i++) 
    {
       number = data[i];
        if ((number > data[maxIndex])) 
        {
            maxIndex = i;
            maxNumber = data[i];
        }
    }
    for(int k = maxIndex+1; k<100; k++) 
{
      data[k-1] = data[k];
    }
size--;
    return maxNumber;
  }
   
   public int getSize()
   {
     return size;
   }
  
/* public static void main(String[] args) // THIS WORKS
    { 
        PRIORITY pq = new PRIORITY();  
        System.out.println("PRIORITY: ");
        
        pq.insert(2);
        pq.insert(12); 
        pq.insert(71); 
        pq.insert(50); 
        System.out.println(pq.remove()); 
        System.out.println(pq.remove()); 
        pq.insert(3); 
        pq.insert(13); 
        System.out.println(pq.remove()); 
        System.out.println(pq.remove()); 
        pq.insert(11); 
        System.out.println(pq.remove()); 
        System.out.println(pq.remove());  
        System.out.println(pq.remove()); 
        System.out.println(pq.remove()); 
  } */
   
  
}
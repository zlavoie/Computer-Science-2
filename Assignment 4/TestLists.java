//Zoe Lavoie
public  class TestLists 
{ 
    public static void main(String[] args)
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
    } 
}

 
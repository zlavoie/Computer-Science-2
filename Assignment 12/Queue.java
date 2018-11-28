//Zoe Lavoie
public class Queue<E> 
{
    private E[] items;
    private int numItems;

    int front, rear;
    int maxQueue;

    public Queue()
    {
        items =(E[]) new Object[10];
        numItems= 0;
        front = rear= -1;
        maxQueue = 10;
    }

    public Queue(int max)
    {
        maxQueue = max;
        items =(E[]) new Object[maxQueue]; // new E[maxQueue] is illegal; the cast is necessary
        numItems = 0;
        front = rear= -1; // -1 indicates that the queue is empty
    }

    public void insert(E x)
    // if overflow occurs, issues a message and exits
    {
        if ( numItems == maxQueue) // queue is full
        {
            System.out.println(" Queue Overflow");
            System.exit(0);
        }

        rear = (rear +1) % maxQueue;    // % maxQueue ensures wraparound
        items[rear] = x;
        numItems++;
        if (numItems == 1)      // if queue was previously empty
            front = rear;
    }

      public E remove()
    // removes and returns the first item in the queue
    // if the queue is empty , returns null
    {
        if (numItems == 0)
          {
            System.out.println(" Queue Underflow");
            System.exit(0);
        }

        E temp = items[front];
        numItems--;
        if ( numItems == 0)
            front = rear = -1;
        else
            front = (front + 1) % maxQueue; // %maxQueue ensures wraparound
        return temp;
    }

    public E peek()
    // returns the first item in the queue or null if the queue is empty
    // does not alter the queue
    {
        if (numItems == 0)
        {
            System.out.println(" Queue Underflow");
            System.exit(0);
        }
            return items[front];
    }

    public boolean empty()
    // returns true if the queue is empty
    {
        return numItems == 0;
    }

    public int size()
    // returns the number of items currently in the queue
    {
        return numItems;
    }

}
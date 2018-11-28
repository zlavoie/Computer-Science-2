//Zoe Lavoie and Catherine Gianetti
import java.util.*;

public class Stack<E>
{
    private ArrayList<E> items;

    public Stack() // default constructor; creates an empty stack
    {
        items = new ArrayList<E>(); // initial capacity is 10
    }
    public Stack(int initialCapacity)
    //one argument constructor, creates a stack with initial capacity initialCapacity
    {
        items = new ArrayList<E>(initialCapacity);
    }

    public void push(E x)
    {
        items.add(x); //uses the ArrayList method add(E o)
    }

    public boolean empty()
    {
        return items.isEmpty();//uses the ArrayList method isEmpty()
    }

    public E pop()
    {
        if (empty()) // determine whether or not there is an item to remove
        {
            System.out.println("Pop: Stack Underflow");
            System.exit(0);
            }
        return items.remove(items.size()-1); //uses the ArrayList method remove(int n)
    }

    public int size()
    {
        return items.size(); //uses the ArayList method size()
    }

    public E peek()
    {
        if (empty()) // determine whether or not there is an item on the stack
        {
            System.out.println("Peek: Stack Underflow");
            System.exit(0);
        }
        return items.get(items.size()-1); //uses the ArrayList method get(int i)
    } 
}
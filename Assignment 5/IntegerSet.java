public class IntegerSet implements Mergeable
{
  int[] array;
int size;

public IntegerSet()
{
size = 0;
array= new int[100];
}

public IntegerSet(int s, int[] a)
{
size = 0;
array = new int[100];
for(int i = 0; i<s; i++)
{
if(!elementOf(a[i]))
{
add(a[i]);
}
}
}

public void printElements()
{
for(int a = 0; a<size; a++)
{
System.out.print(array[a]+" ");
}
System.out.println();
}

int size()
{
return size;
}

public boolean elementOf(int x)      
{
for(int i = 0; i<size; i++)
{
if(x==array[i])
{
return true;
}
}
return false;
}

public void add(int x)                
{
array[size]=x;
size++;
}
 
public Object merge(Object x)
{
IntegerSet w = new IntegerSet();
IntegerSet l = (IntegerSet)x;

for(int i = 0; i<size; i++)
{
w.array[i]=array[i];
w.size++;
}
for(int i = 0; i<((IntegerSet)x).size; i++)
{
if(!w.elementOf(((IntegerSet)x).array[i]))
{
w.add(((IntegerSet)x).array[i]);
}
}
return w;
}

public boolean equals(Object o) 
{
for(int i = 0; i<size; i++)
{
if(array[i] == ((IntegerSet)o).array[i])
{
return true;
}
}
return false;
}

}
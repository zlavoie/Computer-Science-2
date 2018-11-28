 public class TestIntegerSet
 {
 
 public static void main(String[] args)
  {
     int[] array = {1,2,3,4,5,5,5};
     IntegerSet s = new IntegerSet(7,array);
     IntegerSet t = new IntegerSet();  

     Object mergedSet; 

     for (int i = 10; i >= 3; i--)
          t.add(i);

     System.out.println("The elements of the first set are ");
     s.printElements();
     System.out.println();
     System.out.println("The elements of the second set are ");
     t.printElements();
     System.out.println();

     mergedSet = s.merge(t);
     System.out.println("The sets merged are: ");
     ((IntegerSet)mergedSet).printElements(); // notice the downcast

     int[] array1 = {1,2,3,4,5};
     IntegerSet w = new IntegerSet(5,array1);
     System.out.println("first set equals second set?: " +s.equals(w));
     System.out.println("first set equals second set?:" +s.equals(t));
}

}
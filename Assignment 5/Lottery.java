//Zoe Lavoie
public class Lottery
{
public static void main(String[] args)
{

int[] firstset = {29,2,3,40,59,10};
IntegerSet firstfriend = new IntegerSet(5, firstset);

int[] secondset = {1,19,34,56,22,30};
IntegerSet secondfriend = new IntegerSet(5, secondset);
int[] thirdset = {84,20,399,302,543,234};

IntegerSet thirdfriend = new IntegerSet(5, thirdset);
Object mergedSet = firstfriend.merge(secondfriend);
Object SecondMergedSet2 = (thirdfriend).merge(mergedSet);

((IntegerSet)SecondMergedSet2).printElements();

System.out.println("The size of the set of lottery numbers is: "+((IntegerSet)SecondMergedSet2).size);
}
}
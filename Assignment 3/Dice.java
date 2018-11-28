//Zoe Lavoie

public class Dice
{
private int dice1;
private int dice2;

public Dice()
{
 roll();
}
public void roll()
{
   dice1 = (int)(Math.random()*6+1);
  dice2 = (int)(Math.random()*6+1);
}
public int getDice1()
{
  return dice1;
}

public int getDice2()
{
  return dice2;
}

public int getTotal()
{
  return (dice1+dice2);
}
}
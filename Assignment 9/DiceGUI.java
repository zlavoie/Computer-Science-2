//Zoe Lavoie
import javax.swing.*;
import java.awt.*;

 class DiceGUI extends JFrame
{
  private JLabel die1;
  private JLabel die2;
  private JLabel printoutSum;
  private int sumFirstPanel = 0; 
  private int sumSecondPanel = 0;
  private JPanel a;
  
  
  public DiceGUI()
  {
    super("Dice");
    setBackground(Color.YELLOW);
    setBounds(0,0, 600, 500);
    
    die1= new JLabel();
    die1.setBackground(Color.GREEN);
    
    die2=new JLabel();
    die2.setBackground(Color.GREEN);
    
    a = new JPanel(new BorderLayout());
    sumFirstPanel = roll();
    sumSecondPanel = roll();
   
  
  if(sumFirstPanel==1)
  {
    die1= new JLabel(new ImageIcon("Dice1.PNG")); 
  }
  if(sumFirstPanel==2)
  {
    die1= new JLabel(new ImageIcon("Dice2.GIF")); 
  }
  if(sumFirstPanel==3)
  {
    die1= new JLabel(new ImageIcon("Dice3.PNG")); 
  }
  if(sumFirstPanel==4)
  {
    die1= new JLabel(new ImageIcon("Dice4.PNG"));  
  }
  if(sumFirstPanel==5)
  {
    die1= new JLabel(new ImageIcon("Dice5.PNG"));  
  }
  if(sumFirstPanel==6)
  {
    die1= new JLabel(new ImageIcon("Dice6.PNG"));  
  }
  if(sumSecondPanel==1)
  {
    die2= new JLabel(new ImageIcon("Dice1.PNG"));  
  }
  if(sumSecondPanel==2)
  {
    die2= new JLabel(new ImageIcon("Dice2.GIF"));  
  }
  if(sumSecondPanel==3)
  {
    die2= new JLabel(new ImageIcon("Dice3.PNG"));  
  }
  if(sumSecondPanel==4)
  {
    die2= new JLabel(new ImageIcon("Dice4.PNG"));  
  }
  if(sumSecondPanel==5)
  {
    die2= new JLabel(new ImageIcon("Dice5.PNG"));  
  }
  if(sumSecondPanel==6)
  {
    die2= new JLabel(new ImageIcon("Dice6.PNG"));  
  }

    a.add(die1, BorderLayout.WEST);
    a.add(die2, BorderLayout.EAST);
   
    printoutSum = new JLabel("The sum  of your roll is: " + (sumFirstPanel + sumSecondPanel));
    a.add(printoutSum, BorderLayout.SOUTH); 
    add(a);
  
  
    setVisible(true);
    setResizable(false);
  }
  public static int roll()
  {
      int t = 0;
      
      t = (int)((Math.random()*6)+1);
      return t;
  }
  
  public static void main(String[] args)
  {
    DiceGUI d = new DiceGUI();
    
  }
}
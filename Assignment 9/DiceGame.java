//Zoe Lavoie
import java.awt.*;
import javax.swing.*;

public class DiceGame extends JFrame
{
  private JLabel sum;
  private JLabel image;
  private JPanel panel;
  
  public DiceGame()
  {
    int total; 
    int die1;
    int die2;
    setTitle("Dice Game!");
    setBounds(0,0,560,560);
    setBackground(Color.WHITE);
    
    panel = new JPanel();
    sum = new JLabel("");
    panel.add(sum);
    add(panel, BorderLayout.SOUTH);
    
    die1 = (int)(Math.random()*6) + 1;
    die2 = (int)(Math.random()*6) + 1;
    total = die1 + die2;
    
    sum.setText("You rolled a "+sum);
    
    if (die1 == 1)
    {
      image = new JLabel(new ImageIcon("Dice1"));
      add(image, BorderLayout.WEST);
    }
    else if (die1 == 2)
    {
      image = new JLabel(new ImageIcon("Dice2"));
      add(image, BorderLayout.WEST);
    }
    else if (die1 == 3)
    {
      image = new JLabel(new ImageIcon("Dice3"));
      add(image, BorderLayout.WEST);
    }
    else if (die1 == 4)
    {
      image = new JLabel(new ImageIcon("Dice4"));
      add(image, BorderLayout.WEST);
    }
    else if (die1 == 5)
    {
      image = new JLabel(new ImageIcon("Dice5"));
      add(image, BorderLayout.WEST);
    }
    else if (die1 == 6)
    {
      image = new JLabel(new ImageIcon("Dice6"));
      add(image, BorderLayout.WEST);
    }
  
    if (die2 == 1)
    {
      image = new JLabel(new ImageIcon("Dice1"));
      add(image, BorderLayout.EAST);
    }
    else if (die2 == 2)
    {
      image = new JLabel(new ImageIcon("Dice2"));
      add(image, BorderLayout.EAST);
    }
    else if (die2 == 3)
    {
      image = new JLabel(new ImageIcon("Dice3"));
      add(image, BorderLayout.EAST);
    }
    else if (die2 == 4)
    {
      image = new JLabel(new ImageIcon("Dice4"));
      add(image, BorderLayout.EAST);
    }
    else if (die2 == 5)
    {
      image = new JLabel(new ImageIcon("Dice5"));
      add(image, BorderLayout.EAST);
    }
    else if (die2 == 6)
    {
      image = new JLabel(new ImageIcon("Dice6"));
      add(image, BorderLayout.EAST);
    }
    
    setVisible(true);
  }
  
}
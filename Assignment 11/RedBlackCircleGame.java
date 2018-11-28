//Zoe Lavoie
import java.awt.*;
import java.util.*;
import javax.swing.event.*; 
import javax.swing.*;
import java.awt.event.*;

public class RedBlackCircleGame extends JFrame
{
  private JButton exitButton;
  private JButton resetButton;
  private JPanel gamePanel;
  private JButton[] tiles;
  private int d;
  private JTextField numTilesField;
  JPanel textPanel;
  JLabel numButtons;
  JPanel buttonPanel;
  
  
  public RedBlackCircleGame(int dots)
  {
    d = dots;
    setTitle("Red Black Circle Game");
    setBounds(0,0,500,400);
    setBackground(Color.BLUE);
    
    textPanel = new JPanel();
    numButtons = new JLabel();
    numButtons.setFont(new Font("Times New Roman", Font.BOLD, 20));
    numButtons.setText("Number of buttons:");
    textPanel.add(numButtons);
    numTilesField = new JTextField(20);
    String d = dots + "";
    numTilesField.setText(d);
    
    textPanel.add(numTilesField);
    add(textPanel, BorderLayout.NORTH);

    
    resetButton = new JButton("Reset");
    exitButton = new JButton("Exit");
    
    buttonPanel = new JPanel();
    buttonPanel.add(resetButton);
    buttonPanel.add(exitButton);
    
    gamePanel = new JPanel();
    gamePanel.setLayout(new GridLayout(1,dots));
    
    tiles = new JButton[dots];
    for (int i = 0; i < dots; i++)
      tiles[i] = new JButton();
    
    for(int i = 0; i < dots; i++)
    {
      int c =(int) (Math.random()*2); 
      tiles[i] = new JButton();
      if (c %2 == 0)
      {
        tiles[i].setBackground(Color.BLACK);
        tiles[i].setFont(new Font("", Font.BOLD,12));
        tiles [i].setText("BLACK");
        tiles[i].setEnabled(true);
      }
      else
      {
        tiles[i].setBackground(Color.RED);
        tiles[i].setFont(new Font("", Font.BOLD,12));
        tiles [i].setText("RED");
        tiles[i].setEnabled(false);
      }  
      gamePanel.add(tiles[i]);

      
      
    }
    
    
    add(buttonPanel, BorderLayout.SOUTH);
    add(gamePanel,BorderLayout.CENTER);

    
    resetButton.addActionListener(new ButtonListener());
    exitButton.addActionListener(new ButtonListener());
    
    for (int i = 0; i <dots; i++)
    {
      tiles[i].addActionListener(new ButtonListener());
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
    }
  }
  private class ButtonListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      if (e.getSource() == resetButton)
      {
        System.out.println("How many dots per game?");
        Scanner in = new Scanner(System.in);
        try
    {
        int dots =in.nextInt();
        if(dots<=10)
    {
    RedBlackCircleGame cg = new RedBlackCircleGame (dots);
    cg.setBackground(Color.YELLOW);
    }
    else
        JOptionPane.showMessageDialog(null, "Number has to be less than or equal to 10");
    
    }
    catch(Exception a)
    {
      JOptionPane.showMessageDialog(null, "Number has to be less than or equal to 10");
      System.exit(0);
    }
    
      }
      else if( e.getSource() == exitButton)
        System.exit(0);
      
      else 
      {
     
        for (int i = 0; i < d; i++)
        {
     
          if(e.getSource()==tiles[i])
          {
    
          if(tiles[i]==e.getSource() && tiles[i]==e.getSource()) 
          {
           tiles[i].setBackground(Color.WHITE);
           tiles[i].setText("");
           tiles[i].setEnabled(false);
              
           if(i + 1 < d)
           {
             if (tiles[i + 1].getText().equals("BLACK"))
             {
              tiles[i + 1].setBackground(Color.RED);
              tiles [i + 1].setText("RED");
              tiles [i + 1].setEnabled(false);
              }
             else if (tiles[i + 1].getText().equals("RED"))
              {
               tiles[i + 1].setBackground(Color.BLACK);
               tiles [i + 1].setText("BLACK");
               tiles[i + 1].setEnabled(true);
              }
             }
              
              if (i != 0)
              {
               if (tiles[i - 1].getText().equals("BLACK"))
               {
                tiles[i - 1].setBackground(Color.RED);
                tiles [i - 1].setText("RED");
                tiles [i - 1].setEnabled(false);
                }
               
               else if (tiles[i - 1].getText().equals("RED"))
               {
                tiles[i - 1].setBackground(Color.BLACK);
                tiles [i - 1].setText("BLACK");
                tiles[i - 1].setEnabled(true);
                }
              }
            }
          }
        }
      }
    }
  }
   public static void main(String[] args)
  {
    int d;
    //boolean truth=true;
    System.out.println("How many dots do you want to play with for the game?");
    Scanner input = new Scanner(System.in);
    
    try
    {
     d = input.nextInt();
     
   if(d <= 10)
    {
    RedBlackCircleGame cg = new RedBlackCircleGame (d);
    cg.setVisible(true);
    cg.setResizable(false);
   // truth=true;
    }
    
    else
    {
      //truth = false;
        throw(new Exception());
    
    }
    }
    
    catch(Exception e)
    {
      JOptionPane.showMessageDialog(null, "Number has to be less than or equal to 10");
      d=input.nextInt();
    }
  }
   
}
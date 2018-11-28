//Zoe Lavoie
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CarOrGoat extends JFrame
{
  private JButton exitButton;
  private JButton resetButton;
  private JButton[] board;
  private JPanel bottomPanel;
  private JPanel gamePanel;
  
  int win;
  int turn = 1;
  
   public CarOrGoat()
   {
    setTitle("Car or Goat");
    setBounds(0,0,500,500);
    
    resetButton = new JButton("Reset");
    exitButton = new JButton("Exit");
    
    JPanel bottomPanel = new JPanel ();
    bottomPanel.add(resetButton); //Creates Reset Button
    bottomPanel.add(exitButton);//Creates Exit Button
    add(bottomPanel, BorderLayout.SOUTH);
    
    gamePanel = new JPanel();
    gamePanel.setLayout(new GridLayout(1,3));
    
    board = new JButton[3];
    board[0] = new JButton(); //Door 1
    board[1] = new JButton(); //Door 2
    board[2] = new JButton(); // Door 3

    int j =(int) (Math.random()*3);
    board[j].setText("C");
    
    for(int i = 0; i<3; i++)
    {
      board[i].setFont(new Font("Arial", Font.BOLD,0));
        if (!board[i].getText().equals("C"))
          board [i].setText("G");
      gamePanel.add(board[i]);
    }
    add(gamePanel,BorderLayout.CENTER); 
    resetButton.addActionListener(new ButtonListener());
    exitButton.addActionListener(new ButtonListener());
    
   for (int i = 0; i <3; i++)
    {
      board[i].addActionListener(new ButtonListener());
    }
  }
  
  
   private class ButtonListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      if (e.getSource() == resetButton) //reset button action
      {
        dispose();
       CarOrGoat cg = new CarOrGoat ();
    cg.setVisible(true);
    cg.setResizable(false);
      }
      
      else if( e.getSource() == exitButton) //exit button action
      {
        System.exit(0);
      }
      
      
      else if (turn == 1) 
        {
          for(int j=0; j<3; j++)
          {
            if(turn==1)
            {
            if(e.getSource()!=board[j]&&board[j].getText().equals("G")) 
            {
              board[j].setFont(new Font("Arial", Font.BOLD,72));
              turn++;
            }
            }
            }
          } //End of first Choice
        else if(turn==2)
        {
          if((e.getSource()==board[0])||(e.getSource()==board[1])||(e.getSource()==board[2]))
          {
            for(int z=0;z<3;z++)
            {
              board[z].setFont(new Font("Arial", Font.BOLD,72));
            }
      }
        }   
    }
    }
     public static void main(String[] args)
  {
    CarOrGoat cg = new CarOrGoat ();
    cg.setVisible(true);
    cg.setResizable(false);
  }
  }






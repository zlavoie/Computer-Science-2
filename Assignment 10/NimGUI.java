//Zoe Lavoie
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class NimGUI extends JFrame
{
    private JButton start;
    private JButton quit;
    private JButton play;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel stickLabel;
    private int sticks;
    private int comp;
    private JTextField field1;
    private JTextField field2;
    private JTextField field3;
    private JPanel panel;
    private JPanel p;
    private JPanel buttonPanel;
    
    
    public NimGUI()
    {
       super("NimGUI");
       setBounds(0,0,1200,300);
       panel = new JPanel();
       
       label2 = new JLabel();
       label2.setFont(new Font("Arial", Font.BOLD, 14));
       label2.setText("Starting number of sticks:");
       field2 = new JTextField(15);
       
       panel.add(label2);
       panel.add(field2);
       
       label1 = new JLabel();
       label1.setFont(new Font("Arial", Font.BOLD, 14));
       label1.setText("# of sticks remaining:");
       field1 = new JTextField(15);
       
       panel.add(label1);
       panel.add(field1);
       
       add(panel, BorderLayout.NORTH);
       
       p = new JPanel();
       label3 = new JLabel();
       label3.setFont(new Font("Arial", Font.BOLD, 14));
       label3.setText("Enter how many sticks you want to start,has to be between 5-50, then press START to start the game.");
       p.add(label3);
       
       add(p, BorderLayout.CENTER);
       
       JPanel bPanel = new JPanel();
       label2 = new JLabel();
       label2.setFont(new Font("Arial", Font.BOLD, 14));
       label2.setText("The computer takes: ");
       field3 = new JTextField(15);
       
       panel.add(label2);
       panel.add(field3);
 
       add(bPanel, BorderLayout.EAST);
       
       buttonPanel = new JPanel();
       stickLabel = new JLabel();
       stickLabel.setFont(new Font("Arial", Font.BOLD, 14));
       stickLabel.setText("Click the button with number of sticks you woudl like to take.:");
       button1=new JButton("1");
       button2=new JButton("2");
       button3=new JButton("3");
       start=new JButton("Start");
       quit=new JButton("Quit");
       play=new JButton("Play Again?");
       
       buttonPanel.add(start);
       buttonPanel.add(play);
       buttonPanel.add(quit);
       buttonPanel.add(stickLabel);
       buttonPanel.add(button1);
       buttonPanel.add(button2);
       buttonPanel.add(button3);
       
       add(buttonPanel, BorderLayout.SOUTH);
       
       
       start.addActionListener(new ButtonHandler());
       quit.addActionListener(new ButtonHandler());
       play.addActionListener(new ButtonHandler());
       button1.addActionListener(new ButtonHandler());
       button2.addActionListener(new ButtonHandler());
       button3.addActionListener(new ButtonHandler());
       
       
       
       setResizable(false);
       setVisible(true);
    }
       
       
    
    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
           String s; 
           String t; 
           int x;
           int z1; 
           int z2;
           
            if(e.getSource() == button1)
            {
             
              
                s = field1.getText();
                z1 = Integer.parseInt(s);
                z2 = z1-1;
                t = "" + z2;
                field1.setText(t);
                
                int comp = play(z2);
                field3.setText(comp + "");
                x = z2 - comp;
                field1.setText(x + "");
                
                if(x == 0)
                {
                    field1.setText("computer  wins...");
                }
                
                else if(z2 == 0)
                {
                    field1.setText("YOU WON!!!");
                }
            }
            
            
            if(e.getSource() == button2)
            {
                
                s = field1.getText();
                z1 = Integer.parseInt(s);
                z2 = z1-1;
                t = "" + z2;
                field1.setText(t);
                
                int comp = play(z2);
                field3.setText(comp + "");
                x = z2 - comp;
                field1.setText(x + "");
                
                if(x==0)
                {
                    field1.setText("computer  wins...");
                }
                
                else if(z2 == 0)
                {
                    field1.setText("YOU WON!!!");
                }
            }
            
            
            if(e.getSource() == button3)
            {   
                
                s = field1.getText();
                z1 = Integer.parseInt(s);
                z2 = z1-1;
                
                t = "" + z2;
                field1.setText(t);
                
                
                int comp = play(z2);
                field3.setText(comp + "");
                x = z2 - comp;
                field1.setText(x + "");
                
                if(x == 0)
                {
                    field1.setText("computer  wins...");
                }
                
                else if(z2 == 0)
                {
                    field1.setText("YOU WON!!!");
                }
            }
            
            if(e.getSource() == start)
            {
                s = field2.getText();
                z1 = Integer.parseInt(s);
                t = "" + z1;
                field1.setText(t);
            }
            
            if(e.getSource() == play)
            {
                field1.setText(" ");
                field2.setText(" ");
                field3.setText(" ");
            }
            
            if(e.getSource() == quit)
            {
                System.exit(0);
            }
        }
       }
    
    
    public static int play(int sticks)
    {
        int z = 0;
        
            if(sticks %4 == 0)
            {
                z = (int)(3*Math.random()+1);
            }
            else if(sticks %4 != 0)
            {
                z = sticks %4;
            }
            
           return z;    
    }

   public static void main(String[]args)
    {
       NimGUI n = new NimGUI();
    }

}       
//Zoe Lavoie
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;


public class CalculatorGUI extends JFrame
{
  private JButton add;
  private JButton sub;
  private JButton mult;
  private JButton div;
  private JTextField field1;
  private JTextField field2;
  private JPanel p;
  private JPanel panel;
  private JLabel answer;
  
  public CalculatorGUI()
  {
    super("CalculatorGUI");
    setBounds(0,0,600,600);
    p = new JPanel();
   
    field1=new JTextField(20);
    field2=new JTextField(20);
    answer = new JLabel();
    answer.setFont(new Font("Arial",Font.BOLD,12));
    answer.setText("Answer:");
    
    
    p.add(field1);
    p.add(field2);
    p.add(answer);
    add(p,BorderLayout.CENTER);
    
    
    panel =new JPanel();
    add=new JButton("+");
    sub=new JButton("-");
    mult=new JButton("*");
    div=new JButton("/");
    
    
    panel.add(add);
    panel.add(sub);
    panel.add(mult);
    panel.add(div);
    add(panel,BorderLayout.SOUTH);
    
    
    mult.addActionListener(new ButtonListener());
    div.addActionListener(new ButtonListener());
    add.addActionListener(new ButtonListener());
    sub.addActionListener(new ButtonListener());
    
    
    
    setResizable(false);
    setVisible(true);
    
  }
  private class ButtonListener implements ActionListener 
  {
    public void actionPerformed(ActionEvent e)
    {
      double f1;
      double f2;
      double solution;
      
      if(e.getSource()==add)
        try
         {
          f1 = Double.parseDouble(field1.getText());
          f2 = Double.parseDouble(field2.getText());
          solution = f1 + f2;
          answer.setText("The solution is:"+ solution +"  !");
         }
        catch(NumberFormatException ex)
         {
          answer.setText("Information Error.  Try again");
         }
        
    
      else if(e.getSource()==sub)
        try
         {
          f1 = Double.parseDouble(field1.getText());
          f2 = Double.parseDouble(field2.getText());
          solution = f1 + f2;
          answer.setText("The solution is:"+ solution +"  !");
         }
        catch(NumberFormatException ex)
         {
          answer.setText("Information Error.  Try again");
         }
      
        
      if(e.getSource()==mult)
        try
         {
          f1 = Double.parseDouble(field1.getText());
          f2 = Double.parseDouble(field2.getText());
          solution = f1 + f2;
          answer.setText("The solution is:"+ solution +"  !");
         }
        catch(NumberFormatException ex)
         {
          answer.setText("Information Error.  Try again");
         }
       
        
      else if(e.getSource()==div)
        try
         {
          f1 = Double.parseDouble(field1.getText());
          f2 = Double.parseDouble(field2.getText());
          solution = f1 + f2;
          answer.setText("The solution is:"+ solution +"  !");
         }
        catch(NumberFormatException ex)
         {
          answer.setText("Information Error.  Try again");
         }
    }
  }
  public static void main(String[]args)
  {
    CalculatorGUI c = new CalculatorGUI();
  }
}
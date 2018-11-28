//Zoe Lavoie and Catherine Gianettie
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ReverseGuiConstructor extends JFrame
{
  private JTextField normalString;
  private JTextField reverseString;
  private JButton reverseButton;
  
  
    public ReverseGuiConstructor ()
    {
      super ("Reverse the text");
      setBounds (0,0,300,300);
      JPanel panelCenter = new JPanel ();
      
      JLabel normalLabel = new JLabel();
      normalLabel.setFont(new Font ("Times New Roman", Font.BOLD, 12));
      normalLabel.setText(" String");
      normalString = new JTextField (20);
      panelCenter.add(normalLabel);
      panelCenter.add(normalString);
      
      JLabel reverseLabel = new JLabel();
      reverseLabel.setFont(new Font ("Times New Roman", Font.BOLD, 12));
      reverseLabel.setText("Reverse");
      reverseString = new JTextField (20);
      panelCenter.add(reverseLabel);
      panelCenter.add(reverseString);
                           
      add(panelCenter, BorderLayout.CENTER);      //adding text fields to page via border layout
      
                           
      reverseButton = new JButton ("Reverse");
      JPanel bottomPanel = new JPanel ();
      bottomPanel.add(reverseButton);
      
      add(bottomPanel, BorderLayout.SOUTH);
                   
      reverseButton.addActionListener(new ButtonListener()); //registered JButton
      reverseString.addActionListener(new ButtonListener());
      normalString.addActionListener(new ButtonListener());
      
      
      
      setResizable(false);
      setVisible(true);                      
 }
    
     private class ButtonListener implements ActionListener
     {
       public void actionPerformed(ActionEvent e)
       {
        if (e.getSource() == reverseButton  || e.getSource() == normalString) 
        {
          String input; //input string
          String output=""; //reversed string
          input = normalString.getText();
          
            for ( int i = input.length() - 1 ; i >= 0 ; i-- ) //reverses string
              output = output + input.charAt(i);
            reverseString.setText(output +"");
         }
       }
     }
}
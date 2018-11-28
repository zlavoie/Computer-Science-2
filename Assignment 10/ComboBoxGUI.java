//Zoe Lavoie
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ComboBoxGUI extends JFrame
  {
    private JPanel p;
    private JComboBox pickColor;
    private String[] choice; 
  
  
 public ComboBoxGUI()
  {
     super("ComboBoxGUI");
     setBounds(0,0,300,300);
   
     p = new JPanel();
     p.setBackground(Color.RED);
   
     choice = new String[4];
     choice[0]="Red";
     choice[1]="Blue";
     choice[2]="Green";
     choice[3]="Yellow";
   
     pickColor = new JComboBox(choice);
   
     p.add(pickColor);
     add(p, BorderLayout.CENTER);
   
     pickColor.addActionListener(new ColorHandler());
   
   
     setVisible(true);
     setResizable(false);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 
 
 private class ColorHandler implements ActionListener
 {
   public void actionPerformed(ActionEvent e)
   {
     
     if(e.getSource()==pickColor)
     {
       if(pickColor.getSelectedItem().equals("Red"))
         p.setBackground(Color.RED);
       
       else if(pickColor.getSelectedItem().equals("Yellow"))
         p.setBackground(Color.YELLOW);
    
       else if(pickColor.getSelectedItem().equals("Green"))
         p.setBackground(Color.GREEN);
     
       else if(pickColor.getSelectedItem().equals("Blue"))
         p.setBackground(Color.BLUE);
     
       
     }
   }
 }
   public static void main(String[] args)
 {
   ComboBoxGUI cb = new ComboBoxGUI();
 }
}
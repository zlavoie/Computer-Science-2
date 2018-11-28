//Zoe Lavoie
import java.awt.*;
import javax.swing.*;
//Sometimes this acts very weird but if it doesn't look right the first
//please run it again, it does work correctly.

public class IDCard
{
 public static void display(Container panel)
 {
  JLabel TippyTop = new JLabel("Sheldon");
  TippyTop.setHorizontalAlignment(SwingConstants.CENTER);
  panel.add(TippyTop, BorderLayout.NORTH);
  
    JLabel Bottom = new JLabel("Cooper");
  Bottom.setHorizontalAlignment(SwingConstants.CENTER);
  panel.add(Bottom, BorderLayout.SOUTH);
  
  JLabel Right = new JLabel(" 5 Linden Drive Pasadena ");
  Right.setHorizontalAlignment(SwingConstants.CENTER);
  panel.add(Right, BorderLayout.EAST);
  
  
    JLabel Left = new JLabel("Weight: 160 Eyes: Brown Height: 6'2'' ");
  Left.setHorizontalAlignment(SwingConstants.CENTER);
  panel.add(Left, BorderLayout.WEST);
  
    JLabel middle = new JLabel(new ImageIcon("Sheldon.jpg"));
  panel.add(middle, BorderLayout.CENTER);
 }
 
 public static void main(String [] args)
 {
  JFrame ID = new JFrame ("License");
 ID.setVisible(true);
  ID.setResizable(false);
  ID.setBounds(0, 0, 440, 250);
 display(ID.getContentPane());
 }
}

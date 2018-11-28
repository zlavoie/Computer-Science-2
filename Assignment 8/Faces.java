//Zoe Lavoie

import javax.swing.*;
import java.util.Random;

public class Faces extends JFrame
{
 public Faces()
 {
  super("Faces");
  setBounds(0,0,500,500);
  setResizable(false);
  
  //Buttons
  JButton first = new JButton("Homer");
  JButton second = new JButton("Marge");
  JButton third = new JButton("Bart"); 
 first.setBounds(15, 10, 100, 50);
 second.setBounds(195, 10, 100, 50);
 third.setBounds(380, 10, 100, 50);
  add(first);
  add(second);
  add(third);
  
  //Randomize
  Random rand = new Random();
  int randpic = (rand.nextInt(3)+1);
  
  //Switch Statements Depending on Random Generating
  switch(randpic)
  {
  case 1:
      JLabel FirstPic = new JLabel(new ImageIcon("Marge.jpg"));
   FirstPic.setBounds(150, 100, 300, 300);
   JLabel FirstText = new JLabel("Hey sweetie!");
   FirstText.setBounds(220, 374, 235, 105);
   add(FirstText);
   add(FirstPic);
   break;
   
  case 2:
   JLabel SecondPic = new JLabel(new ImageIcon("Homer.jpg"));
   SecondPic.setBounds(150, 100, 300, 300);
   JLabel SecondText = new JLabel("Mmmmm.... Food!");
   SecondText.setBounds(220, 374, 235, 105);
   add(SecondText);
   add(SecondPic);
   break;
   
  case 3:
   JLabel ThirdPic = new JLabel(new ImageIcon("Bart.jpg"));
  ThirdPic.setBounds(150, 100, 300, 300);
   JLabel ThirdText = new JLabel("I didn't do it!");
   ThirdText.setBounds(220, 374, 235, 105);
   add(ThirdText);
   add(ThirdPic);
   break;
   
  default:
   break;
  }
 }
 
 public static void main(String [] args)
 {
  JFrame frame = new Faces();
  frame.setVisible(true);
 }
}
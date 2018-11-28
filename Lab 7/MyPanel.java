import java.util.*;
import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel
{
 private int x;
 private int y;
 private int radius; // position and size of circle
 private Color color;

  public MyPanel() // default constructor; sets x,y, and radius
  {
 x=0;
 y=0;
 radius=0;
  }

  public void paintComponent(Graphics  g)
  {
super.paintComponent(g);
setBackground(Color.WHITE);
g.setColor(Color.BLUE);
g.fillOval(x,y,100,100);
  } 

  public void setColor(int r, int g, int b)
  {

       repaint();
  }

  public void setPositionAndRadius(int x,int y, int radius)
  {
 x = this.x;
 y=this.y;
 radius=this.radius;
    repaint();
  }

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);
    JFrame frame = new JFrame();
    frame.setBounds(0,0, 400,400);
    MyPanel panel = new MyPanel();

    frame.add(panel);
    frame.setVisible(true);

    String answer  = "y";
    while (answer.equals("y"))
    {
       //make the changes here
    System.out.println("Please enter a new color (This is done by three integers. ex: (255 0 0)): ");
    int R=input.nextInt();
    int G=input.nextInt();
    int B=input.nextInt();
   panel.setColor(R,G,B);
    System.out.println();
    
      System.out.println("Please enter a new position,");
      System.out.println("X: ");
      int X=input.nextInt();
      System.out.println("Y: ");
      int Y=input.nextInt();
      System.out.println("Please enter a new radius: ");
      int Radius=input.nextInt();
    panel.setPositionAndRadius(X, Y, Radius);
    System.out.println();
    
    System.out.println("Do you wish to change the circle again? (Enter y or n)");
    answer =input.next();
    }

 }
}
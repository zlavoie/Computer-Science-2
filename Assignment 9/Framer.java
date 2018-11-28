import java.util.*;
import javax.swing.*;

public class Framer
{
   public static void main(String[] args)
  {
     Scanner scan = new Scanner(System.in);
     System.out.print("How many rectangles?: ");
     int numRect = scan.nextInt();

    JFrame j = new JFrame();
    j.setBounds(0,0,500,500); 

    JPanel A = new TunnelVision(numRect);
    j.add(A);  

    j.setVisible(true);
     j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}
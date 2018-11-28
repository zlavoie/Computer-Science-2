import java.util.*;
import javax.swing.*;

public class FramerRecursive
{
   public static void main(String[] args)
  {
    
     Scanner scan = new Scanner(System.in);
     System.out.print("How many rectangles: ");
     int num = scan.nextInt();

    JFrame j= new JFrame();
    j.setBounds(0,0,500,500); 

    JPanel b = new TunnelVisionRecursive(num);
    j.add(b); 

    j.setVisible(true);
     j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}
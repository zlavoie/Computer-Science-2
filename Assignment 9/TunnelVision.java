//Zoe Lavoie
import javax.swing.*;
import java.awt.*;


public class TunnelVision extends JPanel
{
  Point a,b,c,d; 
   int counter;  

     public TunnelVision(int counter) 
    {
       Point a=new Point(0,0);
       Point b=new Point(0,200);
       Point c=new Point(200,200);
       Point d=new Point(200,0);
       this.counter=counter;
     }
     
  public void paintComponent(Graphics g)
   {
       super.paintComponent(g);
       draw (counter, g);  
   }
   
  void draw(int counter, Graphics g) 
  {
       Point a=new Point(150,300);
       Point b=new Point(300,300);
       Point c=new Point(300,150);
       Point d=new Point(150,150);
       
       int ax;
       int ay;
       ax=(int)a.getX();
       ay=(int)a.getY();
       
       int bx;
       int by;
       bx=(int)b.getX();
       by=(int)b.getY();
       
       int cx;
       int cy;
       cx=(int)c.getX();
       cy=(int)c.getY();
       
       int dx;
       int dy;
       dx=(int)d.getX();
       dy=(int)d.getY();
      
    for(int i=0;i<counter;i++)
    {
      g.drawLine(ax, ay, bx, by);
      g.drawLine(bx, by, cx, cy);
      g.drawLine(cx, cy, dx, dy); 
      g.drawLine(dx, dy, ax, ay);
      
      int f = ax;
      int z = ay;
      
      ax = (ax + bx)/2;
      ay = (ay + by)/2;
      bx = (bx + cx)/2;
      by = (by + cy)/2;
      cx = (cx + dx)/2;
      cy = (cy + dy)/2;
      dx = (dx + f)/2;
      dy = (dy + z)/2;
}    
}
}




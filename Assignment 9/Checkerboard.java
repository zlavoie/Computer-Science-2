//Zoe Lavoie
import java.awt.*;
import javax.swing.*;

public class Checkerboard extends JFrame 
{
    public class Black extends JPanel
    {
      
     public void paintComponent(Graphics g)  
       {
         super.paintComponent(g);
         setBackground(Color.GREEN);
         
         g.setColor(Color.BLACK);
         g.fillOval(40,40,25,25); 
       }
     }
    
    
     public class Red extends JPanel
      {
        public void paintComponent(Graphics g)  
      {
        super.paintComponent(g);
        setBackground(Color.GREEN);
    
        g.setColor(Color.RED);
        g.fillOval(40,40,25,25); 
      }
     }
    

    public class White extends JPanel
      {
        public void paintComponent(Graphics g)  
       {
         super.paintComponent(g);
         setBackground(Color.WHITE);
       }
      }
    
    public class Green extends JPanel
      {
       public void paintComponent(Graphics g) 
        {
          super.paintComponent(g);
          setBackground(Color.GREEN);   
        } 
      } 
    
    public Checkerboard()
    {
        char table [][] = new char[][]{
          {'W', 'R', 'W', 'R', 'W', 'R', 'W', 'R'},        //this was so annoying to do                       
          {'R', 'W', 'R', 'W', 'R', 'W', 'R', 'W'},
          {'W', 'G', 'W', 'G', 'W', 'G', 'W', 'G'},
          {'G', 'W', 'G', 'W', 'G', 'W', 'G', 'W'},
          {'W', 'G', 'W', 'G', 'W', 'G', 'W', 'G'},
          {'G', 'W', 'G', 'W', 'G', 'W', 'G', 'W'},
          {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
          {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
        };  
        
        setLayout(new GridLayout(8,8));
        setBounds(0,0,800,800);
      
        for(int c = 0; c < 8; c++)
        {
            for(int d = 0; d< 8; d++)                                                         
            {
                if(table[c][d] == 'W')
                {
                    add(new White());
                }
                else if(table[c][d] == 'B')
                {
                    add(new Black());
                }
                else if(table[c][d] == 'R')
                {
                    add(new Red());
                }
                else 
                {
                    add(new Green());
                }
            }
        } 
              setVisible(true);
              setResizable(false);
    }
    public Checkerboard(char [][] table)                                                                        
    {
        setLayout(new GridLayout(8,8));
        setBounds(0,0,650,650);
      
        for(int a = 0; a < 8; a++)
        {
            for(int b = 0; b < 8; b++)
            {
                if(table[a][b] == 'W')
                {
                    add(new White());
                }
                else if(table[a][b] == 'B')
                {
                    add(new Black());
                }
                else if(table[a][b] == 'R')
                {
                    add(new Red());
                }
                else 
                {
                    add(new Green());
                }
            }
        }
              setVisible(true);
              setResizable(false);
    }
}

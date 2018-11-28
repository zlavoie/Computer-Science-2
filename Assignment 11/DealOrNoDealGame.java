//Zoe Lavoie
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class DealOrNoDealGame extends JFrame
{
   private JLabel[] right;
   private JLabel[] left; 
   private JButton[] cases;
   private JLabel directions;
   private JPanel leftSide;
   private JPanel rightSide;
   private JPanel directionPanel;
   private JPanel buttons;
   private int count=0;
   private int average;
   private int end;
   private int a;
   private int yourCase;
   
   
   public DealOrNoDealGame()
    {
      super("Deal or No Deal");
      count=0;
      left=new JLabel[15];
      right=new JLabel[15];
      cases= new JButton[29];
      
      setBounds(200,200,500,500);


      leftSide = new JPanel(new GridLayout(13,1));
      rightSide = new JPanel(new GridLayout(13,1));
      directionPanel = new JPanel();
      
      buttons = new JPanel();
      left[0] = new JLabel("$0");
      left[1] = new JLabel("$1");
      left[2] = new JLabel("$5");
      left[3] = new JLabel("$10");
      left[4] = new JLabel("$25");
      left[5] = new JLabel("$50");
      left[6] = new JLabel("$75");
      left[7] = new JLabel("$100");
      left[8] = new JLabel("$200");
      left[9] = new JLabel("$300");
      left[10] = new JLabel("$400");
      left[11] = new JLabel("$500");
      left[12] = new JLabel("$750");
      right[0] = new JLabel("$1000");
      right[1] = new JLabel("$5000");
      right[2] = new JLabel("$10000");
      right[3] = new JLabel("$25000");
      right[4] = new JLabel("$50000");
      right[5] = new JLabel("$75000");
      right[6] = new JLabel("$100000");
      right[7] = new JLabel("$200000");
      right[8] = new JLabel("$300000");
      right[9] = new JLabel("$400000");
      right[10] = new JLabel("$500000");
      right[11] = new JLabel("$750000");
      right[12] = new JLabel("$1000000");
      
      directions = new JLabel("Choose your suitcase!");
      directions.setFont(new Font("Times New Roman",Font.BOLD,18));
      
      for(int i = 0;i<26;i++)
      {
        cases[i]=new JButton(i + 1+"");
        cases[i].addActionListener(new ButtonListener());
      }
      
      for(int i=0;i<13;i++)
      {
      leftSide.add(left[i],BorderLayout.WEST);
      }
      
      for(int i=0;i<13;i++)
      {
      rightSide.add(right[i],BorderLayout.EAST);
      }
      
      directionPanel.add(directions);
      add(directionPanel,BorderLayout.SOUTH);
      directionPanel.setBackground(Color.PINK);
       
      add(rightSide,BorderLayout.EAST);
      rightSide.setBackground(Color.RED);
      
      add(leftSide,BorderLayout.WEST);
      leftSide.setBackground(Color.YELLOW);
      
      add(buttons,BorderLayout.CENTER);
      buttons.setBackground(Color.GREEN);
      
      
      for(int i=0;i<26;i++)
      {
      buttons.add(cases[i],BorderLayout.CENTER);
      }
      
     Shuffle.shuffle(cases);
     }

    private class ButtonListener implements ActionListener 
    {
     public void actionPerformed(ActionEvent e)
     { 
       for(int i=0;i<26;i++)
       {
         if(e.getSource()==cases[i])
         {
           if(count==0)
           {
             if(i<13)
              {
               String money = left[i].getText();
               a = money.length();
               String cash  = money.substring(1,a);
               yourCase = Integer.parseInt(cash);

               }
               else 
               {
                String money=right[i-13].getText();
                a = money.length();
                String cash =money.substring(1,a);
                yourCase = Integer.parseInt(cash);

               }
           
             cases[i].setVisible(false);
             count++;
             directions.setText("Open 6 cases");
            }
           
           else if(count > 0)
           {
             if(count<7)
             {
               directions.setText("Open "+(6-count)+" case(s)");
               cases[i].setVisible(false);
               if(i<13)
               {
                 String money = left[i].getText();
                 a = money.length();
                 String cash =money.substring(1, a);
                 average += Integer.parseInt(cash);
                 left[i].setVisible(false);
               }
               
               else 
               {
                 String money=right[i-13].getText();
                 a=money.length();
                 String cash =money.substring(1, a);
                 average += Integer.parseInt(cash);
                 right[i-13].setVisible(false);
               }
               count++;
             }
             
            if((count<12)&&(count>6))
             {
               directions.setText("Open "+(12-count)+" case(s)");
               cases[i].setVisible(false);
               
               if(i<13)
               {
                String money = left[i].getText();
                a=money.length();
                String cash = money.substring(1, a);
                average += Integer.parseInt(cash);
                left[i].setVisible(false);
               }
               
               else
               {
                 String money = right[i-13].getText();
                 a = money.length();
                 String cash = money.substring(1, a);
                 average += Integer.parseInt(cash);
                 right[i-13].setVisible(false);
               }
               
              if(count==7)
               {
                 end=JOptionPane.showConfirmDialog(null, "You have opened 6 suitcases.\n There are 19 left unopened.\nThe bank offers you $"+((average/6)*0.25),null,0);
                 if(end==0)
                 {
                   JOptionPane.showMessageDialog(null,"You Won $"+((average/6)*0.25));
                   System.exit(0);
                 }
               }
               count++;
             }
            
             else if((count<16)&&(count>11))
             {
               directions.setText("Open "+(16-count)+" case(s)");
               cases[i].setVisible(false);
               
               if(i<13)
               {
                String money = left[i].getText();
                a = money.length();
                String cash = money.substring(1, a);
                average += Integer.parseInt(cash );
                left[i].setVisible(false);
               }
               
               else
               {
                 String money = right[i-13].getText();
                 a = money.length();
                 String cash = money.substring(1, a);
                 average += Integer.parseInt(cash );
                 right[i-13].setVisible(false);
               }
               
               if(count==12)
               {
                 end=JOptionPane.showConfirmDialog(null, "You have opened 11 suitcases.\n There are 14 left unopened.\nThe bank offers you $"+((average/6)*0.25),null,0);
                 if(end==0)
                 {
                   JOptionPane.showMessageDialog(null,"You Won $"+((average/6)*0.25));
                   System.exit(0);
                 }
               }
               count++;
             }
             
              else if((count>15)&&(count<19))
              {
               directions.setText("Open "+(19-count)+" case(s)");
               cases[i].setVisible(false);
               
               if(i<13)
               {
                String money = left[i].getText();
                a = money.length();
                String cash = money.substring(1, a);
                average += Integer.parseInt(cash);
                left[i].setVisible(false);
               }
               
               else
               {
                 String money = right[i-13].getText();
                 a = money.length();
                 String cash =money.substring(1, a);
                 average += Integer.parseInt(cash);
                 right[i-13].setVisible(false);
               }
               
               if(count==16)
               {
                 end=JOptionPane.showConfirmDialog(null, "You have opened 15 suitcases.\n There are 10 left unopened.\nThe bank offers you $"+((average/6)*0.25),null,0);
                 if(end==0)
                 {
                   JOptionPane.showMessageDialog(null,"You Won $"+((average/6)*0.25));
                   System.exit(0);
                 }
               }
               count++;
             }
              
             else if((count>18)&&(count<21))
             {
               directions.setText("Open "+(21-count)+" case(s)");
               cases[i].setVisible(false);
               
               if(i<13)
               {
                String money = left[i].getText();
                a = money.length();
                String cash = money.substring(1, a);
                average += Integer.parseInt(cash);
                left[i].setVisible(false);
               }
               
               else
               {
                 String money = right[i-13].getText();
                 a = money.length();
                 String cash =money.substring(1, a);
                 average += Integer.parseInt(cash);
                 right[i-13].setVisible(false);
               }
               
               if(count==19)
               {
                 end=JOptionPane.showConfirmDialog(null, "You have opened 18 suitcases.\n There are 7 left unopened.\nThe bank offers you $"+((average/6)*0.25),null,0);
                 if(end==0)
                 {
                   JOptionPane.showMessageDialog(null,"You Won $"+((average/6)*0.25));
                   System.exit(0);
                 }
               }
               count++;
             }
             
              else if((count>20)&&(count<22))
              {
               directions.setText("Open "+(22-count)+" case(s)");
               cases[i].setVisible(false);
               
               if(i<13)
               {
                String money = left[i].getText();
                a = money.length();
                String cash = money.substring(1, a);
                average += Integer.parseInt(cash);
                left[i].setVisible(false);
               }
               
               else
               {
                 String money = right[i-13].getText();
                 a = money.length();
                 String cash =money.substring(1, a);
                 average += Integer.parseInt(cash);
                 right[i-13].setVisible(false);
               }
               
              if(count==21)
               {
                 end=JOptionPane.showConfirmDialog(null, "You have opened 20 suitcases.\n There are 5 left unopened.\nThe bank offers you $"+((average/6)*0.25),null,0);
                 if(end==0)
                 {
                   JOptionPane.showMessageDialog(null,"You Won $"+((average/6)*0.25));
                   System.exit(0);
                 }
               }
               count++;
             }
              
            else if((count>21)&&(count<23))
             {
               directions.setText("Open "+(23-count)+" case(s)");
               cases[i].setVisible(false);
               
               if(i<13)
               {
                String money = left[i].getText();
                a = money.length();
                String cash =money.substring(1, a);
                average += Integer.parseInt(cash);
                left[i].setVisible(false);
               }
               
               else
               {
                 String money = right[i-13].getText();
                 a = money.length();
                 String cash =money.substring(1, a);
                 average += Integer.parseInt(cash);
                 right[i-13].setVisible(false);
               }
               count++;
             }
            
             else if((count>22)&&(count<24))
             {
              if(count==23)
               {
                 end=JOptionPane.showConfirmDialog(null, "You have opened 22 suitcases.\n There are 3 left unopened.\nThe bank offers you $"+((average/6)*0.25),null,0);
                 if(end==0)
                 {
                   JOptionPane.showMessageDialog(null,"You Won $"+((average/6)*0.25));
                   System.exit(0);
                 }
               }
               directions.setText("Open "+(24-count)+" case(s)");
               cases[i].setVisible(false);
               
               if(i<13)
               {
                String money = left[i].getText();
                a = money.length();
                String cash = money.substring(1, a);
                average += Integer.parseInt(cash);
                left[i].setVisible(false);
               }
               
               else
               {
                 String money = right[i-13].getText();
                 a = money.length();
                 String cash =money.substring(1, a);
                 average += Integer.parseInt(cash);
                 right[i-13].setVisible(false);
               }
               
              if(count==22)
               {
                 end=JOptionPane.showConfirmDialog(null, "You have opened 21 suitcases.\n There are 4 left unopened.\nThe bank offers you $"+((average/6)*0.25),null,0);
                 if(end==0)
                 {
                   JOptionPane.showMessageDialog(null,"You Won $"+((average/6)*0.25));
                   System.exit(0);
                 }
               }
               count++;
             }
             
             else if((count>23)&&(count<25))
             {
               directions.setText("Open "+(25-count)+" case(s)");
               cases[i].setVisible(false);
               
               if(i<13)
               {
                String money = left[i].getText();
                a = money.length();
                String cash = money.substring(1, a);
                average += Integer.parseInt(cash);
                left[i].setVisible(false);
               }
               
               else
               {
                 String money = right[i-13].getText();
                 a = money.length();
                 String cash = money.substring(1, a);
                 average += Integer.parseInt(cash);
                 right[i-13].setVisible(false);
               }
               count++;
               
              if(count==24)
               {
                 end=JOptionPane.showConfirmDialog(null, "You have opened 23 suitcases.\n There are 2 left unopened.\nThe bank offers you $"+((average/6)*0.25),null,0);
                 if(end==0)
                 {
                   JOptionPane.showMessageDialog(null,"You Won $"+((average/6)*0.25));
                   System.exit(0);
                 }
               }
             }
             
            else if((count>24)&&(count<26))
             {
               directions.setText("Open "+(26-count)+" case(s)");
               cases[i].setVisible(false);
               
               if(i<13)
               {
                String money = left[i].getText();
                a = money.length();
                String cash = money.substring(1, a);
                average += Integer.parseInt(cash);
                left[i].setVisible(false);
               }
               
               else
               {
                 String money = right[i-13].getText();
                 a = money.length();
                 String cash = money.substring(1, a);
                 average += Integer.parseInt(cash);
                 right[i-13].setVisible(false);
               }
               
              if(count==25)
               {
                 end=JOptionPane.showConfirmDialog(null, "You have opened 24 suitcases.\n There is 1 left unopened.\nThe bank offers you $"+((average/6)*0.25),null,0);
                 if(end==0)
                 {
                   JOptionPane.showMessageDialog(null,"You Won $"+((average/6)*0.25));
                   System.exit(0);
                 }
               }
               count++;
             }
            
            else if((count>25)&&(count<27))
             {
             
               directions.setText("Open "+(27-count)+" case(s)");
               cases[i].setVisible(false);
               
               if(i<13)
               {
                String money = left[i].getText();
                a = money.length();
                String cash = money.substring(1, a);
                average += Integer.parseInt(cash);
                left[i].setVisible(false);
               }
               
               else
               {
                 String money = right[i-13].getText();
                 a = money.length();
                 String cash = money.substring(1, a);
                 average += Integer.parseInt(cash );
                 right[i-13].setVisible(false);
               }
               
              if(count==26)
               {
                 end=JOptionPane.showConfirmDialog(null, "You have opened 25 suitcases.\n There are 0 left unopened.\nThe bank offers you $"+((average/6)*0.25),null,0);
                 if(end==0)
                 {
                   JOptionPane.showMessageDialog(null,"You Won $"+((average/6)*0.25));
                   System.exit(0);
                 }
                 
               else if(end==1)
                 {
                   JOptionPane.showMessageDialog(null,"Your case has $"+yourCase);
                   System.exit(0);
                 }
               }
               count++;
             }        
           }
         }
       }
     }
   }

   public static void main(String[] args)
  {
        DealOrNoDealGame dg = new DealOrNoDealGame();
        dg.setVisible(true);
        dg.setResizable(false);
        dg. setDefaultCloseOperation(dg.EXIT_ON_CLOSE);
   }

}
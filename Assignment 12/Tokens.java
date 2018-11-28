//Zoe Lavoie
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Tokens extends JFrame
{
 private String expression;
 private String token;
 private int num;
 private Stack s = new Stack(50);
 private String postfix;
 private int operand;
 private String important;
 private boolean truth;
 private String readpost;
 private String together;
 
  private JLabel TopTitle;
   private JLabel MiddleTitle;
    private JLabel BottomTitle;
  private JTextField postfixx;
  private JTextField evaluate;
   private JTextField result;
   private JPanel northPanel;
   private JPanel centerPanel;
   private JPanel southPanel;
  private JButton Postfix;
  private JButton Evaluate;
  private JButton Clear;
  private JButton Exit;
  
      public static void main(String[] args)
     {
          Tokens t = new Tokens();
     }
      
   public Tokens()
{
     together="";
     readpost="";
  expression = "";
  token = "";
  num = 0;
  postfix="";
  operand=0;
  important="";
  truth = true;
  
    setBounds(0,0,500,500);
    northPanel = new JPanel();
    TopTitle = new JLabel("Infix: ");
    TopTitle.setHorizontalAlignment(JLabel.CENTER);
    TopTitle.setVerticalAlignment(JLabel.CENTER);
    northPanel.add(TopTitle);
    postfixx = new JTextField(36);
    postfixx.setHorizontalAlignment(JLabel.CENTER);
    northPanel.add(postfixx);
    add(northPanel, BorderLayout.NORTH);

    centerPanel = new JPanel();
    MiddleTitle = new JLabel("Postfix: ");
    MiddleTitle.setHorizontalAlignment(JLabel.CENTER);
    MiddleTitle.setVerticalAlignment(JLabel.CENTER);
    centerPanel.add(MiddleTitle);
    evaluate= new JTextField(38);
    evaluate.setHorizontalAlignment(JLabel.CENTER);
    centerPanel.add(evaluate);
    add(centerPanel, BorderLayout.CENTER);
    
    southPanel = new JPanel();
    BottomTitle = new JLabel("Result: ");
    BottomTitle.setHorizontalAlignment(JLabel.CENTER);
BottomTitle.setVerticalAlignment(JLabel.CENTER);
    centerPanel.add(BottomTitle);
    result = new JTextField(38);
    result.setHorizontalAlignment(JLabel.CENTER);
    centerPanel.add(result);
    
    Postfix = new JButton("PostFix");
    Evaluate = new JButton("Evaluate");
    Clear = new JButton("Clear");
    Exit = new JButton("Exit");
    
    southPanel.add(Postfix); southPanel.add(Evaluate); southPanel.add(Clear); southPanel.add(Exit);
    add(southPanel, BorderLayout.SOUTH);
    setVisible(true);
    
    Postfix.addActionListener(new ButtonHandler());
    Evaluate.addActionListener(new ButtonHandler());
    Clear.addActionListener(new ButtonHandler());
    Exit.addActionListener(new ButtonHandler());
   }

    
 public static boolean isNumeric(String str)  
{  
  try  
  {  
    double d = Double.parseDouble(str);  
  }  
  catch(NumberFormatException nfe)  
  {  
    return false;  
  }  
  return true;  
}
 
 public int Evaluate(String postfix)
 {
   int num=0;
   int num2=0;
   int total=0;
   int count=0;
 Scanner input = new Scanner(postfix);
 
                    while (input.hasNext())
                    {
                      count=count+1;
                             readpost = input.next();  // reads from postfix

                               if(count!=1)
                               {
                                 if(isNumeric(readpost)==true)
                                 {
                              num = Integer.parseInt(readpost);
                                 }
                                if((readpost.equals("*"))){
                                total=total*num;
                              }
                              if(readpost.equals("+")){
                                total=total+num;
                              }
                              if(readpost.equals("-")){
                                total=total-num;
                              }
                                 if(readpost.equals("/")){

                                   if(total==total/0)
                                   {
                                      result.setText("99999999");
                                      Object[] options = { "OK", "CANCEL" };
JOptionPane.showOptionDialog(null, "Click OK to continue", "No divide by 0", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
                                   }

                                   total=total/num;
                               }
                             }
                               else
                               {
                           total=Integer.parseInt(readpost);  
                               }
                    } 
                    return total;
                    }
                    
 
   
 public String ConvertInfix()
 {
  // Scanner scan = new Scanner(System.in);
//  System.out.println("Please insert an infix expression: ");
 // expression=scan.next();
StringTokenizer  st = new StringTokenizer(expression, ")(*+-/", true);
while (st.hasMoreTokens())
{
      token = st.nextToken();
      token = token.trim();   // strips off any whitespace;
      if(isNumeric(token) == true)
      {
        postfix = postfix+(token)+" ";
      }
      if((token.equals("*"))||(token.equals("+"))||(token.equals("-"))||(token.equals("/"))){
        operand = operand +1;
     
        if (operand==1){
          important = token;
        }
        
        if(((token.equals("-"))||(token.equals("+")))&&((important.equals("*"))||(important.equals("/")))){
          truth=false;
          while(truth!=true)
          {
         postfix=postfix+(s.pop())+" ";
        }
      }
        else{
          truth=true;
        }
         s.push(token);
        }
  
      
      if(token.equals("(")) //LEFT PAREN
      {
        s.push(token);
      }
      
      else if(token.equals(")")) //RIGHT PAREN
         {
        while(!((s.peek()).equals("(")))
                {
          postfix=postfix+(s.pop())+" ";
        }
        s.pop();
      }
         }
while(!(s.empty()))
{
  postfix=postfix+(s.pop())+" ";
}
return postfix;
 }

 
    private class ButtonHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource() == Postfix)
      {
        expression =postfixx.getText();
        String resultPost = ConvertInfix();
        evaluate.setText(resultPost);
      }
      
      if(e.getSource() == Evaluate)
      {
       int stuff = Evaluate(postfix);
       String resultEvaluate=Integer.toString(stuff);
       result.setText(resultEvaluate);
      }
      
      if(e.getSource() == Clear)
      {
        postfixx.setText("");
        evaluate.setText("");
        result.setText("");
      }
      
      if(e.getSource() == Exit)
      {
        System.exit(0);
      }
    } 
    }
 
}
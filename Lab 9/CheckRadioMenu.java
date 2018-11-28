//Zoe Lavoie
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class CheckRadioMenu extends JFrame
{
  private JCheckBox bold; //FONT FORMAT
  private JCheckBox italic;
  private JRadioButton TimesNewRoman; //FONTS
  private JRadioButton Arial;
  private JRadioButton Courier;
  private ButtonGroup buttongroup; //Button Group
  private JLabel DisplayedFormat; //JLabel for next to text
  private JTextArea t;
  private JScrollPane pane;
  private JPanel panel;
  
  private JMenuBar menuBar;
  private JMenu fileMenu, editMenu;
  private JMenuItem openMenuItem, saveMenuItem, newMenuItem, copyMenuItem, cutMenuItem, pasteMenuItem;
  
  
  public CheckRadioMenu()
  {
     setTitle("Toy Editor");
     setBounds(0,0,700,700);
     
     JPanel p = new JPanel(); //Panel Created
     p.setLayout(new FlowLayout()); //Layout
     bold = new JCheckBox("Bold"); //Font Option Created
     italic = new JCheckBox("Italic");//Font Option Created
     p.add(bold); //Add Option:Bold
     p.add(italic);//Add Option:Italic
     
     DisplayedFormat = new JLabel("Text Format");
     p.add(DisplayedFormat);
     
     TimesNewRoman = new JRadioButton("Times New Roman", true);  //Default
     Arial = new JRadioButton("Arial", false); //Button Option
     Courier = new JRadioButton("Courier", false);//Button Option
     
     buttongroup = new ButtonGroup(); //Add Font Buttons
     buttongroup.add(TimesNewRoman);
     buttongroup.add(Arial);
     buttongroup.add(Courier);
     
     p.add(TimesNewRoman); 
     p.add(Arial);
     p.add(Courier);
     add(p, BorderLayout.SOUTH);

     panel = new JPanel();
     t = new JTextArea(25,50);
     pane = new JScrollPane(t,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS); //Scroll Bars
     panel.add(pane);
     add(panel, BorderLayout.CENTER); 
     
     bold.addItemListener(new CheckBoxHandler()); //Creates Handlers for all Radio Buttons
     italic.addItemListener(new CheckBoxHandler());
     TimesNewRoman.addItemListener(new CheckBoxHandler());
     Arial.addItemListener(new CheckBoxHandler());
     Courier.addItemListener(new CheckBoxHandler());
     
setVisible(true); //VISIBILITY
    
menuBar=new JMenuBar();
setJMenuBar(menuBar);

JMenu fileMenu=new JMenu("File");
JMenu editMenu =new JMenu("Edit");
menuBar.add(fileMenu);
menuBar.add(editMenu);

openMenuItem = new JMenuItem("Open");
saveMenuItem= new JMenuItem("Save");
newMenuItem= new JMenuItem("New");
copyMenuItem= new JMenuItem("Copy");
cutMenuItem= new JMenuItem("Cut"); 
pasteMenuItem= new JMenuItem("Paste");

fileMenu.add(openMenuItem);
fileMenu.add(saveMenuItem);
fileMenu.add(newMenuItem);
editMenu.add(copyMenuItem);
editMenu.add(cutMenuItem);
editMenu.add(pasteMenuItem);

openMenuItem.addActionListener(new MenuListener()); 
saveMenuItem.addActionListener(new MenuListener());
newMenuItem.addActionListener(new MenuListener());
copyMenuItem.addActionListener(new MenuListener());
cutMenuItem.addActionListener(new MenuListener());
pasteMenuItem.addActionListener(new MenuListener());
  }
  
private class MenuListener implements ActionListener
{
  public void actionPerformed(ActionEvent e)
  {   
 String cms=e.getActionCommand();
 if (e.getSource() instanceof JMenuItem)
 {  
  if(cms.equals("Open"))
  {
Object files = JOptionPane.showInputDialog(null, "Enter File Name");
  String name = (String) files;
 try
 {
    FileReader in = new FileReader(name);
    t.read(in, null);
    in.close();
 }catch(Exception x){
   JOptionPane.showMessageDialog(null,"File not Found","Input Error", JOptionPane.ERROR_MESSAGE);
 }
  }
    
  if(cms.equals("Save"))
  {
  Object saves = JOptionPane.showInputDialog(null, "Enter File Name");  
  String fileName = (String) saves;
  try
  {
 FileWriter out = new FileWriter(fileName);
 t.write(out);
 out.close();
  }catch(Exception y){
   JOptionPane.showMessageDialog(null,"File not Found","Input Error", JOptionPane.ERROR_MESSAGE);
 }
  }
    
  if(cms.equals("New")) //EDIT MENU: New
  {
    t.setText(" ");
  }
  
  if(cms.equals("Copy")) //EDIT MENU: Copy
  {
    t.copy();
  }
  if(cms.equals("Cut")) //EDIT MENU: Cut
  {
    t.cut();
  }
  if(cms.equals("Paste")) //EDIT MENU: Paste
  {
    t.paste();
  }
 }
  }
}
  
  private class CheckBoxHandler implements ItemListener //Deals with Actions related to Text Format
  {
    public void itemStateChanged(ItemEvent e)
    {
      {
        int selection= 0;
        if (bold.isSelected())
        {
          selection = Font.BOLD;
        }
        if (italic.isSelected())
        {
          selection = selection + Font.ITALIC;
        }
        t.setFont(new Font("Arial", selection, 12));
       
         if (TimesNewRoman.isSelected())
        {
           t.setFont(new Font("TimesNewRoman", selection, 12));
         }
         else if (Arial.isSelected())
        {
           t.setFont(new Font("Arial", selection, 12));
         }
         else
        {
           t.setFont(new Font("Courier", selection, 12));
         }
       }
      }
}
  
  public static void main (String [] args)
{
  CheckRadioMenu c = new CheckRadioMenu();
}
}       
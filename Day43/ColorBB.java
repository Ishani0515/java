import java.awt.*;
import java.awt.event.*;
class ColorBB extends Frame implements ActionListener,WindowListener
{
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    Label l;
    ColorBB()
     {
        setSize(400,300);
        b1=new Button();
        b1.setBackground(Color.red);
        b2=new Button();
        b2.setBackground(Color.yellow);
	b3=new Button();
        b3.setBackground(Color.cyan);
b4=new Button();
        b4.setBackground(Color.black);
	b5=new Button();
        b5.setBackground(Color.orange);
        b6=new Button();
        b6.setBackground(Color.blue);
	b7=new Button();
        b7.setBackground(Color.pink);
        b8=new Button();
        b8.setBackground(Color.green);
         l=new Label();
        setLayout(null);
        b1.setBounds(20,80,80,20);
        b2.setBounds(20,110,80,20);
	b3.setBounds(20,140,80,20);
        b4.setBounds(20,170,80,20);
b5.setBounds(20,200,80,20);
        b6.setBounds(20,230,80,20);
	b7.setBounds(20,260,80,20);
        b8.setBounds(20,290,80,20);
        l.setBounds(110,100,200,100);
        b1.addActionListener(this);
        b2.addActionListener(this);
	 b3.addActionListener(this);
        b4.addActionListener(this);
	b5.addActionListener(this);
        b6.addActionListener(this);
	 b7.addActionListener(this);
        b8.addActionListener(this);
        addWindowListener(this);
add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(l);
      setVisible(true);
     }
    public void actionPerformed(ActionEvent e)
    {
          if(e.getSource()==b1)
          {
             l.setBackground(Color.red);
          }
         else if(e.getSource()==b2)
         {
            l.setBackground(Color.yellow);
         }
	else if(e.getSource()==b3)
         {
            l.setBackground(Color.cyan);
         }
	else if(e.getSource()==b4)
         {
l.setBackground(Color.black);
         }
	else if(e.getSource()==b5)
         {
            l.setBackground(Color.orange);
         }
	else if(e.getSource()==b6)
         {
            l.setBackground(Color.blue);
         }
	else if(e.getSource()==b7)
         {
            l.setBackground(Color.pink);
         }
	else if(e.getSource()==b8)
         {
            l.setBackground(Color.green);
         }
    }
public void windowOpened(WindowEvent e)
    {
          System.out.println("Opened..");
    }
 public void windowClosed(WindowEvent e)
   {} 
 public void windowClosing(WindowEvent e)
   {
        System.exit(0);
   }
 public void windowActivated(WindowEvent e)
   {     System.out.println("Activated..");}
 public void windowDeactivated(WindowEvent e)
   {     System.out.println("Deactivated..");}
 public void windowIconified(WindowEvent e)
   {
System.out.println("Minimized..");
  }
 public void windowDeiconified(WindowEvent e)
  {}

   public static void main(String args[])
   {
      ColorBB ob=new ColorBB();
   }
}
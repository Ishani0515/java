import java.awt.*;
import java.awt.event.*;
class Main extends Frame implements ActionListener
{
   Button b1,b2;
   Main()
   {
      setSize(400,300);
      b1=new Button("Red");
      b2=new Button("Blue");
      setLocation(550,200);
      setLayout(null);
      b1.setBounds(10,40,100,20);
      b2.setBounds(10,265,100,20);
       add(b1);add(b2);
      b1.addActionListener(this);
      b2.addActionListener(this);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {
       if(e.getSource()==b1)
        {
           Red r= new Red();
           r.setLocation(10,20);
        }
       if(e.getSource()==b2)
         {
            Blue b=new Blue();
            b.setLocation(10,450);
         }
   }
   public static void main(String args[])
   {
      Main ob=new Main();
   }  
}

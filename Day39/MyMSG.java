import java.awt.*;
import java.awt.event.*;
class MyMSG extends Frame implements ActionListener
{
   Button b1,b2;
   MyMSG()
   {
      setSize(400,300);
      b1=new Button("Hello");
      b2=new Button("Hi");
      setLayout(null);
      b1.setBounds(150,100,100,20);
      b2.setBounds(150,130,100,20);
       add(b1);
       add(b2);
      b1.addActionListener(this);
      b2.addActionListener(this);
      setVisible(true);
   }
public void actionPerformed(ActionEvent e)
   {
         System.out.println("\r"+e.getActionCommand()+" Student");
    }
   public static void main(String args[])
   {
      MyMSG ob=new MyMSG();
   }   
}
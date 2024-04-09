import java.awt.*;
import java.awt.event.*;
class MyDT extends Frame implements ActionListener
{
   Button b;
   MyDT()
   {
      setSize(400,300);
      b=new Button("PrintDate");
      setLayout(null);
      b.setBounds(150,100,100,20);
       add(b);
      b.addActionListener(this);
      setVisible(true);
   }
public void actionPerformed(ActionEvent e)
   {
        java.util.Date d=new java.util.Date();
         
         System.out.println(d);
   }
   public static void main(String args[])
   {
      MyDT ob=new MyDT();
   }   
}
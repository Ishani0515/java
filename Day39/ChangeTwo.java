import java.awt.*;
import java.awt.event.*;
class ChangeTwo extends Frame implements ActionListener
{
   Button b1,b2;
   ChangeTwo()
   {
      setSize(400,300);
      b1=new Button("Red");
      b2=new Button("Green");
      setLayout(null);
      b1.setBounds(150,100,100,20);
      b2.setBounds(150,130,100,20);
       add(b1);add(b2);
      b1.addActionListener(this);
      b2.addActionListener(this);
      setVisible(true);
   }
public void actionPerformed(ActionEvent e)
   {
       if(e.getSource()==b1)
       setBackground(Color.red);
       if(e.getSource()==b2)
         setBackground(Color.green);
   }
   public static void main(String args[])
   {
      ChangeTwo ob=new ChangeTwo();
   }   
}
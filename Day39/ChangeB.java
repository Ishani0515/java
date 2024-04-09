import java.awt.*;
import java.awt.event.*;
class ChangeB extends Frame implements ActionListener
{
   Button b;
   ChangeB()
   {
      setSize(400,300);
      b=new Button("Red");
      setLayout(null);
      b.setBounds(150,100,100,20);
       add(b);
      b.addActionListener(this);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {
       setBackground(Color.red);
   }
public static void main(String args[])
   {
      ChangeB ob=new ChangeB();
   }   
}
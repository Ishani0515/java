import java.awt.*;
import java.awt.event.*;
class MyWins extends Frame implements ActionListener
{
   Button b;
   MyWins()
   {
      setSize(400,300);
      b=new Button("ClickMe");
      setLayout(null);
      b.setBounds(150,100,100,20);
       add(b);
      b.addActionListener(this);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {
         System.out.println("I am clicked..");
   }
   public static void main(String args[])
   {
      MyWins ob=new MyWins();
}
}
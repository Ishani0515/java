import java.awt.*;
import java.awt.event.*;
class WinClose extends Frame implements ActionListener
{
   Button b;
   WinClose()
   {
      setSize(400,300);
      b=new Button("Close");
      setLayout(null);
      b.setBounds(150,100,100,20);
       add(b);
      b.addActionListener(this);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {
       setVisible(false);
   }
   public static void main(String args[])
   {
      WinClose ob=new WinClose();
   }   
}
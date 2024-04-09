import java.awt.*;
import java.awt.event.*;
class SizeChange extends Frame implements ActionListener
{
   Button b,r;
   SizeChange()
   {
      setSize(400,300);
      b=new Button("Resize");
      r=new Button("Reset");
      setLayout(null);
      b.setBounds(150,100,100,20);
      r.setBounds(150,130,100,20);
       add(b);add(r);
      b.addActionListener(this);
      r.addActionListener(this);
      setVisible(true);
   }
public void actionPerformed(ActionEvent e)
   {
       if(e.getSource()==b)
         setSize(600,400);
       if(e.getSource()==r)
         setSize(400,300);
   }
   public static void main(String args[])
   {
      SizeChange ob=new SizeChange();
   }   
}
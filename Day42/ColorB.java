
import java.awt.event.*;
import java.awt.*;
class ColorB extends Frame implements ActionListener
{
    Button b1,b2;
    Label l;
    ColorB()
     {
        setSize(400,300);
        b1=new Button();
        b1.setBackground(Color.red);
        b2=new Button();
        b2.setBackground(Color.yellow);
         l=new Label();
        setLayout(null);
b1.setBounds(20,80,80,20);
        b2.setBounds(20,110,80,20);
        l.setBounds(110,100,200,100);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);add(b2);add(l);
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
    }
public static void main(String args[])
   {
      ColorB ob=new ColorB();
   }
}

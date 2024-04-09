import java.awt.*;
import java.awt.event.*;
class CheckB extends Frame implements ItemListener
{
    Checkbox c1,c2;
    CheckB()
    {
          setSize(400,300);
          c1=new Checkbox("English");
          c2=new Checkbox("Hindi");
          c1.addItemListener(this);
          c2.addItemListener(this);
         setLayout(null);
         c1.setBounds(50,60,100,20);
         c2.setBounds(50,90,100,20);
         add(c1);add(c2);
        setVisible(true);
    }
public void itemStateChanged(ItemEvent e)
   {
          System.out.println((String)e.getItem());
   }
   public static void main(String args[])
   {
      CheckB ob=new CheckB();        
   }
}
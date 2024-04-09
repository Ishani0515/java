import java.awt.*;
import java.awt.event.*;
class MyClick extends Frame
{
     MyClick()
     {
         setSize(400,300);
          MClick ob=new MClick();
         addMouseListener(ob);
         setVisible(true);
     }
     class MClick extends MouseAdapter
      {
         public void mouseClicked(MouseEvent e)
          {
            setBackground(Color.red);
          }
       }
    public static void main(String args[])
    {
      MyClick ob1=new MyClick();
    }
}
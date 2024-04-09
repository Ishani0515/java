import java.awt.*;
import java.awt.event.*;
class MouseBack extends Frame implements MouseListener
{
   MouseBack()
   {
      setSize(400,300);
      addMouseListener(this);
      setVisible(true);
   }
   public void mouseClicked(MouseEvent e)
   {
      if(e.getClickCount()==1)
              setBackground(Color.blue);
      else if(e.getClickCount()==2)
         setBackground(Color.red);
      else if(e.getClickCount()==3)
         setBackground(Color.green);
    }
public void mousePressed(MouseEvent e)
   {
    }
   public void mouseReleased(MouseEvent e)
   {
    }
   public void mouseEntered(MouseEvent e)
   {
    }
   public void mouseExited(MouseEvent e)
   {
    }
   public static void main(String args[])
   {
      MouseBack ob=new MouseBack();
   }   
}
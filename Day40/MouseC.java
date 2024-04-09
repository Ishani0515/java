import java.awt.*;
import java.awt.event.*;
class MouseC extends Frame implements MouseListener
{
   MouseC()
   {
      setSize(400,300);
      addMouseListener(this);
      setVisible(true);
   }
   public void mouseClicked(MouseEvent e)
   {
      System.out.println("Click count="+e.getClickCount());
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
      MouseC ob=new MouseC();
   }   
}
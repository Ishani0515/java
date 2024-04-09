import java.awt.*;
import java.awt.event.*;
class PrintXY extends Frame implements MouseListener
{
   PrintXY()
   {
      setSize(400,300);
      addMouseListener(this);
      setVisible(true);
   }
   public void mouseClicked(MouseEvent e)
   {
      System.out.println("x="+e.getX()+" y="+e.getY());
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
      PrintXY ob=new PrintXY();
   }   
}
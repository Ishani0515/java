import java.awt.*;
import java.awt.event.*;
class Mouse extends Frame implements MouseListener
{
   Mouse()
   {
      setSize(400,300);
      addMouseListener(this);
      setVisible(true);
   }
   public void mouseClicked(MouseEvent e)
   {
      System.out.println("Mouse Clicked..");
    }
   public void mousePressed(MouseEvent e)
   {
        System.out.println("Pressed..");
    }
public void mouseReleased(MouseEvent e)
   {
       System.out.println("Released..");
    }
   public void mouseEntered(MouseEvent e)
   {
       System.out.println("Entered..");
       setBackground(Color.red);
    }
   public void mouseExited(MouseEvent e)
   {
      System.out.println("Exited..");
      setBackground(Color.white);
    }
   public static void main(String args[])
   {
      Mouse ob=new Mouse();
   }   
}
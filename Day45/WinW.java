import java.awt.*;
import java.awt.event.*;
class WinW extends Frame implements MouseWheelListener
{
     WinW()
     {
       setSize(300,300);
       addMouseWheelListener(this);
       setVisible(true);
     }
     public void mouseWheelMoved(MouseWheelEvent e)
     {
           System.out.println(e.getWheelRotation());
     }
    public static void main(String args[])
    {
       WinW ob=new WinW();
    }
}
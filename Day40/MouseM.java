import java.awt.*;
import java.awt.event.*;
class MouseM extends Frame implements MouseMotionListener
{
    MouseM()
    {
       setSize(300,300);
       addMouseMotionListener(this);
       setVisible(true);
    }
    public void mouseMoved(MouseEvent e)
    {
        System.out.println("Moved... ");
    }
    public void mouseDragged(MouseEvent e)
    {
       System.out.println("Dragged.");
    }
    public static void main(String args[])
    {
        MouseM ob=new MouseM();
    }
}
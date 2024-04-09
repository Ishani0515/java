import java.awt.*;
import java.awt.event.*;
class MouseXY extends Frame implements MouseMotionListener
{
    MouseXY()
    {
       setSize(300,300);
       addMouseMotionListener(this);
       setVisible(true);
    }
    public void mouseMoved(MouseEvent e)
    {
        System.out.println("x= "+e.getX()+" y="+e.getY());
    }
    public void mouseDragged(MouseEvent e)
    {
       System.out.println("Dragged.");
    }
    public static void main(String args[])
    {
MouseXY ob=new MouseXY();
    }
}
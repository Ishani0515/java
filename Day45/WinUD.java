import java.awt.*;
import java.awt.event.*;
class WinUD extends Frame implements MouseWheelListener
{
   int x=50,y=50;
     WinUD()
     {
       setSize(300,300);
       setLocation(x,y);
       addMouseWheelListener(this);
       setVisible(true);
     }
     public void mouseWheelMoved(MouseWheelEvent e)
     {
           if(e.getWheelRotation()>=-1)
            setLocation(x,y+=10);
           if(e.getWheelRotation()>=1)
            setLocation(x,y-=10);
     }
public static void main(String args[])
    {
       WinUD ob=new WinUD();
    }
}
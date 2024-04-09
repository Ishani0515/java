import java.awt.*;
import java.awt.event.*;
class WinZ extends Frame implements MouseWheelListener
{
   int w=300,d=300;
     WinZ()
     {
       setSize(w,d);
       addMouseWheelListener(this);
       setVisible(true);
     }
     public void mouseWheelMoved(MouseWheelEvent e)
     {
           if(e.getWheelRotation()==-1)
            setSize(w+=10,d+=10);
           if(e.getWheelRotation()==1)
            setSize(w-=10,d-=10);
     }
    public static void main(String args[])
    {
WinZ ob=new WinZ();
    }
}
import java.awt.*;
import java.awt.event.*;
class WinBack extends Frame
{
     WinBack()
     {
         setSize(400,300);
        addKeyListener(new KeyAdapter()
        { 
         public void keyPressed(KeyEvent e)
          {
             setBackground(Color.blue);
          }
         public void keyReleased(KeyEvent e)
          {
             setBackground(Color.white);
          }
      });
         setVisible(true);
     }
     public static void main(String args[])
    {
WinBack ob1=new WinBack();
    }
}
import java.awt.*;
import java.awt.event.*;
class MyWin extends Frame
{
     MyWin()
     {
         setSize(400,300);
          WinC ob=new WinC();
          WinP ob1=new WinP();
         addKeyListener(ob1);
         addWindowListener(ob);
         setVisible(true);
     }
class WinC extends WindowAdapter
      {
         public void windowClosing(WindowEvent e)
          {
             System.exit(0);
          }
      }
     class WinP extends KeyAdapter
     {
            public void keyPressed(KeyEvent e)
            {
               setBackground(Color.black);
            }
            public void keyReleased(KeyEvent e)
            {
               setBackground(Color.white);
            }
     }
public static void main(String args[])
    {
      MyWin ob2=new MyWin();
    }
}
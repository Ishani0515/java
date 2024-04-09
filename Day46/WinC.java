import java.awt.*;
import java.awt.event.*;
class WinC extends Frame
{
     WinC()
     {
         setSize(400,300);
 addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
         setVisible(true);
     }
     public static void main(String args[])
    {
      WinC ob1=new WinC();
    }
}
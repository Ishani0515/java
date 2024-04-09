import java.awt.*;
import java.awt.event.*;
class KeyAct extends Frame
{
     KeyAct()
     {
         setSize(400,300);
          KPress ob=new KPress();
         addKeyListener(ob);
         setVisible(true);
     }
     class KPress extends KeyAdapter
      {
         public void keyPressed(KeyEvent e)
          {
            System.out.println("Pressed -"+e.getKeyChar());
          }
       }
    public static void main(String args[])
    {
      KeyAct ob1=new KeyAct();
    }
}
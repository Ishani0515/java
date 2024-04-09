import java.awt.*;
import java.awt.event.*;
class WinAct extends Frame implements WindowListener
{
   int x=50,y=70;
   WinAct()
   {
      setSize(300,300);
      setLocation(x,y);
      addWindowListener(this);  
     setVisible(true);      
   }
    public void windowOpened(WindowEvent e)
    {
          System.out.println("Opened..");
    }
 public void windowClosed(WindowEvent e)
   {
      System.out.println("Closed..");
   }
 public void windowClosing(WindowEvent e)
   {
        System.exit(0);
   }
 public void windowActivated(WindowEvent e)
   {     System.out.println("Activated..");}
 public void windowDeactivated(WindowEvent e)
   {     System.out.println("Deactivated..");}
 public void windowIconified(WindowEvent e)
   {
            System.out.println("Minimized..");
  }
 public void windowDeiconified(WindowEvent e)
  {}

    public static void main(String args[])
   {
      WinAct ob=new WinAct();
   }
}
import java.awt.*;
import java.awt.event.*;
class KeyDemo extends Frame implements KeyListener
{
    KeyDemo()
     {
        setSize(400,300);
        addKeyListener(this);
        setVisible(true);
     }
    public void keyPressed(KeyEvent e)
    {
        System.out.println("pressed.");
     }
    public void keyReleased(KeyEvent e)
    {
      System.out.println("Released..");
    }
   public void keyTyped(KeyEvent e)
   {
     System.out.println("Typed...");
    }
public static void main(String args[])
   {
      KeyDemo ob=new KeyDemo();
   }
}
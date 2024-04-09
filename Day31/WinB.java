import java.awt.*;
class WinB extends Frame
{
  WinB()
  {
    setSize(300,200);
     Button b=new Button("OK");
     add(b);  		     //add button to frame window
    setVisible(true);
   }
   public static void main(String args[])
   {
     WinB ob=new WinB();
    }
}
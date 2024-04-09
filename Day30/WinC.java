import java.awt.*;
class WinC extends Frame
{
   WinC(String t)
   {
       setSize(300,300);
       setTitle(t);
       setVisible(true);
   }
  public static void main(String args[])
  {
    WinC ob=new WinC(args[0]);
  }
}
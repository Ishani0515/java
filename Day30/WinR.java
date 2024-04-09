import java.awt.*;
class WinR extends Frame
{
   WinR()
   {
       setSize(300,300);
       setLocation(550,250);
       setBackground(Color.blue);
       setResizable(false);
       setVisible(true);
   }
  public static void main(String args[])
  {
    WinR ob=new WinR();
  }
}
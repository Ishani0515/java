import java.awt.*;
class BlueWin extends Frame
{
    BlueWin()
    {
      setSize(300,200);
      setBackground(Color.BLUE);
      setCursor(WAIT_CURSOR);
      setVisible(true);
    }
   public static void main(String args[])
   {
     BlueWin w1=new BlueWin();
   }
}
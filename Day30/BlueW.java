import java.awt.*;
class BlueW extends Frame
{
    BlueW()
    {
      setSize(300,200);
      setBackground(Color.BLUE);
      setCursor(MOVE_CURSOR);
      setVisible(true);
    }
   public static void main(String args[])
   {
     BlueW w1=new BlueW();
     BlueW w2=new BlueW();
   }
}
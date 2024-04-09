import java.awt.*;
class HandCur 
{
   public static void main(String args[])
   {
       Frame f=new Frame();
        f.setSize(300,200);
        f.setBackground(Color.gray);
        f.setCursor(Frame.HAND_CURSOR);
       f.setVisible(true);
   }
}
import java.awt.*;
class MultiWin extends Frame
{
    MultiWin(String title, int w,int h)
    {
      setSize(w,h);
      setTitle(title);
      setBackground(Color.BLUE);
      setVisible(true);
    }
   public static void main(String args[])
   {
     MultiWin w1=new MultiWin("First",300,200);
     MultiWin w2=new MultiWin("Second",500,400);
   }
}
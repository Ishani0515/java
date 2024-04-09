import java.awt.*;
class MWin extends Frame
{
   MWin(int x,int y,Color c)
   {
       setSize(300,200);
       setBackground(c);
       setLocation(x,y);
       setVisible(true);
    }
   public static void main(String args[])
   {
       MWin w1=new MWin(10,40,Color.red);
       MWin w2=new MWin(320,40,Color.blue);
       MWin w3=new MWin(630,40,Color.yellow);
    }
}
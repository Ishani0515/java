import java.awt.*;
class TwoLine extends Frame
{
   TwoLine()
   {
       setSize(300,300);
       setVisible(true);
   }
   public void paint(Graphics g)
   {
      g.drawLine(40,100, 150,100);
      g.drawLine(40,120,150,120);
   }
   public static void main(String args[])
   {
       TwoLine ob=new TwoLine();
   }
}
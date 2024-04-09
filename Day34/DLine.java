import java.awt.*;
class DLine extends Frame
{
   DLine()
   {
       setSize(300,300);
       setVisible(true);
   }
   public void paint(Graphics g)
   {
      g.drawLine(40,100, 150,100);
   }
   public static void main(String args[])
   {
       DLine ob=new DLine();
   }
}
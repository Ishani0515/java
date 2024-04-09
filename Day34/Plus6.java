
import java.awt.*;
class  Plus6 extends Frame
{
   Plus6 ()
   {
       setSize(300,300);
       setVisible(true);
   }
   public void paint(Graphics g)
   {
      g.drawLine(40,100, 150,100);
      g.drawLine(95,50,95,150);
   }
   public static void main(String args[])
   {
      Plus6 ob=new  Plus6();
   }
}

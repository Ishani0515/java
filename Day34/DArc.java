import java.awt.*;
class DArc extends Frame
{
   DArc()
   {
       setSize(300,300);
       setVisible(true);
   }
   public void paint(Graphics g)
   {
      g.drawArc(40,100,250,100,60,60);
   }
   public static void main(String args[])
   {
       DArc ob=new DArc();
   }
}
import java.awt.*;
class DispN extends Frame
{
   DispN()
   {
       setSize(300,300);
       setVisible(true);
   }
   public void paint(Graphics g)
   {
      g.setColor(Color.red);
      g.drawString("Trident Academy", 50,100);
      g.drawString("Engineering College",50,130);
   }
   public static void main(String args[])
   {
       DispN ob=new DispN();
   }
}
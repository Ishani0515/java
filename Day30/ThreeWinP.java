import java.awt.*;
class ThreeWinP
{
   public static void main(String args[])
   {
     Frame f=new Frame("Window1");
     f.setSize(300,300);
     f.setBackground(Color.green);
     f.setLocation(100,200);
     f.setVisible(true);
     Frame f1=new Frame("Window2");
     f1.setSize(300,300);
     f1.setBackground(Color.blue);
     f1.setLocation(420,200);
     f1.setVisible(true);
     Frame f2=new Frame("Window3");
     f2.setSize(300,300);
     f2.setBackground(Color.red);
     f2.setLocation(740,200);
     f2.setVisible(true);
   }
}

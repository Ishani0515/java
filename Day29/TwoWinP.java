import java.awt.*;
class TwoWinP
{
public static void main(String args[])
{
Frame f=new Frame("Window 1");
f.setSize(300,300);
f.setBackground(Color.green);
f.setLocation(100,200);
f.setVisible(true);
Frame f1=new Frame("Window 2");
f1.setSize(300,300);
f1.setBackground(Color.orange);
f1.setLocation(420,200);
f1.setVisible(true);
}
}
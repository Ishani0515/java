import java.awt.*;
class FiveUndecoratedWin8
{
public static void main(String args[])
{
Frame f=new Frame();
f.setSize(300,200);
f.setBackground(Color.red);
f.setLocation(0,0);
f.setUndecorated(true);
f.setVisible(true);
Frame f1=new Frame();
f1.setSize(300,200);
f1.setBackground(Color.BLUE);
f1.setLocation(0,470);
f1.setUndecorated(true);
f1.setVisible(true);
Frame f2=new Frame();
f2.setSize(300,200);
f2.setBackground(Color.yellow);
f2.setLocation(980,0);
f2.setUndecorated(true);
f2.setVisible(true);
Frame f3=new Frame();
f3.setSize(300,200);
f3.setBackground(Color.green);
f3.setLocation(980,470);
f3.setUndecorated(true);
f3.setVisible(true);
Frame f4=new Frame();
f4.setSize(300,200);
f4.setBackground(Color.cyan);
f4.setLocation(500,240);
f4.setUndecorated(true);
f4.setVisible(true);

}
}
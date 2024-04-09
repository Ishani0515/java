import java.awt.*;
class WinDi
{
public static void main(String args[])
{
Frame f=new Frame("Dialog");
Dialog d=new Dialog(f);
d.setSize(300,300);
d.setVisible(true);
Frame f1=new Frame("Frame");
f1.setSize(300,200);
f1.setVisible(true);
}
}
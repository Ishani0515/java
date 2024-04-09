import java.awt.*;
class YellowRedWin4 
{
public static void main(String args[])
{
Frame f=new Frame("Yellow Window");
f.setSize(300,300);
f.setBackground(Color.yellow);
f.setVisible(true);
f.setLocation(200,300);
Frame f1=new Frame("Red Window");
f1.setSize(300,300);
f1.setBackground(Color.red);
f1.setLocation(400,220);
f1.setVisible(true);
}
}
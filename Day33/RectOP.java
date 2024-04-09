import java.awt.*;
class RectOP extends Frame
{
RectOP()
{
setSize(300,300);
setVisible(true);
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.drawOval(50,60,100,100);
g.setColor(Color.green);
g.drawOval(80,90,200,100);
}
public static void main(String args[])
{
RectOP ob =new RectOP();
}
}
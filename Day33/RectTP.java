import java.awt.*;
class RectTP extends Frame
{
RectTP()
{
setSize(300,300);
setVisible(true);
}
public void paint(Graphics g)
{
g.drawRect(50,60,200,100);
g.drawRect(50,170,200,100);
}
public static void main(String args[])
{
RectTP ob =new RectTP();
}
}
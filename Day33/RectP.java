import java.awt.*;
class RectP extends Frame
{
RectP()
{
setSize(300,300);
setVisible(true);
}
public void paint(Graphics g)
{
g.fillRect(50,60,200,100);
g.setColor(Color.green);
g.fillRect(50,170,200,100);
}
public static void main(String args[])
{
RectP ob=new RectP();
}
}
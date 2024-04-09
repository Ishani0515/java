import java.awt.*;
class OlympicLogo5 extends Frame
{
 OlympicLogo5()
{
setSize(500,500);
setVisible(true);
}
public void paint(Graphics g)
{
g.setColor(Color.blue);
g.drawOval(20,90,100,100);
g.setColor(Color.black);
g.drawOval(130,90,100,100);
g.setColor(Color.red);
g.drawOval(240,90,100,100);
g.setColor(Color.yellow);
g.drawOval(70,120,100,100);
g.setColor(Color.green);
g.drawOval(200,120,100,100);
}
public static void main(String args[])
{
OlympicLogo5 ob =new  OlympicLogo5();
}
}
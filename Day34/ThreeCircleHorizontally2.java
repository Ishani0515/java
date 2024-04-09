import java.awt.*;
class ThreeCircleHorizontally2 extends Frame
{
ThreeCircleHorizontally2()
{
setSize(500,500);
setVisible(true);
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.fillOval(280,90,100,100);
g.setColor(Color.green);
g.fillOval(20,90,100,100);
g.setColor(Color.blue);
g.fillOval(150,90,100,100);
}
public static void main(String args[])
{
ThreeCircleHorizontally2 ob =new ThreeCircleHorizontally2();
}
}

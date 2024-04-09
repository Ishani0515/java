//#draw a smile face
import java.awt.*;
class Smiley extends Frame
{
Smiley()
{
setSize(300,300);
setVisible(true);
}
public void paint(Graphics g)
{
g.setColor(Color.yellow);
g.fillOval(25 ,30,250,250);//face
g.setColor(Color.black);
g.fillOval(55,70,80,80);//left eye
g.setColor(Color.black);
g.fillOval(170,70,80,80);//right eye
g.setColor(Color.black);
g.fillArc(40, 150, 220, 100, 180, 180);//mouth
g.setColor(Color.black);
g.fillOval(147,140,10,40);//nose
}
public static void main(String args[])
{
Smiley ob=new Smiley();
}
}
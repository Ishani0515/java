import java.awt.*;
class  AudiLogo4 extends Frame
{
 AudiLogo4()
{
setSize(500,500);
setVisible(true);
}
public void paint(Graphics g)
{
g.setColor(Color.gray);
g.drawOval(20,90,100,100);
g.setColor(Color.gray);
g.drawOval(90,90,100,100);
g.setColor(Color.gray);
g.drawOval(160,90,100,100);
g.setColor(Color.gray);
g.drawOval(230,90,100,100);
}
public static void main(String args[])
{
 AudiLogo4 ob =new  AudiLogo4();
}
}
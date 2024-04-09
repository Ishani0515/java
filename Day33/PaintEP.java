import java.awt.*;
class PaintEP extends Frame
{
int i=1;
PaintEP()
{
setSize(300,300);
setVisible(true);
}
public void paint(Graphics g)
{
System.out.println("Painted.."+i);
i++;
}
public static void main(String args[])
{
PaintEP ob=new PaintEP();
}
}
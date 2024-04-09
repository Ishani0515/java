import java.awt.*;
class WaitCursorWindow12
{
public static void main(String args[])
{
Frame f=new Frame();
f.setSize(300,200);
f.setBackground(Color.green);
f.setCursor(Frame.WAIT_CURSOR);
f.setVisible(true);
}
}
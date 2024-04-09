import java.awt.*;
class WinBP extends Frame
{
WinBP()
{
setSize(300,200);
Button b=new Button("ok");
add(b);
setVisible(true);
}
public static void main(String args[])
{
WinBP ob=new WinBP();
}
}
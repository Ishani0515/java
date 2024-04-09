import java.awt.*;
class WinMvP extends Frame
{
WinMvP(int r,int g,int b)
{
setSize(300,300);
Color c=new Color(r,g,b);
setBackground(c);
setVisible(true);
}
public static void main(String args[])
{
WinMvP w1=new WinMvP(238,130,238);
WinMvP w2=new WinMvP(0,0,0);
WinMvP w3=new WinMvP(255,255,255);
}
}
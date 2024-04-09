import java.awt.*;
class MWinP extends Frame
{
MWinP(int x,int y,Color c)
{
setSize(300,200);
setBackground(c);
setLocation(x,y);
setVisible(true);
}
public static void main(String args[])
{
MWinP w1=new MWinP(10,40,Color.red);
MWinP w2=new MWinP(320,40,Color.blue);
MWinP w3=new MWinP(630,40,Color.yellow);
}
}


import java.awt.*;
class SevenUndecoratedWin14 extends Frame
{
SevenUndecoratedWin14(int x,int y,Color c)
{
setSize(80,100);
setBackground(c);
setLocation(x,y);
setUndecorated(true);
setVisible(true);
}
public static void main(String args[])
{
SevenUndecoratedWin14 w1=new SevenUndecoratedWin14(0,0,Color.red);
SevenUndecoratedWin14 w2=new SevenUndecoratedWin14(50,0,Color.blue);
SevenUndecoratedWin14 w3=new SevenUndecoratedWin14(100,0,Color.yellow);
SevenUndecoratedWin14 w4=new SevenUndecoratedWin14(160,0,Color.magenta);
SevenUndecoratedWin14 w5=new SevenUndecoratedWin14(200,0,Color.green);
SevenUndecoratedWin14 w6=new SevenUndecoratedWin14(250,0,Color.pink);
SevenUndecoratedWin14 w7=new SevenUndecoratedWin14(300,0,Color.cyan);
}
}

import java.awt.*;
class MultiWinP extends Frame
{
MultiWinP(String title,int w,int h)
{
setSize(w,h);
setTitle(title);
setBackground(Color.BLUE);
setVisible(true);
}
public static void main(String args[])
{
MultiWinP w1=new MultiWinP("First",300,200);
MultiWinP w2=new MultiWinP("Second",500,400);
}
}
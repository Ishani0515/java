import java.awt.*;
class  ThreeUndecoratedWin12
{
public static void main(String args[])
{
Frame f=new Frame();
f.setSize(300,200);
f.setBackground(Color.red);
f.setLocation(0,200);
f.setUndecorated(true);
f.setVisible(true);

Frame f1=new Frame();
f1.setSize(300,200);
f1.setBackground(Color.BLUE);
f1.setLocation(300,200);
f1.setUndecorated(true);
f1.setVisible(true);

Frame f2=new Frame();
f2.setSize(300,200);
f2.setBackground(Color.red);
f2.setLocation(600,200);
f2.setUndecorated(true);
f2.setVisible(true);

}
}


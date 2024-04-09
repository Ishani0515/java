import java.awt.*;
class WinP extends Frame
{
WinP()
{
setSize(300,200);
Button b1=new Button("OK");
setLayout(null);
b1.setBounds(115,90,70,20);//(xaxis,yaxis,width,height)
b1.setBackground(Color.green);
b1.setBackground(Color.blue);
add(b1);
setVisible(true);
}
public static void main(String args[])
{
WinP ob=new WinP();
}
}
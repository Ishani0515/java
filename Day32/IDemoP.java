import java.awt.*;
class IDemoP extends Frame
{
IDemoP()
{
setSize(300,300);
TextField pass=new TextField();
pass.setEchoChar('*');
TextField t=new TextField();
setLayout(null);
pass.setBounds(150,100,100,20);
t.setBounds(150,130,100,20);
add(pass);add(t);
setVisible(true);
}
public static void main(String args[])
{
IDemoP ob=new IDemoP();
}
}
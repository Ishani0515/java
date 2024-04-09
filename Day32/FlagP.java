import java.awt.*;
class FlagP extends Frame
{
FlagP()
{
setSize(400,300);
Label l1=new Label();
Label l2=new Label();
Label l3=new Label();
setLayout(null);
l1.setBounds(150,100,100,20);
l2.setBounds(150,120,100,20);
l3.setBounds(150,140,100,20);
l1.setBackground(Color.orange);
l2.setBackground(Color.white);
l3.setBackground(Color.green);
add(l1);add(l2);add(l3);
setVisible(true);
}
public static void main(String args[])
{
FlagP ob=new FlagP();
}
}
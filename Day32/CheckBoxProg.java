import java.awt.*;
class CheckBoxProg extends Frame
{
CheckBoxProg()
{
setSize(300,300);
Checkbox c1=new Checkbox("English");
Checkbox c2=new Checkbox("Hindi");
Checkbox c3=new Checkbox("Odia");
setLayout(null);
c1.setBounds(50,60,100,20);
c2.setBounds(50,90,100,20);
c3.setBounds(50,120,100,20);
add(c1);add(c2);add(c3);
setVisible(true);
}
public static void main(String args[])
{
CheckBoxProg ob=new CheckBoxProg();
}
}
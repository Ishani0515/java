import java.awt.*;
class GendersP extends Frame
{
GendersP()
{
setSize(300,300);
CheckboxGroup cg=new CheckboxGroup();
Checkbox c1=new Checkbox("Male",cg,true);
Checkbox c2=new Checkbox("Female",cg,false);
Checkbox c3=new Checkbox("Others",cg,false);
setLayout(null);
c1.setBounds(50,60,100,20);
c2.setBounds(50,90,100,20);
c3.setBounds(50,120,100,20);
add(c1);add(c2);add(c3);
setVisible(true);
}
public static void main(String args[])
{
GendersP ob=new GendersP();
}
}
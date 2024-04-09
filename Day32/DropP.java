import java.awt.*;
class DropP extends Frame
{
DropP()
{
setSize(300,300);
Label l=new Label("Choose your favorite Color");
Choice c=new Choice();
c.add("Red");
c.add("Green");
c.add("Blue");
c.add("Pink");
c.add("Yellow");
c.add("Orange");
setLayout(null);
l.setBounds(40,40,200,20);
c.setBounds(50,60,100,20);
add(l);
add(c);
setVisible(true);
}
public static void main(String args[])
{
DropP ob=new DropP();
}
}
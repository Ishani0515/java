import java.awt.*;
class DropYear extends Frame
{
DropYear()
{
setSize(300,300);
Label l=new Label("Choose Birth Year");
Choice c=new Choice();
for(int i=1970;i<=2024;i++)
c.add(""+i);
setLayout(null);
l.setBounds(40,35,200,20);
c.setBounds(50,60,100,20);
add(c);add(l);
setVisible(true);
}
public static void main(String args[])
{
DropYear ob=new DropYear();
}
}
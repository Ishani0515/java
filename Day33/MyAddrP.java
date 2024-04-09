import java.awt.*;
class MyAddrP extends Frame
{
 MyAddrP()
{
setSize(300,200);
Label l=new Label("Enter Address");
TextArea ta=new TextArea();
setLayout(null);
l.setBounds(50,50,150,20);
ta.setBounds(50,80,150,100);
add(l);add(ta);
setVisible(true);
}
public static void main(String args[])
{
new MyAddrP();
}
} 
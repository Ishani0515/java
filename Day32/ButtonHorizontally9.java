import java.awt.*;
class ButtonHorizontally9 extends Frame
{
ButtonHorizontally9()
{
setSize(300,300);
Button b1=new Button("OK");
Button b2=new Button("CANCEL");
Button b3=new Button("APPLY");
setLayout(null);
b1.setBounds(125,145,50,20);
b2.setBounds(50,145,50,20);
b3.setBounds(200,145,50,20);
b1.setBackground(Color.green);
b2.setBackground(Color.red);
b3.setBackground(Color.yellow);
add(b1);
add(b2);
add(b3);
setVisible(true);
}
public static void main(String args[])
{
ButtonHorizontally9 ob =new ButtonHorizontally9();
}
}
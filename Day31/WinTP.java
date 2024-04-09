import java.awt.*;
class WinTP extends Frame
{
WinTP()
{
setSize(300,300);
Button b1= new Button("OK");
Button b2=new Button("Cancel");
setLayout(new FlowLayout());
add(b1);
add(b2);
setVisible(true);
}
public static void main(String args[])
{
WinTP ob=new WinTP();
}
}
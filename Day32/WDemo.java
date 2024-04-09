import java.awt.*;
class WDemo extends Frame
{
   WDemo()
   {
       setSize(400,300);
       Label l1=new Label("Enter name");
       TextField t1=new TextField();
       Label l2=new Label("Enter Password");
       TextField t2=new TextField();
       t2.setEchoChar('.');
       Button b=new Button("Login");
       setLayout(null);
       l1.setBounds(30,100,100,20);
       t1.setBounds(140,100,100,20);
       l2.setBounds(30,130,100,20);
       t2.setBounds(140,130,100,20);
b.setBounds(140,160,80,20);
       add(l1);add(t1);add(l2);add(t2); add(b);
       setVisible(true);
   }
   public static void main(String args[])
   {
      WDemo ob=new WDemo();
   }
}
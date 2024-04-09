import java.awt.*;
class Register extends Frame
{
   Register()
   {
       setSize(400,300);
       Label l1=new Label("Enter Name");
       TextField t1=new TextField();
       setLayout(null);
       l1.setBounds(100,100,90,20);
       t1.setBounds(210,100,90,20);
       add(l1); add(t1); 
       setVisible(true);
   }
   public static void main(String args[])
   {
      Register ob=new Register();
   }
}
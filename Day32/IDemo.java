import java.awt.*;
class IDemo extends Frame
{
   IDemo()
   {
       setSize(400,300);
       TextField pass=new TextField();
       pass.setEchoChar('*');
       TextField t=new TextField();
       setLayout(null);
       pass.setBounds(150,100,100,20);
       t.setBounds(150,130,100,20);
       add(pass);add(t); 
       setVisible(true);
   }
   public static void main(String args[])
   {
      IDemo ob=new IDemo();
   }
}
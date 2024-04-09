import java.awt.*;
class FLDemo extends Frame
{
   FLDemo()
   {
       setSize(400,300);
       Label l1=new Label("Welcome");
       Button b=new Button("OK");
       setLayout(null);
       Font f=new Font("Arial",Font.BOLD,50);
       l1.setBounds(150,100,300,100);
       b.setBounds(150,210,150,60);
        b.setFont(new Font("Arial",Font.ITALIC,30));
       l1.setFont(f);
       add(l1);add(b); 
       setVisible(true);
   }
   public static void main(String args[])
   {
FLDemo ob=new FLDemo();
   }
}
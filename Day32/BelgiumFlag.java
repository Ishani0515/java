import java.awt.*;
class BelgiumFlag extends Frame
{
   BelgiumFlag()
   {
       setSize(400,400);
       Label l1=new Label();
       Label l2=new Label();
       Label l3=new Label();
       setLayout(null);
       l1.setBounds(100,100,60,90);
       l2.setBounds(150,100,60,90);
       l3.setBounds(210,100,60,90);
       l1.setBackground(Color.black);
       l2.setBackground(Color.yellow);
       l3.setBackground(Color.red);  
       add(l1); add(l2);add(l3);
       setVisible(true);
   }
   public static void main(String args[])
   {
    BelgiumFlag ob=new BelgiumFlag();
   }
}
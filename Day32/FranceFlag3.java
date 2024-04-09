import java.awt.*;
class FranceFlag3 extends Frame
{
   FranceFlag3()
   {
       setSize(400,400);
       Label l1=new Label();
       Label l2=new Label();
       Label l3=new Label();
       setLayout(null);
       l1.setBounds(100,100,60,90);
       l2.setBounds(150,100,60,90);
       l3.setBounds(210,100,60,90);
       l1.setBackground(Color.BLUE);
       l2.setBackground(Color.white);
       l3.setBackground(Color.red);  
       add(l1); add(l2);add(l3);
       setVisible(true);
   }
   public static void main(String args[])
   {
      FranceFlag3 ob=new FranceFlag3();
   }
}
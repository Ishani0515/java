import java.awt.*;
class PolandFlag extends Frame
{
 PolandFlag()
   {
       setSize(400,300);
       Label l1=new Label();
       Label l2=new Label();
       setLayout(null);
       l1.setBounds(150,100,100,20);
       l2.setBounds(150,120,100,20);
       l1.setBackground(Color.white);
       l2.setBackground(Color.red);
       add(l1); add(l2);
       setVisible(true);
   }
   public static void main(String args[])
   {
 PolandFlag ob=new PolandFlag();
   }
}
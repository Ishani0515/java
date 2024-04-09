import java.awt.*;
class UkraineFlag extends Frame
{
 UkraineFlag()
   {
       setSize(400,300);
       Label l1=new Label();
       Label l2=new Label();
       setLayout(null);
       l1.setBounds(150,100,100,20);
       l2.setBounds(150,120,100,20);
       l1.setBackground(Color.BLUE);
       l2.setBackground(Color.yellow);
       add(l1); add(l2);
       setVisible(true);
   }
   public static void main(String args[])
   {
UkraineFlag ob=new UkraineFlag();
   }
}
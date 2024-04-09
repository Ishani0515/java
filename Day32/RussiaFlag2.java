import java.awt.*;
class RussiaFlag2 extends Frame
{
  RussiaFlag2()
   {
       setSize(400,300);
       Label l1=new Label();
       Label l2=new Label();
       Label l3=new Label();
       setLayout(null);
       l1.setBounds(150,100,100,20);
       l2.setBounds(150,120,100,20);
       l3.setBounds(150,140,100,20);
       l1.setBackground(Color.white);
       l2.setBackground(Color.BLUE);
       l3.setBackground(Color.red);  
       add(l1); add(l2);add(l3);
       setVisible(true);
   }
   public static void main(String args[])
   {
      RussiaFlag2 ob=new RussiaFlag2();
   }
}

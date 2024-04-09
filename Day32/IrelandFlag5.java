import java.awt.*;
class IrelandFlag5 extends Frame
{
   IrelandFlag5()
   {
       setSize(400,400);
       Label l1=new Label();
       Label l2=new Label();
       Label l3=new Label();
       setLayout(null);
       l1.setBounds(100,100,60,90);
       l2.setBounds(150,100,60,90);
       l3.setBounds(210,100,60,90);
       l1.setBackground(Color.green);
       l2.setBackground(Color.white);
       l3.setBackground(Color.orange);  
       add(l1); add(l2);add(l3);
       setVisible(true);
   }
   public static void main(String args[])
   {
      IrelandFlag5 ob=new IrelandFlag5();
   }
}



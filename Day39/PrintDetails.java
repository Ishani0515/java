import java.awt.*;
import java.awt.event.*;
class PrintDetails extends Frame implements ActionListener
{
   Button b1,b2;
   Label l1;
   PrintDetails()
   {
      setSize(400,300);
      b1=new Button("Name");
      b2=new Button("Address");
      l1=new Label();
      setLayout(null);
      b1.setBounds(150,100,100,20);
      b2.setBounds(150,130,100,20);
      l1.setBounds(100,160,150,150);
       add(b1);add(b2);add(l1);
      b1.addActionListener(this);
      b2.addActionListener(this);
      setVisible(true);
}
   public void actionPerformed(ActionEvent e)
   {
       if(e.getSource()==b1)
         l1.setText("Name Ram");
       if(e.getSource()==b2)
         l1.setText("Addr:Bhubaneswer");
   }
   public static void main(String args[])
   {
      PrintDetails ob=new PrintDetails();
   }   
}
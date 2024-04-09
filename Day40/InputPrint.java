import java.awt.*;
import java.awt.event.*;
class InputPrint extends Frame implements ActionListener
{
   Button b1;
   Label l1,l2;
   TextField t;
   InputPrint()
   {
      setSize(400,300);
      b1=new Button("show");
      l2=new Label("Enter Name");
      t=new TextField();
      l1=new Label();
      setLayout(null);
l2.setBounds(150,100,100,20);
      t.setBounds(255,100,100,20);
       b1.setBounds(200,130,80,20);
      l1.setBounds(100,160,150,150);
       add(b1);add(t);add(l1);add(l2);
      b1.addActionListener(this);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {
       if(e.getSource()==b1)
         l1.setText("Welcome "+t.getText());
     }
   public static void main(String args[])
   {
      InputPrint ob=new InputPrint();
   }   
}
import java.awt.*;
import java.awt.event.*;
class TextC extends Frame implements ActionListener
{
  Label l1;
  Button b1;
  TextArea tx1;
  String s="";
  TextC()
  {
   setSize(400,400);
   setLayout(null);
   l1=new Label("0 Word");
   b1=new Button("Word");
   l1.setFont(new Font("Arial",Font.BOLD,16));
   tx1=new TextArea();
tx1.setFont(new Font("Arial",Font.BOLD,20));
   l1.setBounds(80,250,100,30);
   tx1.setBounds(60,50,300,200);
   b1.setBounds(100,290,100,20);
   b1.addActionListener(this);
   add(l1);add(tx1);add(b1);
   setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
 {
   s=tx1.getText();
   String word[]=s.split(" ");
   l1.setText(word.length+" Words.."); 
  }
 public static void main(String args[])
 {
   TextC ob=new TextC();
  }
}

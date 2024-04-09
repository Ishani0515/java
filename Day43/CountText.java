import java.awt.*;
import java.awt.event.*;
class CountText extends Frame implements TextListener
{
   TextField t;
   Label l;
   int c=0; 
    CountText()
    {
       setSize(300,300);
       t=new TextField();
       l=new Label("Total Char: "+c);
       setLayout(null);
       t.setBounds(60,60,100,20);
       l.setBounds(30,100,150,20);
       add(t);add(l);
       t.addTextListener(this);
       setVisible(true);
     }
    public void textValueChanged(TextEvent e)
    {
c=t.getText().length();
l.setText("Total Char: "+c);
     }
   public static void main(String args[])
   {
         CountText ob=new CountText();
   }
}
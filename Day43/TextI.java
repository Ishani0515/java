import java.awt.*;
import java.awt.event.*;
class TextI extends Frame implements TextListener
{
   TextField t;
   TextArea ta;
    TextI()
    {
       setSize(300,300);
       t=new TextField();
       ta=new TextArea();
       setLayout(null);
       t.setBounds(60,60,100,20);
       ta.setBounds(50,100,200,150);
       add(t); add(ta);
       t.addTextListener(this);
       setVisible(true);
     }
public void textValueChanged(TextEvent e)
    {
       ta.setText(t.getText());
     }
   public static void main(String args[])
   {
         TextI ob=new TextI();
   }
}
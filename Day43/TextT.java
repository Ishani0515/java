import java.awt.*;
import java.awt.event.*;
class TextT extends Frame implements TextListener
{
   TextField t;
    TextT()
    {
       setSize(300,300);
       t=new TextField();
       setLayout(null);
       t.setBounds(60,60,100,20);
       add(t);
       t.addTextListener(this);
       setVisible(true);
     }
    public void textValueChanged(TextEvent e)
    {
       System.out.println(t.getText());
     }
   public static void main(String args[])
   {
         TextT ob=new TextT();
   }
}
import java.awt.*;
import java.awt.event.*;
class TextLim extends Frame implements TextListener
{
   TextArea ta;
   Label l;
   int c=50;
    TextLim()
    {
       setSize(300,300);
       ta=new TextArea();
       l=new Label("Remaining "+c);
       setLayout(null);
       ta.setBounds(50,30,200,150);
       l.setBounds(50,240,300,20);
       add(l); add(ta);
       ta.addTextListener(this);
       setVisible(true);
     }
    public void textValueChanged(TextEvent e)
    {
       c--;
l.setText("Remaining "+c+" char");
       if(c==0)
          ta.setVisible(false);
     }
   public static void main(String args[])
   {
         TextLim ob=new TextLim();
   }
}
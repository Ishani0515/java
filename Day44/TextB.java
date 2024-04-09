import java.awt.*;
import java.awt.event.*;
class TextB extends Frame implements FocusListener
{
   TextField t;
   TextField t1; 
   Button b;
    TextB()
    {
       setSize(300,300);
       t=new TextField("Enter name");
       b=new Button("Ok");
       t1=new TextField();
       setLayout(null);
       t.setBounds(60,60,100,20);
       t1.setBounds(60,90,100,20);
       b.setBounds(50,130,200,150);
       add(b); add(t);add(t1);
       t.addFocusListener(this);
setVisible(true);
     }
    public void focusGained(FocusEvent e)
    {
     t.setText("");
     }
    public void focusLost(FocusEvent e)
    {
       t.setText(t.getText().toUpperCase());
      }

   public static void main(String args[])
   {
         TextB ob=new TextB();
   }
}
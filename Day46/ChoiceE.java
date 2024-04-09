import java.awt.*;
import  java.awt.event.*;
class ChoiceE extends Frame implements ActionListener
{
     Choice c;
       Button b;
     Label l;
     ChoiceE()
      {
        setSize(400,300);
          c=new Choice();
           l=new Label();
         b=new Button("OK");
         setLayout(null);
         c.setBounds(50,50,100,20); b.setBounds(160,50,80,20);
         l.setBounds(50,150,100,20);
c.add("C++"); c.add("Java"); c.add("C");
        add(c);add(b);add(l);   
       b.addActionListener(this);
        setVisible(true);
      }
     public void actionPerformed(ActionEvent e)
     {
         System.out.println(c.getSelectedIndex());
         l.setText("Selected "+c.getItem(c.getSelectedIndex()));
     }
    public static void main(String args[])
    {
      ChoiceE ob=new ChoiceE();
    }
}
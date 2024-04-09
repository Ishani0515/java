import java.awt.*;
import java.awt.event.*;
class Radio extends Frame implements ItemListener
{
   Checkbox c1,c2;
   CheckboxGroup cg;
    Radio()
    {
       setSize(300,300);
      cg=new CheckboxGroup();
       c1=new Checkbox("Red",cg,false);
       c2=new Checkbox("Green",cg,false);
       setLayout(null);
       c1.setBounds(60,60,100,20);
       c2.setBounds(170,60,100,20);
       add(c1);add(c2);
       c1.addItemListener(this);
       c2.addItemListener(this);
       setVisible(true);
}
    public void itemStateChanged(ItemEvent e)
    {
       String res=(String)e.getItem();
        if(res=="Red")
           setBackground(Color.red);
        if(res=="Green")
          setBackground(Color.green);
         System.out.println(res);
       }
   public static void main(String args[])
   {
         Radio ob=new Radio();
   }
}
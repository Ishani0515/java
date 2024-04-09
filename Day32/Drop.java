import java.awt.*;
class Drop extends Frame
{
    Drop()
    {
        setSize(300,300);
     Label l=new Label("Choose total number of classes");
     Choice c=new Choice();
        c.add("Choose");
	c.add("1");
	c.add("2");
	c.add("3");
	c.add("4");
       setLayout(null);
       l.setBounds(40,40,200,20);
       c.setBounds(50,60,100,20);
       add(l);
       add(c);
       setVisible(true);
    }
   public static void main(String args[])
   {
      Drop ob=new Drop();
   }
}
import java.awt.*;
import java.awt.event.*;
class Bclick extends Frame implements ActionListener
{
    TextField t;
    Label h,r;
    Button b;
    Bclick()
     {
        setSize(400,300);
        t=new TextField();
        h=new Label("Enter Name");
        r=new Label();
        b=new Button("Show");
        setLayout(null);
h.setBounds(50,60,150,20);
        t.setBounds(210,60,100,20);
        b.setBounds(220,100,80,20);
        r.setBounds(200,150,180,30);         
        b.addActionListener(this);
        add(h);add(t);add(r);add(b);
      setVisible(true);
     }
    public void actionPerformed(ActionEvent e)
    {
          if(e.getSource()==b)
          {
             r.setText("Welcome "+t.getText());
          }
    }
   public static void main(String args[])
   {
      Bclick ob=new Bclick();
   }
}
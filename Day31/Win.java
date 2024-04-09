import java.awt.*;
class Win extends Frame
{
  Win()
  {
    setSize(300,200);
     Button b1=new Button("OK");
     setLayout(null);
     b1.setBounds(115,90,70,20);
     b1.setBackground(Color.green);
     b1.setForeground(Color.blue);
     add(b1);  //add button to frame window
     setVisible(true);
   }
   public static void main(String args[])
   {
     Win ob=new Win();
    }
}

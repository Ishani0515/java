import java.awt.*;
class WinT extends Frame
{
  WinT()
  {
    setSize(300,200);
     Button b1=new Button("OK");
     Button b2=new Button("Cancel"); 
     setLayout(new FlowLayout());
     add(b1);  //add button to frame window
     add(b2);
    setVisible(true);
   }
   public static void main(String args[])
   {
     WinT ob=new WinT();
    }
}
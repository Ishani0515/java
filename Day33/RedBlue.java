import java.awt.*;
class RedBlue extends Frame
{
    RedBlue()
    {
       setSize(300,300);
       setVisible(true);
    }
   public void paint(Graphics r)
   {
       r.setColor(Color.red);  
       r.drawRect(50,60,200,100);
       r.setColor(Color.blue);
       r.drawRect(50,170,200,100);
   }
  public static void main(String args[])
  {
      RedBlue ob=new RedBlue();
  }
}
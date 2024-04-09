import java.awt.*;
class IndiaFlag3 extends Frame
{
    IndiaFlag3()
    {
       setSize(300,300);
       setVisible(true);
    }
   public void paint(Graphics g)
   {
       g.setColor(Color.orange);
       g.fillRect(50,60,150,100);
       g.setColor(Color.white);
       g.fillRect(50,90,150,100);
       g.setColor(Color.green);
       g.fillRect(50,120,150,30);
   }
  public static void main(String args[])
  {
     IndiaFlag3 ob=new IndiaFlag3();
   }
}

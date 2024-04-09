import java.awt.*;
class PaintE extends Frame
{
   int i=1;
   PaintE()
    {
       setSize(300,300);
       setVisible(true);
    }
   public void paint(Graphics g)
   {
      System.out.println("Painted.. "+i);
       i++;
   }
  public static void main(String args[])
  {
        PaintE ob=new PaintE();
  }
}
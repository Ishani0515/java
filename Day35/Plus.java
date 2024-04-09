import java.awt.*;
class Plus extends Frame
{
   int x1=95,y1=50,x2=95,y2=150;
   Plus()
   {
       setSize(400,300);
       setVisible(true);
        rotate();
   }
   public void paint(Graphics g)
   {
      g.drawLine(x1,y1,x2,y2);
   }
   void rotate()
   {
     try{
       while(true)
       {
       x1++;y1++;
       x2++;
       Thread.sleep(500);
        repaint();} 
       }catch(InterruptedException e){}
   }
   public static void main(String args[])
   {
      Plus ob=new  Plus();
}}
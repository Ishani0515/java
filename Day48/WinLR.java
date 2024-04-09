import java.awt.*;
class WinLR extends Frame
{
  int x=50,y=50;
   WinLR()
   {
       setSize(300,300);
       setLocation(x,y);
      setVisible(true);
      move();
   }
   void move() 
    {
      try{
         while(true)
         {
             setLocation(x+=5,y+=3);
             Thread.sleep(500);
         }
       }catch(InterruptedException e) {}
    }
   public static void main(String args[])
   {
       WinLR ob=new WinLR();
   }
}
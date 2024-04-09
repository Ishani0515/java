import java.awt.*;
class WinCount extends Frame
{
   Label l; Font f;
   WinCount()
   {
       setSize(300,300);
       l=new Label();
       setLayout(null);
        f=new Font("Arial",Font.BOLD, 100);
        l.setFont(f);  
       l.setBounds(90,80,200,200);
      add(l);
      setVisible(true);
      count();
   }
   void count() 
    {
      try{
          int i=10;
         while(i>=1)
         {
             l.setText(""+i);
             Thread.sleep(1000);
             i--;
if(i==0)
             setVisible(false);
         }
        }catch(InterruptedException e) {}
    }
   public static void main(String args[])
   {
       WinCount ob=new WinCount();
   }
}
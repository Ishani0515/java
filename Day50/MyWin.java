import java.awt.*;
class MyWin extends Frame implements Runnable
{
    int i=0;
     MyWin()
     {
        setSize(300,300);
        setVisible(true);
     }
    public void run()
    {
       while(true)
       {
         try{
          if(i%2==0)
          {
           setBackground(Color.red);
           Thread.sleep(1000);
           }
else
           {
           setBackground(Color.yellow);
           Thread.sleep(1000);
           }
        i++;
          }catch(InterruptedException e){}
       }   
    }
    public static void main(String args[])
    {
       MyWin ob=new MyWin();
       Thread t=new Thread(ob);
       t.start();
    }
}
class PNumber extends Thread
{
   public void run()
   {
      try
       {
        for(int i=1;i<=10;i++)
         {
            System.out.print(" "+i);
            sleep(1000);
         }
       }
       catch(InterruptedException e){}
   }
}
class MySeries
{
     public static void main(String args[])
    {
       PNumber t=new PNumber();
        t.start();
    }
}
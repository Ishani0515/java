class PrintTm implements Runnable
{
    public void run()
    {
             try{
                   java.util.Date d;
                    while(true)
                    {
                      d=new java.util.Date();  
                        System.out.print("\r"+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds()+"  ");
                         Thread.sleep(1000);
                     }
                 }catch(InterruptedException e){}
    }
}
class ViewTm
{
public static void main(String args[])
    {
       PrintTm ob=new PrintTm();
        Thread t=new Thread(ob);
        t.start();        
    }
}
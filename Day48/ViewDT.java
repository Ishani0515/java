class PrintDT implements Runnable
{
    public void run()
    {
             try{
                    while(true)
                    {
                        System.out.println(new java.util.Date());
                         Thread.sleep(1000);
                     }
                 }catch(InterruptedException e){}
    }
}
class ViewDT
{
    public static void main(String args[])
    {
       PrintDT ob=new PrintDT();
        Thread t=new Thread(ob);
        t.start();        
    }
}
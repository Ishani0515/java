class Series
{
    public static void main(String args[])
    {
       try
       {
        for(int i=1;i<=10;i++)
         {
            System.out.print("\r "+i);      
            Thread.sleep(500);
         }
       }
       catch(InterruptedException e){}
    }
}
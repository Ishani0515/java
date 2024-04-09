class Magic
{
   public static void main(String args[])
   {
   while(true)
   {
      try
      {
       
      System.out.print("\rHello       ");
      Thread.sleep(1000);
      System.out.print("\rStudent");
      Thread.sleep(1000);
      System.out.print("\rBye Student");
       Thread.sleep(1000);
      }
      catch(InterruptedException e){}
    }   
 }
}
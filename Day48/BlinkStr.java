class BlinkStr
{
    public static void main(String args[]) throws InterruptedException
    {
        while(true)
         {
            System.out.print("\rWelcome ");
            Thread.sleep(500);
            System.out.print("\r        ");
            Thread.sleep(500);
         }
      }
}
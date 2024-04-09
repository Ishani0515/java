class CheckT
{
   public static void main(String args[])
   {
      try
      {
      System.out.println("Hello");
      Thread.sleep(500);
      System.out.println("Hi");
      Thread.sleep(500);
      System.out.println("Bye");
      }
      catch(InterruptedException e){}
   }
}
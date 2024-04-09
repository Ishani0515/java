class Num extends Thread
{
   public void run()
   {
      System.out.println("Num thread");
   }
}
class MainT
{
   public static void main(String args[])
   {
     new Num().start();
     System.out.println("Main Thread");
   }
}
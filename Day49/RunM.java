class M1 extends Thread
{
   public void run()
   {
      System.out.println("Hello");
      System.out.println(getPriority());
   }
}
class M2 extends Thread
{
   public void run()
   {
      System.out.println("Hi");
      System.out.println(getPriority());
   }
}
class RunM
{
   public static void main(String args[])
   {
       M1 t1=new M1();   //new state
       M2 t2=new M2();   //new state
       t1.setPriority(Thread.MIN_PRIORITY);
       t1.start();   //active state
       t2.start();
}
}
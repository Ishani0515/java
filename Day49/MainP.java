class T1 extends Thread
{
    public void run()
     {
        System.out.println("hello");
     }
}
class T2 extends Thread
{
    public void run()
     {
        System.out.println("Hi");
     }
}
class MainP
{
   public static void main(String args[])
   {
      T1 ob1=new T1();
      T2 ob2=new T2();
       System.out.println(ob1.getPriority());  //5
       System.out.println(ob2.getPriority());  //5
   }
}
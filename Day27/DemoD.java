abstract class MyMethod
{
   int n=10;
   abstract void show();
}
class DemoD extends MyMethod
{
    void show()
    {
       System.out.println("I am show "+n);
    }
   public static void main(String args[])
   {
       DemoD ob=new DemoD();
       ob.show();
   }
}
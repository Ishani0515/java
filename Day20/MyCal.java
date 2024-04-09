class Data
{
   protected int n1=10;
   protected int n2=100;
}
class MyCal extends Data
{
   void sum()
    {
        System.out.println("Result="+(n1+n2));
    }
   public static void main(String args[])
   {
      MyCal ob=new MyCal();
      ob.sum();
   }
}
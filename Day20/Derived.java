class Base
{
    Base()
    {
       System.out.println("Base Constructor");
    }
}
class Derived extends Base
{
    Derived()
     {
         System.out.println("Derived Constructor");
     }
   public static void main(String args[])
   {
      Derived ob=new Derived();
   }
}
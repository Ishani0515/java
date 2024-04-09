abstract class MDummy
{
   abstract void show();
    void disp()
    {
       System.out.println("I am normal method");
    }
}
class User extends MDummy
{
   void show()
   {
         System.out.println("I am show");
   }
   public static void main(String args[])
   {
     User ob=new User();
      ob.disp();
      ob.show();
   }
}
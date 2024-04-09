abstract class Method
{
   abstract void input();
   abstract void show();
   void myDisp()
   {
     System.out.println("I am normal method in abstract class");
   }
}
class Customer extends Method 
{
   void input()
   {
      System.out.println("Input method");
   }
   void show()
   {
       System.out.println("Input method");
   }
   public static void main(String args[])
   {
      Customer ob=new Customer();
       ob.input(); 
       ob.show();
       ob.myDisp(); 
   } 
}
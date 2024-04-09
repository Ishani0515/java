abstract class Value
{
   static void show()
   {
        System.out.print("I am static show");
   }
  abstract void disp();
}
class VDemo 
{
   public static void main(String args[])
   {
       Value.show();  //static method is accessed from abstract class
   }
}
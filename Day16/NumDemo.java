class NumDemo
{
   NumDemo()
   {
     System.out.println("I am Constructor");
   }
   void show()
   {
       System.out.println("I am show method");
   }
   public static void main(String args[])
   {
      new NumDemo().show();           //ananoumous object/object without name
   }
}
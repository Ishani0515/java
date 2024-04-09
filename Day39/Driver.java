class A
{
   void show()
   {
     System.out.println("I am show of A");
   }
}
class B extends A
{
   void show()
   {
     System.out.println("I am show of B");
   }
}
class C extends B
{
   void show()
   {
     System.out.println("I am show of C");
   }
}
class Driver
{
   public static void main(String args[])
   {
      A ob;
A ob1=new A();
ob=ob1;
ob.show();
B ob2=new B();
ob=ob2;
ob.show();
C ob3=new C();
ob=ob3;
ob.show();
   }
}
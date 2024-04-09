class Base
{
   int n=100;
}
class Derived1 extends Base
{
  int n1=200;
}
class Derived2 extends Base
{
  int n2=300;
}
class Derived3 extends Base
{
   int n3=400;
}
class Value
{
   public static void main(String args[])
  {
    Derived1 ob1=new Derived1();
    Derived2 ob2=new Derived2();
    Derived3 ob3=new Derived3();
    System.out.println("n="+ob1.n);
    System.out.println("n1="+ob1.n1);
    System.out.println("n2="+ob2.n2);
    System.out.println("n3="+ob3.n3);
  }
}
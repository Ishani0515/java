class Super
{
  int n1=10;
}
class Middle extends Super
{
  int n2=30;
}
class Derived extends Middle
{
   int n3=40;
   public static void main(String args[])
   {
     Derived ob=new Derived();
     System.out.println("n1="+ob.n1);
     System.out.println("n2="+ob.n2);
     System.out.println("n3="+ob.n3);
   }
}
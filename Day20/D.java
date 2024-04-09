class B
{
   B(int n)
   {
      System.out.println("Constructor B");
   }
}
class C extends B
{
    C(int n)
    { 
      super(11);
      System.out.println("Constructor C");
    }
}
class D extends C
{
    D(int n)
    {
        super(10);
        System.out.println("Constructor D");
    }
   public static void main(String args[])
   {
     D ob=new D(10);
   }
}
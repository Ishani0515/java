class MyBase
{
    int n;float n1;
    MyBase(int n,float n1)
    {  
       this.n=n; this.n1=n1;
        System.out.println("I am parameter constructor of MyBase");
    }
}
class MyDerived extends MyBase
{
    MyDerived()
    {
        super(10,2.5f);
        System.out.println("I am default constructor of MyDerived");
    }
    public static void main(String args[])
    {
      MyDerived ob =new MyDerived();
      System.out.println(ob.n+"  "+ob.n1);
    }
}
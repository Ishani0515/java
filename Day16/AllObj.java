 class AllObj
{
    static int n;
    int c;
    AllObj()
    {
       n++;
       c=n;   
       System.out.println("Object is created...");
    }
   public static void main(String args[])
    {
         AllObj ob1=new AllObj();
         AllObj ob2=new AllObj();
         AllObj ob3=new AllObj();
         System.out.println(ob1.c+"  "+ob2.c+"  "+ob3.c);
         System.out.println(ob1.n+"  "+ob2.n+"  "+ob3.n);
    }
}